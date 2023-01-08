package chap_06;

public class _02_Parameter {
    public static void power(int number) {
        int result = (int) Math.pow(number, 2);
        System.out.println(number + " 의 2승은 " + result);
    }

    public static void powerbyExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + "승은 " + result);
    }

    public static void main(String[] args) {
        power(2);
        power(3);
        powerbyExp(2, 6);
        powerbyExp(3, 6);
    }
}
