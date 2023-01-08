package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노", "카페모카", "카푸치노"};
        System.out.println(coffees[0]);
        System.out.println(coffees[1]);
        System.out.println(coffees[2]);

        for (int i = 0; i < coffees.length; i++){
            System.out.println(coffees[i]);
        }
        System.out.println("------------------------------");
        for(String coffee : coffees){
            System.out.println(coffee);
        }

    }
}
