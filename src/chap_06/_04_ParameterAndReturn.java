package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPowerbyExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int power = getPower(5);
        System.out.println(power);
        System.out.println(getPower(4));

        int powerExp = getPowerbyExp(3, 6);
        System.out.println(powerExp);
        System.out.println(getPowerbyExp(4, 5));
    }
}
