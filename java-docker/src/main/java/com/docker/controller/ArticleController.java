package com.docker.controller;

import com.docker.dto.ArticleDto;
import com.docker.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/apiJava")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/article/{id}")
    public Mono<ArticleDto> getArticle(@PathVariable String id) {
        return articleService.getArticle(id);
    }


    @GetMapping("/articleDb/{id}")
    public Mono<ArticleDto> getArticleDB(@PathVariable String id) {
        return articleService.getArticleDB(id);
    }


}
