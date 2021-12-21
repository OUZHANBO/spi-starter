package top.ouzhanbo.spi.api;

/**
 * @author zhanxiangOu
 * @date 2021年12月13日17:33
 */
public class BadPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("我抽烟，喝酒，蹦迪，但我知道我是好女孩 ~");
    }
}
