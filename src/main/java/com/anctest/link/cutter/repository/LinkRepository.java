package com.anctest.link.cutter.repository;

import com.anctest.link.cutter.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
    Link findByLongUrl(String longUrl);

    Link findByShortUrl(String shortUrl);
}
