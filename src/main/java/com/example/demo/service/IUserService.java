package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * IUserService接口类
 */
@Transactional
public interface IUserService {

    /**
     * 查询tb_user所有数据
     * @return tb_user List结果集
     */
    List<User> getList();

}
