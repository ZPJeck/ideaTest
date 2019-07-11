package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * @Author: ZPJeck
 * @Description:
 * @Date: 2018/4/20  14:32
 */
public interface IUserService {

    //登录
    ServerResponse<User> login(String username , String password);

    //注册
    ServerResponse register(User user);

    // 校验
    ServerResponse<String > checkValid(String str, String type);

    // 密码问题的获取
    ServerResponse<String > selectQuestion(String username);

    // 校验密码是否正确
    ServerResponse<String > checkAnswer(String username, String question, String answer);

    // 非登录状态的重置密码
    ServerResponse<String > forgetRestPassword(String username, String passwordNew, String forgetToken);

    // 登录状态的重置密码
    ServerResponse<String > restPassword(String passwordOld, String passwordNew, User user);

    // 更新个人信息
    ServerResponse<User > updateInformation(User user);

    // 用户未登录  需要强制登录
    ServerResponse<User> getInformation(Integer userId);

    ServerResponse checkAdminRole(User user);
}
