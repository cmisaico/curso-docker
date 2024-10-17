package com.docker.service;

import com.docker.dto.ArticleDto;
import reactor.core.publisher.Mono;

public interface ArticleService {

    Mono<ArticleDto> getArticle(String id);

    Mono<ArticleDto> getArticleDB(String id);

}
