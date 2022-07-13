package com.anctest.link.cutter.service.impl;

import com.anctest.link.cutter.model.Link;
import com.anctest.link.cutter.repository.LinkRepository;
import com.anctest.link.cutter.service.LinkService;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImpl implements LinkService {
    private final LinkRepository linkRepository;

    public LinkServiceImpl(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @Override
    public Long insert(Link link) {
        return linkRepository.save(link).getId();
    }

    @Override
    public Link findByLongUrl(String longUrl) {
        return linkRepository.findByLongUrl(longUrl);
    }

    @Override
    public Link findByShortUrl(String shortUrl) {
        return linkRepository.findByShortUrl(shortUrl);
    }

    @Override
    public String createLink(String longUrl) {
        String shortUrl;
        Link linkFromDb = findByLongUrl(longUrl);
        if (linkFromDb == null) {
            Link link = new Link();
            link.setLongUrl(longUrl);
            link.setShortUrl(getBodyUrl());
            insert(link);
            shortUrl = link.getShortUrl();
        } else {
            shortUrl = linkFromDb.getShortUrl();
        }
        return shortUrl;
    }

    private String getBodyUrl() {
        String[] chars = new String[]{"a", "b", "c", "d", "e", "f", "g", "h",
                "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H",
                "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z"};
        String body = "";
        do {
            for (int i = 0; i < 5; i++) {
                body += chars[new Random().nextInt(62)];
            }
        } while (findByShortUrl(body) != null);
        return body;
    }
}
