package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(String strnumber) {
        int number = Integer.parseInt(strnumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩 : 이름이 같은 메소드를 여러개 만들기 (전달 type 이나 parameter 갯수가 다를 때)
        int power = getPower(3);
        System.out.println(power);
        System.out.println(getPower("4"));
        System.out.println(getPower(3, 4));

    }
}
