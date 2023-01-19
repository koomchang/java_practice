package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("saying.txt"))) {
            bw.write("세 살 __ 여든까지 간다");
            bw.newLine();
            bw.write("버릇");
            bw.newLine();
            bw.write("소 잃고 __ 고친다.");
            bw.newLine();
            bw.write("외양간");
            bw.newLine();
            bw.write("천 리 길도 한 __ 부터");
            bw.newLine();
            bw.write("걸음");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br = new BufferedReader(new FileReader("saying.txt"))) {
            String line;
            String input;
            String answer;
            while (true) {
                line = br.readLine();
                answer = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println("(문제) " + line);
                System.out.println("정답 입력 -> ");
                input = sc.nextLine();
                if (answer.equals(input)) {
                    System.out.println("정답입니다.");
                } else {
                    System.out.println("오답입니다. 정답은 " + answer + " 입니다.");
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
