package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5;
        boolean isSmallCar = true;
        boolean isDisableCar = false;

        int fee = hour * 4000;
        if (fee >= 30000){
            fee = 30000;
        }

        if (isDisableCar || isSmallCar){
            fee /= 2;
        }
        System.out.println("주차요금은 " + fee + " 입니다.");
    }
}
