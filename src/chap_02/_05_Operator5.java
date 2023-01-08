package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항연산자
        // 결과 = (조건) ? (참의 결과) : (거짓 결과)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x :y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        boolean b = (x==y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "달라!" : "같아!";
        System.out.println(s);
    }
}
