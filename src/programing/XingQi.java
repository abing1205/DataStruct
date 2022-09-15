package programing;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;

public class XingQi {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("20");
        System.out.println(bigInteger);
        BigInteger bigInteger1 = bigInteger.pow(2);
        System.out.println(bigInteger1);
        System.out.println(Arrays.toString(bigInteger1.divideAndRemainder(BigInteger.valueOf(7L))));
        BigInteger b1 = new BigInteger("10");
        BigInteger b2 = BigInteger.valueOf(2L);
        BigInteger b3 = b1.add(b2);
        System.out.println(b1.toString()+b2.toString()+b3.toString());
        BigInteger b4 = b1.pow(2);
        System.out.println(b4);
        BigInteger b5 = b1.divide(b2);
        System.out.println(b5);
        BigInteger[] b6 = b1.divideAndRemainder(BigInteger.valueOf(3));
        System.out.println(Arrays.toString(b6));
        System.out.println(BigInteger.valueOf(-4).abs());
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));

        BigDecimal d1 = new BigDecimal("2.2");
        BigDecimal d2 = BigDecimal.valueOf(1.1);
    }
}
