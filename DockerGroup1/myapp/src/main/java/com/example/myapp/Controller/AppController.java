package com.example.myapp.Controller;

import com.example.myapp.Pojo.User;
import com.example.myapp.Reult.Result;
import com.example.myapp.Service.AppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // 允许跨域访问
@Slf4j
public class AppController {
    @Autowired
    private AppService appService;

    @GetMapping("/user/{id}")
    public Result getUserById(@PathVariable Long id) {
        log.info("根据id获取用信息，id是: {}", id);
        User user = appService.getUserById(id);
        return Result.success(user);
    }
}