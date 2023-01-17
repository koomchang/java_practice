package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제너릭 클래스

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("-----------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("안준현");
        c4.ready();

        System.out.println("-----------------------");
        int c3Name = (int) c3.name;
        String c4Name = (String) c4.name;
        System.out.println("주문 고객 번호 : " + c3Name);
        System.out.println("주문 고객 번호 : " + c4Name);
        System.out.println("-----------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println(c5Name);
        System.out.println("-----------------------");

        Coffee<String> c6 = new Coffee<>("조세호");
        String c6Name = c6.name;
        System.out.println(c6Name);
        c6.ready();
        System.out.println("-----------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        System.out.println("-----------------------");
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();
        System.out.println("-----------------------");
        orderCoffee("김영철");
        orderCoffee(36);
        orderCoffee("김희철", "라떼");
        orderCoffee(37, "아메리카노");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);

    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);

    }
}
