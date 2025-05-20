package com.example.myapp.Service.impl;

import com.example.myapp.Mapper.AppMapper;
import com.example.myapp.Pojo.User;
import com.example.myapp.Service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private AppMapper appMapper;

    /**
     * 根据id获取用户信息
     *
     * @param id
     * @return
     */
    @Override
    public User getUserById(Long id) {
        User user = appMapper.getUserById(id);
        return user;
    }
}
