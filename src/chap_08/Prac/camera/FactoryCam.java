package chap_08.Prac.camera;

import chap_08.Prac.Detector.Detectable;

public class FactoryCam extends Camera implements Detectable {
    private Detectable detector;

    @Override
    public void showMainFeature() {
        System.out.println("주요기능 : 화재를 감지합니다.");
    }

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    @Override
    public void detect() {
        detector.detect();
    }
}
