package 단어공부;



import java.util.Scanner;

// 알파벳 대소문자로 된 단어가 주어지면 가장 많이 사용된 알파벳이 무엇인지 알아보자
// 단 대소문자는 구분하지 않음
// 첫째줄에 가장 많이 사용된 알파벳을 대문자로 출력한다. 단 최고중복글자가 여러개인경우 ? 출력
public class WordStudy {
    public static void main(String[] args) {
        int[] alphabet = new int[26]; // 알파벳 개수만큼 배열생성
        int max = 0; // 가장 많이 등장하는 단어의 수를 저장하는 변수
        char result = 0; // 가장 많이 등장한 단어를 저장 (출력을 위해서)
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String word = sc.next(); // 스캐너로부터 단어를 입력받음
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++; // 해당 알파벳의 인덱스에 1 증가
            else alphabet[word.charAt(i) - 'A']++;
        }
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) result = '?';
            else if(alphabet[i] > max) {
                max = alphabet[i];
                result = (char) ('A' + i);
            }
        }
        System.out.println(result);
    }
}