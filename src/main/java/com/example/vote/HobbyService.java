package com.example.vote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HobbyService {
    @Autowired
    private HobbyRepository hobbyRepository;

    // 其他业务逻辑方法
    // 获取所有爱好
    public List<Hobby> findAllHobbies() {
        return hobbyRepository.findAll();
    }

    // 通过ID查找爱好
    public Hobby findHobbyById(Long id) {
        return hobbyRepository.findById(id).orElse(null);
    }

    // 增加或更新爱好
    public Hobby saveOrUpdateHobby(Hobby hobby) {
        return hobbyRepository.save(hobby);
    }

    // 删除爱好
    public void deleteHobby(Long id) {
        hobbyRepository.deleteById(id);
    }

    // 为爱好投票
    public void voteForHobby(Long id) {
        Hobby hobby = findHobbyById(id);
        if (hobby != null) {
            hobby.setVotes(hobby.getVotes() + 1);
            hobbyRepository.save(hobby);
        }
    }
}
