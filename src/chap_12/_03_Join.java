package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);

        thread.start();
        try {
            thread.join(2500); // 2.5초 대기 -> 끝나지 않으면 다음으로 넘어감
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("(사장)" + i + "번 방 청소중!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("사장 청소 끝!");
    }
}
