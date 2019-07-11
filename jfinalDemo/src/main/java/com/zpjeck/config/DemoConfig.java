package com.zpjeck.config;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.template.Engine;
import com.zpjeck.controller.TestController;
import com.zpjeck.controller.UserController;
import com.zpjeck.controller.paramController;
import com.zpjeck.controller.test2Controller;
import com.zpjeck.interceptor.GlobleInterceptor;
import com.zpjeck.model.User;


public class DemoConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {

    }

    @Override
    public void configRoute(Routes me) {
//        me.setBaseViewPath("/a");
        me.add("/", TestController.class);
        me.add("/test", test2Controller.class);
        me.add("/param", paramController.class);
        me.add("/user", UserController.class);
    }

    @Override
    public void configEngine(Engine me) {

    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {
        me.add(new GlobleInterceptor());
    }

    @Override
    public void configHandler(Handlers me) {

    }

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 9091, "/");
    }
}