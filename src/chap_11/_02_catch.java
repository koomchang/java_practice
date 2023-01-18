package chap_11;

public class _02_catch {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);

//            int[] arr = new int[3];
//            arr[5] = 100;

            String s = null;
            System.out.println(s.toLowerCase());
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("인덱스를 잘못설정했어요");
//        } catch (ArithmeticException e) {
//            System.out.println("잘못 계산하셨네요");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}