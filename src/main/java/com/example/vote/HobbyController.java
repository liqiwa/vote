package com.example.vote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/hobbies")
public class HobbyController {
    @Autowired
    private HobbyService hobbyService;

    @GetMapping
    public List<Hobby> getAllHobbies() {
        return hobbyService.findAllHobbies();
    }

    // 其他控制器方法
    // 通过ID获取爱好
    @GetMapping("/{id}")
    public Hobby getHobbyById(@PathVariable Long id) {
        return hobbyService.findHobbyById(id);
    }

    // 创建或更新爱好
    @PostMapping
    public Hobby createOrUpdateHobby(@RequestBody Hobby hobby) {
        return hobbyService.saveOrUpdateHobby(hobby);
    }

    // 删除爱好
    @DeleteMapping("/{id}")
    public void deleteHobby(@PathVariable Long id) {
        hobbyService.deleteHobby(id);
    }

    // 为爱好投票
    @PostMapping("/{id}/vote")
    public void voteForHobby(@PathVariable Long id) {
        hobbyService.voteForHobby(id);
    }
}
