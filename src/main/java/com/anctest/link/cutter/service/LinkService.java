package com.anctest.link.cutter.service;

import com.anctest.link.cutter.model.Link;

public interface LinkService {
    Long insert(Link link);

    Link findByLongUrl(String longUrl);

    Link findByShortUrl(String shortUrl);

    String createLink(String longUrl);
}
