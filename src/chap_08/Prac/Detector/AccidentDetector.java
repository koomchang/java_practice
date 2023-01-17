package chap_08.Prac.Detector;

public class AccidentDetector implements Detectable {
    @Override
    public void detect() {
        System.out.println("사고를 감지합니다.");
    }
}
