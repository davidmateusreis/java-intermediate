package com.david.cursojava.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98 {

    public static void main(String[] args) {

        double a = 0.03;
        double b = 0.04;
        double c = b - a;

        System.out.println(c);

        BigDecimal x = new BigDecimal("0.03");
        BigDecimal y = new BigDecimal("0.04");
        BigDecimal z = y.subtract(x);
        System.out.println(z);

        BigDecimal bd1 = new BigDecimal("1234567890.9876543210");
        BigDecimal bd2 = new BigDecimal("9876543210.9876543210");
        System.out.println(bd1.add(bd2));

        System.out.println(bd1.multiply(bd2));

        System.out.println(bd1.divide(new BigDecimal(2)));

        BigInteger bi = new BigInteger("10000000000000000");
        System.out.println(bi);

    }
}
