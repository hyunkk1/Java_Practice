package 자동차만들기;

public class CarProtoType {
    int speed;
    int yb;
    int tank;
    int seat;
    String carname;
}
class SportsCar extends CarProtoType {
    boolean turbo = false;
    public void turbo(boolean isOnOff) {
        if(isOnOff){
            turbo = true;
            speed = speed + 50;
        }
     else { turbo = false;
            speed = speed - 50;
     }
    }
    public SportsCar(String carname) {
        this.yb = 8;
        this.speed = 250;
        this.tank = 30;
        this.seat = 2;
        this.carname = carname;
    }
}

class car extends CarProtoType {
    boolean trunk = false;
    public void trunk(boolean isOnOff) {
        if (isOnOff) {
            trunk = true;
            seat = seat + 1;
        } else {
            trunk = false;
            seat = seat - 1;
        }
    }

    public car(String carname) {
        this.yb = 12;
        this.speed = 200;
        this.tank = 45;
        this.seat = 4;
        this.carname = carname;
    }
}

class bus extends CarProtoType {
    boolean subtank = false;
    public void subtank(boolean isOnOff) {
        if (isOnOff) {
            subtank = true;
            tank = tank + 30;
        } else {
            subtank = false;
            tank = tank - 30;
        }
    }


    public bus(String carname) {
        this.yb = 5;
        this.speed = 150;
        this.tank = 100;
        this.seat = 20;
        this.carname = carname;
    }
}
