package com.example.vote.model;

import javax.persistence.*;

@Entity
@Table(name="hobbies")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int votes;

    // 构造函数
    public Hobby() {
    }

    // Getter 和 Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) { // 确保有这个方法
        this.votes = votes;
    }

    // Getters and setters
}

