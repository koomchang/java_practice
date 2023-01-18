package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(2);

//        convertUSD((USD) -> System.out.println(USD + "달려 = " + (USD * 1400) + " 원"), 1);
        Convertible convertible = (USD) -> System.out.println(USD + "달려 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 1);

        // 전달값이 없다면
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러는 1400원!");
        c1.convert();

        // 두 줄 이상의 코드?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달려 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        //전달값 2개
        ConvertibleWithTwoParams c2 = (USD, KRW) -> {
            System.out.println(USD + "달려 = " + (USD * KRW) + " 원");
        };
        c2.convert(10, 1400);


        // 반환값이 있는 경우?
        ConvertibleWithReturn c3 = (d, w) -> d * w;
        int result = c3.convert(20, 1400);
        System.out.println("20달러 = " + result + " 원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
