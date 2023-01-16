package chap_07;

public class _Quiz_07 {
    public static void main(String[] args) {
        Hamberger[] hambergers = new Hamberger[3];
        hambergers[0] = new Hamberger();
        hambergers[1] = new CheeseBurger();
        hambergers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다");
        System.out.println("--------------------");
        for (Hamberger hamberger : hambergers) {
            hamberger.cook();
        }
    }
}

class Hamberger {
    public String name;

    public Hamberger() {
        this("햄버거");
    }

    public Hamberger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + " 를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println(" + 피클");
        System.out.println(" + 패티");
    }
}

class CheeseBurger extends Hamberger {
    public CheeseBurger() {
        super("치즈버거");
    }

    public void cook() {
        super.cook();
        System.out.println(" + 치즈");
    }
}

class ShrimpBurger extends Hamberger {
    public ShrimpBurger() {
        super("새우버거");
    }

    public void cook() {
        super.cook();
        System.out.println(" + 새우");
    }
}

