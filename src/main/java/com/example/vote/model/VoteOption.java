package com.example.vote.model;

public class VoteOption {
    private Long id; // 选项ID
    private String description; // 选项描述
    private int votes = 0; // 票数，默认为0

    public VoteOption(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    // Getter 和 Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    // 为选项增加票数的方法
    public void castVote() {
        this.votes += 1;
    }
}
