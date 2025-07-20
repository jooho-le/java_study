package chap06.c04;

public class Car_out {
    // 필드
    int speed;

    // 생성자

    // 메소드
    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키 돌림");
    }

    void run() {
        for (int i = 10; i <= 50; i+=10) {
            speed = i;
            System.out.println("달림.(시속: " + speed + "km.h)");
        }
    }
}
