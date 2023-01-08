package chap_06;

public class _Quiz_06 {

    public static String getHiddenData(String s, int num) {
        String data = s.substring(0, num);
        for (int i = 0; i < s.length() - num; i++) {
            data += "*";
        }
        return data;
    }

    public static void main(String[] args) {
        String name = "GeumJang";
        String id = "123456 - 9876543";
        String phone = "010-1111-2222";
        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("id : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
