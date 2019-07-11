package com.zpjeck.controller;

import com.jfinal.core.Controller;

/**
 * @Auther: Zpjeck
 * @Date: 2019/2/18 16:00
 * @Description:
 */
public class paramController extends Controller {

    /*
     * 初始页面
     */
    public void index() {
        System.out.println("拦截器进入方法");
    }
}
