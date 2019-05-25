package proxy.cglib_demo;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * @author wuyuan
 * @version 1.0
 * @className: CglibFilter
 * @description 描述:增强方法过滤器 --- 必须实现CallbackFilter接口 重写accept方法
 * @date 2019/4/20
 */
public class CglibFilter implements CallbackFilter {

    /**
     * 对调用的方法进行拦截和过滤，决定对哪个被代理方法调用哪个代理方法
     * 返回值是代理类的数组下标，通过下标决定调用哪个代理类
     */
    @Override
    public int accept(Method method) {
        if ("liuxue".equals(method.getName())) {
            return 0;
        } else if ("zhaoduixiang".equals(method.getName())){
            return 1;
        } else {
            return 0;
        }
    }
}
