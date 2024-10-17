package com.docker.service.impl;

import com.docker.dto.ArticleDto;
import com.docker.repository.ArticleRepository;
import com.docker.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    private final WebClient webClient;

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(@Qualifier("webClientExterno") WebClient webClient, ArticleRepository articleRepository) {
        this.webClient = webClient;
        this.articleRepository = articleRepository;
    }

    @Override
    public Mono<ArticleDto> getArticle(String id) {
        return webClient.get()
                .uri("/objects/" + id)
                .retrieve()
                .bodyToMono(ArticleDto.class)
                .doOnNext(articleDto -> log.info("ArticleDto: {}", articleDto));
    }

    @Override
    public Mono<ArticleDto> getArticleDB(String id) {
        return articleRepository.findById(id)
                .switchIfEmpty(Mono.error(new Exception("Article not found")))
                .map(articleEntity -> {
                    ArticleDto articleDto = new ArticleDto();
                    articleDto.setId(articleEntity.getId());
                    articleDto.setName(articleEntity.getName());
                    return articleDto;
                })
                .doOnNext(articleDto -> log.info("ArticleDto: {}", articleDto));
    }
}
