package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String Num = "901231-1234567";
        System.out.println(Num.substring(Num.indexOf("9"), 8));
        System.out.println(Num.substring(Num.indexOf("9"), Num.indexOf("-") + 2));
    }
}
