package 스트링연습;

public class StringEx {
    public static void main(String[] args) {
//        String a = "Hello Java"; //리터럴 상수
//        String b = new String("b"); //객체 생성 방법
//        String c = new String("b"); //주소가 다름

        // 문자여 내장 메소드 사용
        // 문자열 비교, equals(문자열 비교), equalsIgnoreCase(비교할 때 대/소문자 무시)
        // 문자열 비교시 == 사용하게되면 값을 비교하는 것이 아니라 주소를 비교하게 됨
        String a = "Hello";
        String b = "Java";
        String c = "hello";
        System.out.println(a.equalsIgnoreCase(c)); // 문자열 비교

        // indexOf : 특정 문자가 시작하는 인덱스 반환 (인덱스는 0부터 시작 함)
        String d = "Hello Java";
        System.out.println(d.indexOf("l"));
        // contains : 포함 여부 확인(true/false)
        System.out.println(d.contains("Hel"));
        // chatAt : 문자열에서 특정 위치의 문자를 리턴
        System.out.println(d.charAt(6)); // J
        // replaceAll : 문자열에서 특정 문자열을 다른 문자열로 대체 (정규식 사용가능)
        // replace : 문자열에서 특정 문자열을 다른 문자열로 대체
        System.out.println(d.replace("Java", ""));
        System.out.println(d.replaceAll("\\s", ""));
        // subString : 문자열에서 특정 문자열을 뽑아낼 때 사용
        System.out.println(d.substring(5)); // 5번 인덱스 부터 끝까지
        System.out.println(d.substring(0, 5)); // 0부터 5미만까지 잘라냄
        // toUpperCase(전부 대문자) / toLowerCase(전부 소문자)
        System.out.println(d.toUpperCase());
        System.out.println(d.toLowerCase());
        // trim() : 문자열의 앞뒤의 공백을 제거
        String e = " Hello World      ";
        System.out.println(e.trim());
        // Split : 문자열을 특정 구분자로 구분하는 메소드
        String time = "12:33:55";
        String[] rst = time.split(":");
        System.out.println(rst[0] + "시" + rst[1] + "분" + rst[2] +'초');
        // 문자열 포매팅
        System.out.printf("I eat %d apples\n", 3);
        String buffer = String.format("I eat %d apples. %d bananas", 3, 5);
        System.out.println(buffer);

        // toCharArray() : 문자열을 문자 배열로 변환
        String addr = "Seoul Gangnamgu Yeoksam";
        char[] addrCh = addr.toCharArray();
        for(char ee : addrCh) System.out.println(ee + " ");

    }
}
