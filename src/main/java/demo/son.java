package demo;

/**
 * @author wuyuan
 * @version 1.0
 * @className: son
 * @description 描述:
 * @date 2019/5/10
 */
public class son extends father{
    private String name;

    public son() {
        this.name = "son";
        show();
    }
    @Override
    public void show(){
        System.out.println("son--"+name);
    }
}
