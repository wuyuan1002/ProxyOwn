package proxy.cglib_demo;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author wuyuan
 * @version 1.0
 * @className: CglibInstanceFactory
 * @description 描述:Cglib实例工厂，实例化代理类时使用。最终生产出来一个继承了被代理类的代理类，
 *                  自己写的所有的对被代理类方法的增强类和增强方法过滤器类最终都会变成代理类的方法实现。
 * @date 2019/4/20
 */
public class CglibInstanceFactory {
    public static Object getInstance(){

        //获取字节码增强器 --- 代理类对象
        Enhancer enhancer = new Enhancer();

        //给代理类设置父类 --- 代理类会继承这个类
        enhancer.setSuperclass(XiaoMing.class);

        //设置增强方法过滤器 --- 代理类中会形成一个方法用来过滤调用哪个方法，过滤器方法的内容从这里获得
        enhancer.setCallbackFilter(new CglibFilter());

        //设置代理类数组 --- 代理类中重写父类的方法，这些方法的内容从这里获得
        Callback[] callbacks = {new LiuxueInterceptor(),new ZhaoduixiangInterceptor()};
        enhancer.setCallbacks(callbacks);

        //返回代理类对象
        return enhancer.create();
    }
}
