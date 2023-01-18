package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("----------------");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("----------------");

        // 친한 친구 방문
        Coffee spcialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("딸기 케이크는 서비스에요!");
            }

            @Override
            public void returnTray() {
                super.returnTray();
                System.out.println("자리에 두시면 제가 치울게요");
            }
        };
        spcialCoffee.order("바닐라 라떼");
        spcialCoffee.returnTray();
    }
}


class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료되었습니다.");
    }
}