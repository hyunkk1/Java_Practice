package 객체지향기본;

public class OOPBasic {
    public static void main(String[] args) {
        Student s1 = new Student("KHK", "서울시 강남구 역삼동"); // Student 클래스로 s1 객체생성
        Student s2 = new Student("KHE", "서울시 강남구 역삼동"); // Student 클래스로 s2 객체 생성
        System.out.println(s1.setStudentName(null));
        s1.showStudentInfo();
        s2.showStudentInfo();


    }
}

class Student {
    private int studentID; // 학번, 인스턴스 필드
    private String studentName;
    private int grade; // 학년
    private String address; // 주소

    // 매개변수가 있는 생성자
    public Student(String name, String address) {
        studentName = name;
        this.address = address; // this는 자기 자신의 객체를 가리키는 포인트
    }

    public void setStudentID(int id) {
        studentID = id;
    }


    // 접근제한자 : 해당 메소드에 접근할 수 없는 범위를 명시 (public / protected / default / private)
    // 반환 타입 : 메소드가 작업을 마치고 변환하는 데이터 타칩을 명시 (void는 반환할게 없다는 의미)
    // 메소드 이름 : 메소드를 호출하기 위한 이름 (객체이름.메소드이름)
    // 매개변수 목록 :
    // 구현부가 있음
    public int setStudentName(String name) {
        if(name == null) return 100;
        studentName = name;
        return 200;
    }

    public void setAddress(String addr) {

    }

    // 메소드 추가
    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }
}







