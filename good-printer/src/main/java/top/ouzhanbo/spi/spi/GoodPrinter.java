package top.ouzhanbo.spi.spi;

import top.ouzhanbo.spi.api.Printer;

/**
 * @author zhanxiangOu
 * @date 2021年12月13日17:35
 */
public class GoodPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("你是个好人 ~");
    }
}
