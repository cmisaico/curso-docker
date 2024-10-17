package com.docker.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("articles")
public class ArticleEntity {
    @Id
    private Integer id;
    private String name;
}
