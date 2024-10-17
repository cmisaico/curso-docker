package com.docker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleDto {
    private Integer id;
    private String name;
    private Object data;
}
