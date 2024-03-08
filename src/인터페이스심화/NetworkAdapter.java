package 인터페이스심화;

public interface NetworkAdapter {
    void connect(); // public abstract 가 void 앞에 숨겨져있음
}

class WiFi implements NetworkAdapter {
    String company;
    WiFi(String com) {
        company = com;
    }
    @Override
    public void connect() {
        System.out.println(company + "WiFi에 연결되었습니다.");
    }
}

class FiveG implements NetworkAdapter {
    String company;
    FiveG(String com) {
        company = com;
    }
    @Override
    public void connect() {
        System.out.println(company + "5G에 연결되었습니다.");
    }
}

class LTE implements NetworkAdapter {
    String company;
    LTE(String com) {
        company = com;
    }
    @Override
    public void connect() {
        System.out.println(company + "WiFi에 연결되었습니다.");
    }
}

