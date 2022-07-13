package com.anctest.link.cutter.controller;

import com.anctest.link.cutter.service.LinkService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cut")
public class LinkController {
    private final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping
    @ApiOperation(value = "Create a short link to the same resource")
    public String create(@ApiParam(value = "insert long URL")
                         @RequestParam(name = "long-url") String longUrl) {
        String shortLink = linkService.createLink(longUrl);
        return "http://localhost:8080/new/" + shortLink;
    }
}
