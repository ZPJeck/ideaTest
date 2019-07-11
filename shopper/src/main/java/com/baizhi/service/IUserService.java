package com.baizhi.service;

import com.baizhi.common.ServerResponse;
import com.baizhi.pojo.User;

public interface IUserService {

   ServerResponse<User>  login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    ServerResponse<String> selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username,String question,String answer);

    ServerResponse<String> forgetRestPassword(String username,String passwordNew,String forgetToken);

    ServerResponse<String> resetPassword(User user,String passwordOld,String passwordNew);

    ServerResponse<User> updateInformation(User user);

    ServerResponse<User> getInformation(Integer userId);

}
