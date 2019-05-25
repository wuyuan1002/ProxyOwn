package proxy.cglib_demo;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wuyuan
 * @version 1.0
 * @className: LiuxueInterceptor
 * @description 描述:对被代理类的liuxue方法进行增强
 * @date 2019/4/20
 */
public class LiuxueInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("留学之前准备");
        methodProxy.invokeSuper(o, objects);
        System.out.println("留学回来了");
        return null;
    }
}
