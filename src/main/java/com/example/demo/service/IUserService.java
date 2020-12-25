package com.example.demo.service;

import com.example.demo.dao.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * IUserService接口类
 * @author 殷涛文
 */
@Transactional
public interface IUserService {

    /**
     * 查询tb_user所有数据
     * @return tb_user List结果集
     */
    List<User> getList();

}
