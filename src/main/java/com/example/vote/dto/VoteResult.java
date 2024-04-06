package com.example.vote.dto;

public class VoteResult {
    private Long optionId; // 投票选项ID
    private String description; // 选项描述
    private Integer votes; // 该选项获得的票数

    // 构造函数
    public VoteResult(Long optionId, String description, Integer votes) {
        this.optionId = optionId;
        this.description = description;
        this.votes = votes;
    }

    // Getter 和 Setter
    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}
