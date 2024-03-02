package 메모리구조;

public class MemoryMap {
    public static void main(String[] args) {
        // 기본 타입 변수
        int age = 25;

        // 참조 타입 변수
        String name = "곰돌이사육사";
        String name2 = new String("달빛사냥꾼"); // heap

        // null, NullPointerException
        // Null은 객체를 참조하지 않는다는 의미
        // 참조 타입 변수가 바라보고있는 위치에 객체가 없으면 NullPointException
        int[] inrArray = null;
        String name3 = null;
        Integer jobs = null;

        // 참조 변수의 ==, != 연산
        String strVal1 = "나희도";
        String strVal2 = new String("나희도");
        String strVal3 = "나희도";

        if (strVal1 == strVal2) {
            System.out.println("참조 타입의 주소가 같음을 의미");
        } else {
                System.out.println("참조 타입의 주소가 다름을 의미");
        }

        if (strVal1.equals(strVal2)) {
            System.out.println("참조하고 있는 변수의 내용이 같음");
        } else {
            System.out.println("참조하고 있는 변수의 내용이 다름");
        }

    }
}
