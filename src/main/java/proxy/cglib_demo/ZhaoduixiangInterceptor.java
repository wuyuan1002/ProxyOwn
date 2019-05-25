package proxy.cglib_demo;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wuyuan
 * @version 1.0
 * @className: ZhaoduixiangInterceptor
 * @description 描述:对被代理类的zhaoduixiang方法进行增强
 * @date 2019/4/20
 */
public class ZhaoduixiangInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("找对象准备");
        methodProxy.invokeSuper(o, objects);
        System.out.println("找到对象后结婚生子");
        return null;
    }
}
