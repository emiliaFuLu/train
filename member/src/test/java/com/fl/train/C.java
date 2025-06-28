package com.fl.train;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a >
 * @since 2025/3/6 12:55
 */
public class C extends A implements B{

    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b); // 输出 0.30000000000000004（精度丢失）

        BigDecimal a1 = new BigDecimal("1"); // 必须用字符串构造，避免初始误差！
        BigDecimal b1 = new BigDecimal("0.3");
        System.out.println(a1.add(b1)); // 输出 0.3（精确）
        System.out.println(a1.divide(b1, 4, RoundingMode.UP)); // 输出 0.3（精确）
    }

}
