package com.zpjeck.controller;


import com.jfinal.core.Controller;
import com.zpjeck.model.User;

import java.util.logging.Logger;

/**
 * UserController 所有 sql 与业务逻辑写在 Model 或 Service 中，不要写在 Controller
 * 中，养成好习惯，有利于大型项目的开发与维护
 */
public class UserController extends Controller {
    /**
     * Logger for this class
     */
    private static final Logger logger = (Logger) Logger.getLogger(String.valueOf(UserController.class));

    // 页面名与方法名相同时，会默认跳到以方法名为名称的页面视图
    // 显示用户列表
    public void index() {
        // 不带分页的版本,view中遍历： <#list userlist as user>
//		String sql = "select * from user order by userid asc ";
//		List<User> userlist = User.me.find(sql);
//		setAttr("userlist", userlist);
//		logger.info(userlist);

        // 带分页版本,view中遍历： <#list userPage.list as user>
        setAttr("userPage", User.me.paginate(getParaToInt(0, 1), 3));
        renderFreeMarker("index.html"); // FreeMarker页面
    }

    // 去向添加User的页面
    public void addUser() {
        renderFreeMarker("adduser.html");
    }

    // 处理增加记录的方法
    public void doAddUser() {
        // jFinal必杀技，快速开发全靠他
        // getMOdel在字段很多时使用
        User user = getModel(User.class);// 默认找对象user,属性名应该是ser.username等。可以通过第二个参数取别名
        // User user =
        // getModel(User.class,"u");//给对象别名，则在form中，字段名字可以使用u.username,u.userpass
        System.out.println(user);
        user.set("userpass", "123456"); // 设置指定属性的值
        boolean flag = user.save();
        if (flag) {
            redirect("/user/");// 插入成功,重定向到用户列表
        } else {
            renderText("Sorry,插入失败");// 插入失败,显示提示信息.
        }
        // renderFreeMarker("index.html"); //FreeMarker页面
    }

    // 按照ID查询记录
    public void queryUserById() {
        int userid = getParaToInt(0);
        /*
         * 另外一种方法，直接执行sql String sql = "select * from user where id = ? limit 1"
         * ; User user = User.dao.findFirst(sql,userid);
         */
        User user = User.me.findById(userid); // 根据userid取得该User对象
        setAttr("user", user); // 设置属性，传递到view
        System.out.println("user=" + user);
        renderFreeMarker("edituser.html");

    }

    // 按照ID删除记录
    public void deleteById() {
        int userid = getParaToInt(0);
        boolean flag = User.me.deleteById(userid);
        if (flag) {
            redirect("/user/");// 操作成功,重定向到用户列表
        } else {
            renderText("Sorry,删除失败");// 插入失败,显示提示信息.
        }
    }

    // 更新记录
    public void updateUser() {
        User user = getModel(User.class);// 默认找对象user,属性名应该是ser.username等。可以通过第二个参数取别名
        System.out.println(user);
        boolean flag = user.save();
        if (flag) {
            redirect("/user/");// 更新成功,重定向到用户列表
        } else {
            renderText("Sorry,更新失败");// 更新失败,显示提示信息.
        }
    }
}
