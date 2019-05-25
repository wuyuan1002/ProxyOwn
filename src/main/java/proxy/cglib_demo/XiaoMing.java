package proxy.cglib_demo;

/**
 * @author wuyuan
 * @version 1.0
 * @className: XiaoMing
 * @description 描述:小明 --- 被代理类 --- 不需要实现接口
 *
 *                  不同的代理类对它不同的方法进行增强
 * @date 2019/4/20
 */
public class XiaoMing {
    public void liuxue() {
        System.out.println("小明留学");
    }

    public void zhaoduixiang() {
        System.out.println("小明找对象");
    }
}
