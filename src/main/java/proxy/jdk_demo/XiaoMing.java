package proxy.jdk_demo;

/**
 * @author wuyuan
 * @version 1.0
 * @className: XiaoMing
 * @description 描述:小明 --- 被代理类 --- 必须实现接口
 * @date 2019/4/20
 */
public class XiaoMing implements People {
    @Override
    public void zhaoduixiang() {
        System.out.println("小明在上班，没时间！！");
    }
}
