package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "금장금장";
        int hour = 15;

        System.out.println(name + "님 배송이 시작됩니다! " + hour + " 시에 배송이 시작됩니다");
        System.out.println(name + "님 배송이 완료되었습니다!");


        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다");

        boolean pass = true;
        System.out.println("이번시험에 합격했을가요? " + pass);

        double d = 3.1412345678914243412423;
        float f = 3.141234567890f;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;
        l = 1_000_000_000_000l;
        System.out.println(l);
    }
}
