package chap_07;

public class _01_Class {
    // 객체지향프로그래밍 (OOP : Objected-Oriendted Programming)
    // 유지보수 용이, 높은 재사용성
    public static void main(String[] args) {
        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상

        // 첫 번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "black";

        // 두 번째 제품
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "white";

        //또 다른 제품? -> 클래스를 사용하자!
        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로 부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스
        BlackBox bbox2 = new BlackBox();
    }
}
