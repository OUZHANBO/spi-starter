package top.ouzhanbo.spi.api;

import java.util.ServiceLoader;

/**
 * @author zhanxiangOu
 * @date 2021年12月13日18:12
 */
public class Invoker {
    public static void main(String[] args) {
        ServiceLoader<Printer> printerLoader = ServiceLoader.load(Printer.class);
        for (Printer printer : printerLoader) {
            printer.print();
        }
    }
}
