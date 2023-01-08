package chap_04;

public class _01_if {
    public static void main(String[] args) {
        int hour = 10;
        boolean morningCoffee = false;
        if (hour < 14 && !morningCoffee){
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피주문완료");

        hour = 15;
        morningCoffee = true;
        if (hour >= 16 || morningCoffee){
            System.out.println("아이스아매리카노(디카페인)");
        }
    }
}
