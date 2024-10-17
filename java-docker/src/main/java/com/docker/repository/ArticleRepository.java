package com.docker.repository;

import com.docker.entity.ArticleEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends ReactiveCrudRepository<ArticleEntity, String> {
}
