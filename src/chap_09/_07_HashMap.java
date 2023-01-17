package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value) (중복 x, 순서 x) -> LinkedHashMap은 순서 보장
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("총 고객 수 " + map.size());

        System.out.println("------------------");

        // 조회
        System.out.println("유재석 님의 포인트 : " + map.get("유재석"));
        System.out.println("박명수 님의 포인트 : " + map.get("박명수"));

        // 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈 님의 포인트 : " + map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈 님 신규 등록 : " + map.get("서장훈"));
        }
        System.out.println("------------------");

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));

        System.out.println("------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("------------------");

        // 다시 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        // key 확인
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("------------------");

        // value 확인
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println("------------------");

        // key, value 함께 확인
        for (String key : map.keySet()) {
            System.out.println("이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("------------------");

        // 중복확인
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);
        for (String key : map.keySet()) {
            System.out.println("이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("------------------");
    }
}
