package chap_10.converter;

@FunctionalInterface // 함수형 인터페이스는 하나의 메소드만 정의되어야 함.
public interface Convertible {
    void convert(int USD);

}
