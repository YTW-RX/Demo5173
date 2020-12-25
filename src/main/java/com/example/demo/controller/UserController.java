package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 殷涛文
 */
@CrossOrigin
@RequestMapping("/User")
@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    /**
     * 查询用户表信息
     *
     * @return
     */
    @RequestMapping("/getList")
    public Map<String, Object> getList() {
        Map<String, Object> map = new HashMap<>();
        List<User> list = iUserService.getList();
        map.put("success", true);
        map.put("msg", "OK");
        map.put("ab", "ab");
        map.put("map", list);
        return map;
    }

}
