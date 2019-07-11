package com.zpjeck.controller;

import com.jfinal.core.Controller;

/**
 * 测试控制类
 *
 * @author Zpjeck
 * @version 0.1
 * @since 0.1 2018-01-30 下午2:31
 **/
public class TestController extends Controller {
    public void index() {


//        renderText("Hello, JFinal!");
//        renderHtml("<h1>测试</h1>");
        String msg = "Hello, JFinal!";


        setAttr("test", msg);


        render("index.html");

    }
}

