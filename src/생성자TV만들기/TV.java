package 생성자TV만들기;

public class TV {
    private boolean isON; // 전원
    private int channel; //
    private int volume;
    // 매개변수 없는 기본 생성자
    TV() {
        isON = false;
        channel = 11;
        volume = 10;
        System.out.println("기본 생성자 호출 !!!! " + "전원 : " + isON + " 채널 : " + channel + " 볼륨 : " + volume);
    }
    TV(boolean isON, int channel, int volume) {
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
    }
    public void setON(boolean onOff) {
        isON = onOff;
        String onOffStr = (isON) ? "ON" : "OFF"; // boolean 값으로 받은 값을 ON/OFF 문자열로 반환
        System.out.println("TV 전원 : " + onOffStr);
    }
    public void setChannel(int cnl) {
    if(cnl >= 1 && cnl <= 999 ) {
        channel = cnl;
        System.out.println("채널을 " + channel + "번으로 변경하였습니다.");
    } else {
        System.out.println("유효하지 않은 채널입니다.");
    }
  }
    public void setVolume(int vol) {
    if(vol >= 0 && vol <= 100) {
        volume = vol;
        System.out.println("볼륨을 " + volume + "변경하였습니다." );
        } else {
        System.out.println("유효하지 않은 볼륨값 입니다.");
        }
}
public void prnTvInfo() {
    String onOffStr = (isON) ? "ON" : "OFF";
    System.out.println("===== TV 정보 =====");
    System.out.println("전원 : " + onOffStr);
    System.out.println();
    }
            }

