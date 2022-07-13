package com.anctest.link.cutter.controller;

import com.anctest.link.cutter.model.Link;
import com.anctest.link.cutter.service.LinkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/new")
public class UsingShortUrlController {
    private final LinkService linkService;

    public UsingShortUrlController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/{url}")
    @ApiIgnore
    public RedirectView openShortUrl(@PathVariable String url) {
        Link link = linkService.findByShortUrl(url);
        return new RedirectView(link.getLongUrl());
    }
}
