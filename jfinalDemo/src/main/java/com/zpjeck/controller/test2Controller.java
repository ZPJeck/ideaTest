package com.zpjeck.controller;

import com.jfinal.core.Controller;

/**
 * @Auther: Zpjeck
 * @Date: 2019/2/17 15:25
 * @Description:
 */
public class test2Controller extends Controller {

    public void index() {
        System.out.println("首次测试成功");

        String username = getPara("username");
        String password = getPara("password");

        String param = getPara();
        System.out.println(username);
        System.out.println(password);
        System.out.println(param);
        renderText("hello test2 page!!");
    }

    public void test() {
        renderText("hello Mr.zpjeck");
    }

    public void param() {
        System.out.println("测测试   param");
        render("/param/param.html");
    }

}
