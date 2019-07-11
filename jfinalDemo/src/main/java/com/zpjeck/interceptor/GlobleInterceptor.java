package com.zpjeck.interceptor;


import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.log.Log;

/**
 * @Auther: Zpjeck
 * @Date: 2019/2/19 09:18
 * @Description:
 */
public class GlobleInterceptor  implements Interceptor {
    @Override
    public void intercept(Invocation invocation) {

        System.out.println("拦截器启动前");

        invocation.invoke();
        System.out.println("拦截器启动后");

    }
}
