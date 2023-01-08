package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeMonica = "카푸치노";
        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요");

        // 배열 선언
//        String[] coffees = new String[3];
//      String coffees[] = new String[3];

//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "카푸치노";
        String[] coffees = {"아메리카노", "카페모카", "카푸치노"};
        System.out.println("-----------------------------");
        System.out.println(coffees[0] + "하나");

        int[] i = new int[3];
        i[0] = 1;
        System.out.println(i[0]);
    }
}
