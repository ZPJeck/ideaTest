package spring_03.service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AddMethod implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method);
        System.out.println(o);
        System.out.println("--------what-------");
    }
}
