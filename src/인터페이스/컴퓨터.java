package 인터페이스;

public class 컴퓨터 implements 이미지사이즈{
    @Override
    public void resize(int 가로, int 세로) {
        System.out.println("컴퓨터 가로 크기 : " + 가로 +  ", 세로크기는" + 세로 + "입니다.");
    }

    @Override
    public void buttonSize() {
        System.out.println("버튼 크기 : 가로 50, 세로 25");
    }
}
