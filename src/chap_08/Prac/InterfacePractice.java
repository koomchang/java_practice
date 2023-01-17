package chap_08.Prac;

import chap_08.Prac.Detector.AccidentDetector;
import chap_08.Prac.Detector.FireDetector;
import chap_08.Prac.camera.FactoryCam;
import chap_08.Prac.camera.SpeedCam;

public class InterfacePractice {
    public static void main(String[] args) {
        FireDetector fireDetector = new FireDetector();
        AccidentDetector accidentDetector = new AccidentDetector();
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.detect();
        System.out.println("---------------");
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(accidentDetector);
        speedCam.detect();
    }
}
