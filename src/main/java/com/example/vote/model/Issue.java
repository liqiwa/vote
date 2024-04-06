package com.example.vote.model;

public class Issue {
    private Long id; // 议题ID
    private String description; // 议题描述

    // 构造函数，Getter 和 Setter 省略

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
