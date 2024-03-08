package 인터페이스;

public class 핸드폰 implements 이미지사이즈{
    @Override
    public void resize(int 가로, int 세로) {
        System.out.println("핸드폰의 가로크기는 " + 가로 + ", 세로크기는" + 세로 + "입니다.");
    }
    @Override
    public void buttonSize() {
        System.out.println("버튼사이즈 가로300, 세로 150");
    }

}
