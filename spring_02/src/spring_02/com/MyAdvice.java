package spring_02.com;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAdvice implements MethodInterceptor {

    /*
     * MethodInvocation  这个参数里面封装了  当前调用的方法对象      方法参数        目标对象      放行执行的方法
     */

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
       /* System.out.println("当前方法名："+methodInvocation.getMethod().getName());
		System.out.println("当前方法参数："+methodInvocation.getArguments());
		for (Object i : methodInvocation.getArguments()) {
			System.out.println(i);
		}
		System.out.println("目标对象："+methodInvocation.getThis());
		System.out.println("目标方法执行前的通知");*/

        //proceed  前进   前行

        System.out.println("开启事务");
        Object proceed = methodInvocation.proceed();
        System.out.println("提交事务");

		/*System.out.println(proceed);

		System.out.println("目标方法执行后的通知");*/

        return proceed;
    }
}
