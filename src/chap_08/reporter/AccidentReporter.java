package chap_08.reporter;

public class AccidentReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("사고를 신고합니다.");
    }
}
