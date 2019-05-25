package demo;

/**
 * @author wuyuan
 * @version 1.0
 * @className: father
 * @description 描述:
 * @date 2019/5/10
 */
public class father {
    private String name;

    public father() {
        this.name = "father";
        show();
    }
    public void show(){
        System.out.println("father--"+name);
    }

    public static void main(String[] args) {
        son son = new son();
        son.show();
    }
}
