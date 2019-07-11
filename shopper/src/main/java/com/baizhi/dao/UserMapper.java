package com.baizhi.dao;

import com.baizhi.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //id删除用户
    int deleteByPrimaryKey(Integer id);

    //添加用户
    int insert(User record);

    //
    int insertSelective(User record);

    //id查找用户
    User selectByPrimaryKey(Integer id);

    //
    int updateByPrimaryKeySelective(User record);

    //
    int updateByPrimaryKey(User record);

    //检查用户名是否存在
    int checkUsername(String username);

    //检验邮箱是否存在
    int checkEmail(String email);

    //通过用户名和密码查找
    User selectLogin(@Param("username")String username,@Param("password") String password);

    //查找问题，找回密码
    String selectQuestionByUserName(String username);

    //检验回答问题的正确与否
    int checkAnswer(@Param("username") String username,@Param("question") String question,@Param("answer") String answer);

    //修改密码
    int updatePasswordByUserName(@Param("username") String username,@Param("password") String passwordNew);

    int checkPassword(@Param("password") String password,@Param("id") Integer userId);

    int checkEmailByUserId(@Param("email") String email,@Param("id") Integer userId);

}