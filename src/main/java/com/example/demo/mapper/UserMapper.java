package com.example.demo.mapper;

import com.example.demo.dao.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 殷涛文
 */
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 查询tb_user所有数据
     * @return tb_user List结果集
     */
    List<User> getList();
}