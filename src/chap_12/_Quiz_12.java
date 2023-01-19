package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable productA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("상품 A 준비 : " + i + " / 5");
            }
            System.out.println("상품 A 준비 완료!");
        };

        Runnable productB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("상품 B 준비 : " + i + " / 5");
            }
            System.out.println("상품 B 준비 완료!");
        };

        Runnable runnableSet = new Runnable() {
            @Override
            public void run() {
                System.out.println("세트 상품 포장 시작!");
                for (int i = 1; i <= 5; i++) {
                    System.out.println("세트 상품 준비 : " + i + " / 5");
                }
                System.out.println("세트 상품 준비 완료!");
            }
        };

        Thread threadA = new Thread(productA);
        Thread threadB = new Thread(productB);
        threadA.start();
        threadB.start();

//        while (threadA.isAlive() || threadB.isAlive()) {
//        }
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread threadSet = new Thread(runnableSet);
        threadSet.start();
    }
}