package 문제; // 패키지 선언

import java.io.*; // 파일 입출력 관련 라이브러리 import
import java.util.Scanner; // Scanner 클래스 import
import java.util.StringTokenizer; // StringTokenizer 클래스 import
import java.util.TreeSet; // TreeSet 클래스 import

public class aa {
    public static void main(String[] args) { //  메서드 시작
        TreeSet<Sco> arrList = new TreeSet<>(); // TreeSet 객체 생성
        try (Scanner sc = new Scanner(new FileInputStream("score.txt"))) { // 파일 읽기를 위한 Scanner 객체 생성 및 try-with-resources 사용
            while (sc.hasNextLine()) { // 파일의 끝까지 한 줄씩 읽어오는 반복문 시작
                String line = sc.nextLine(); // 한 줄을 읽어와서 line 변수에 저장
                StringTokenizer st = new StringTokenizer(line, " "); // 공백을 기준으로 문자열을 분리하는 StringTokenizer 객체 생성
                String name = st.nextToken(); // 분리된 문자열 중 첫 번째 토큰(이름)을 name 변수에 저장
                int kor = Integer.parseInt(st.nextToken()); // 두 번째 토큰(국어 성적)을 정수로 변환하여 kor 변수에 저장
                int math = Integer.parseInt(st.nextToken()); // 세 번째 토큰(수학 성적)을 정수로 변환하여 math 변수에 저장
                int eng = Integer.parseInt(st.nextToken()); // 네 번째 토큰(영어 성적)을 정수로 변환하여 eng 변수에 저장
                int sum = kor + math + eng; // 국어, 수학, 영어 성적을 합산하여 총점을 계산하여 totalScore 변수에 저장
                double avg = sum / 3.0; // 평균 계산
                arrList.add(new Sco(name, kor, math, eng, sum, avg)); // Sco 객체를 생성하여 TreeSet에 추가
                // System.out.println(line); // 읽어온 한 줄을 출력
            }
        } catch (FileNotFoundException e) { // 파일을 찾을 수 없는 예외 발생 시
            e.printStackTrace(); // 에러 내용 출력
        }

        int rank = 1; // 등수 변수 초기화
        for (Sco s : arrList) { // TreeSet에 저장된 Sco 객체들을 순회하면서 반복하는 반복문 시작
            System.out.println(rank + "등 - " + s.getName() + ", 성적 합산: " + s.getsum()); // 각 학생의 등수, 이름, 총점 출력
            rank++; // 등수 증가
        }
    }
}

class Sco implements Comparable<Sco> { // Sco 클래스 선언 및 Comparable 인터페이스 구현
    private String name; // 이름을 저장하는 멤버 변수
    private int kor; // 국어 성적을 저장하는 멤버 변수
    private int math; // 수학 성적을 저장하는 멤버 변수
    private int eng; // 영어 성적을 저장하는 멤버 변수
    private int sum; // 총점을 저장하는 멤버 변수
    private double avg;

    public Sco(String name, int kor, int math, int eng, int sum, double avg) { // Sco 클래스의 생성자
        this.name = name; // 이름 초기화
        this.kor = kor; // 국어 성적 초기화
        this.math = math; // 수학 성적 초기화
        this.eng = eng; // 영어 성적 초기화
        this.sum = sum; // 총점 초기화
        this.avg = avg;
    }

    public String getName() { // 이름을 반환하는 메서드
        return name; // 이름 반환
    }

    public int getsum() { // 총점을 반환하는 메서드
        return sum; // 총점 반환
    }
    public double getAvg() { // 평균을 반환하는 메서드
        return avg; // 평균 반환
    }
    @Override
    public int compareTo(Sco o) { // Sco 객체 비교 메서드
        // 총점이 동일한 경우 이름을 기준으로 오름차순 정렬
        if (this.sum == o.getsum()) {
            return this.name.compareTo(o.getName()); // 이름을 기준으로 정렬
        }
        // 총점이 다른 경우 총점을 기준으로 내림차순 정렬
        return Integer.compare(o.getsum(), this.getsum()); // 총점을 기준으로 정렬
    }
}