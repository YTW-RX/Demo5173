package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.dao.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * IUserService实现类
 * @author 殷涛文
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getList() {
        return userMapper.getList();
    }
}
