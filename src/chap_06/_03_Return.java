package chap_06;

public class _03_Return {
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress() {
        return "서울시 어딘가";
    }

    public static String getActivity() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        String phoneNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + phoneNumber);
        String address = getAddress();
        System.out.println("호텔 주소 : " + address);
        String activity = getActivity();
        System.out.println("호텔 액티비티 : " + activity);
    }
}
