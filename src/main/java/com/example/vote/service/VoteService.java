package com.example.vote.service;

import com.example.vote.model.VoteOption;
import com.example.vote.dto.VoteResult;
import com.example.vote.dto.VoteSubmission;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VoteService {
    private Map<Long, VoteOption> options = new HashMap<>(); // 存储选项
    private List<VoteSubmission> submissions = new ArrayList<>(); // 存储投票记录

    public VoteService() {
        // 初始化一些选项
        options.put(1L, new VoteOption(1L, "Option 1"));
        options.put(2L, new VoteOption(2L, "Option 2"));
    }

    public boolean castVote(VoteSubmission voteSubmission) {
        // 示例逻辑: 确保用户没有对同一选项投过票
        for (VoteSubmission submission : submissions) {
            if (submission.getUserId().equals(voteSubmission.getUserId()) &&
                    !submission.getOptionIds().addAll(voteSubmission.getOptionIds())) { // 如果存在交集，则表示已经投过票
                return false; // 用户已经投票
            }
        }

        // 更新选项的票数
        for (Long optionId : voteSubmission.getOptionIds()) {
            VoteOption option = options.get(optionId);
            if (option != null) {
                option.castVote();
            }
        }

        // 保存投票记录
        submissions.add(voteSubmission);
        return true;
    }

    public List<VoteResult> getCurrentVoteResults() {
        List<VoteResult> results = new ArrayList<>();
        for (VoteOption option : options.values()) {
            results.add(new VoteResult(option.getId(), option.getDescription(), option.getVotes()));
        }
        return results;
    }
}
