package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] sizeArray = new int[10];
        for (int i = 0; i < 10; i++) {
            sizeArray[i] = 250 + 5 * i;
        }
        for (int i = 0; i < sizeArray.length; i++) {
            System.out.println(sizeArray[i] + " 사이즈 : 재고 있음");
        }
    }
}
