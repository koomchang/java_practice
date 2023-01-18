package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류
        // 컴파일 오류는 문법 등 문제로 컴파일 자체가 안 돰.
        // 런타임 오류 (error, exception)

        try {
//            int[] arr = new int[3];
//            arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("실패" + e.getMessage());
            e.printStackTrace();
        }
    }
}
