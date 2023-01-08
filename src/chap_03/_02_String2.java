package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환

        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7, 10));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));

        s = "       I love Java.       ";
        System.out.println(s);
        System.out.println(s.trim());

        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
