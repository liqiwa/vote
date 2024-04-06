package com.example.vote.dto;

import java.util.List;

public class VoteSubmission {
    private Long userId;
    private List<Long> optionIds; // 用户投票的选项ID列表

    public VoteSubmission(Long userId, List<Long> optionIds) {
        this.userId = userId;
        this.optionIds = optionIds;
    }

    // Getter 和 Setter
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getOptionIds() {
        return optionIds;
    }

    public void setOptionIds(List<Long> optionIds) {
        this.optionIds = optionIds;
    }
}
