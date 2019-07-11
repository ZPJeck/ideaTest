package com.baizhi.controller.portal;


import com.baizhi.common.Const;
import com.baizhi.common.ResponseCode;
import com.baizhi.common.ServerResponse;
import com.baizhi.pojo.User;
import com.baizhi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserservice;

    /**
     * 用户登录
     * @param username
     * @param password
     * @param session
     * @return
     */
//登陆
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody //自动序列化jsion
    public ServerResponse<User> login(String username, String password, HttpSession session){
        //service--->dao
        ServerResponse<User> response = iUserservice.login(username, password);
        if (response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }

//登出
    @RequestMapping(value = "logout",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return  ServerResponse.createBySuccess();
    }

//注册
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register(User user){
        return iUserservice.register(user);
    }

//校验用户名和邮箱是否存在
    @RequestMapping(value = "/check_valid" ,method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> checkValid(String str,String type){
        return iUserservice.checkValid(str,type);
    }

//获取用户登陆的信息
    @RequestMapping(value = "get_user_info",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> getUserInfo(HttpSession session){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user != null){
            return ServerResponse.createBySuccess(user);
        }else {
            return ServerResponse.createByErrorMessage("用户未登录，无法获取当前用户的信息");
        }
    }

    //忘记密码
    @RequestMapping(value = "forget_get_question",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetGetQuestion(String username){
        return iUserservice.selectQuestion(username);
    }

    //校验回答问题的正确性
    @RequestMapping(value = "/forget_check_answer",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetCheckAnswer(String username,String question,String answer){
        return iUserservice.checkAnswer(username, question, answer);
    }

    //重置密码
    @RequestMapping(value = "/forget_reset_password",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetRestPassword(String username,String passwordNew,String forgetToken){
        return iUserservice.forgetRestPassword(username, passwordNew, forgetToken);
    }

    //登陆重置密码
    @RequestMapping(value = "reset_password",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> resetPassword(HttpSession session,String passwordOld,String passwordNew){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        return iUserservice.resetPassword(user,passwordOld,passwordNew);
    }

    //更新用户信息
    @RequestMapping(value = "update_information",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> update_information(HttpSession session,User user){
        User currentUser = (User) session.getAttribute(Const.CURRENT_USER);
        if(currentUser == null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        user.setId(currentUser.getId());
        user.setUsername(currentUser.getUsername());
        ServerResponse<User> response = iUserservice.updateInformation(user);
        if (response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }


    //获取用户的详细信息
    @RequestMapping(value = "get_information",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> get_information(HttpSession session){
        User currentUser = (User) session.getAttribute(Const.CURRENT_USER);
        if(currentUser == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"未登录，需要强制登陆10");
        }
        return iUserservice.getInformation(currentUser.getId());
    }
}
