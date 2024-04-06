package com.example.vote.model;

public class Option {
    private Long id; // 选项ID
    private Long issueId; // 所属议题ID
    private String description; // 选项描述

    // 构造函数，Getter 和 Setter 省略


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setIssueId(Long issueId){
        this.issueId=issueId;
    }

    public Long getIssueId() {
        return issueId;
    }
}
