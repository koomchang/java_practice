package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;

    static int counter = 0; // 시리얼 번호 생성 역할
    static boolean canAutoReport = false; // -> static : 클래스 모든 객체에 적용

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버 : " + serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this();
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("자동 신고합니다");
        } else
            System.out.println("신고하지 않습니다");
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은 " + capacity + " GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화 시작");
        if (showDateTime)
            System.out.println("날짜 정보가 표시됩니다");
        if (showSpeed)
            System.out.println("속도 정보가 표시됩니다");
        System.out.println("영상은 " + min + " 단위로 표시됩니다");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스센터(1588-0000) 로 연결합니다.");
        canAutoReport = false;
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution() {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else
            this.price = price;

    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
