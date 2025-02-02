public class Car {
    // 필드
    String model;
    int speed;
    
    // 생성자
    Car(String model) {
        this.model = model; // 객체 내부 인스턴스 멤버에 접근 (this)
    }

    // 메소드
    void setSpeed(int speed) {
        this.speed = speed; // 객체 내부 인스턴스 멤버에 접근 (this)
    }

    void run() {
        for (int i = 10; i <=50; i+=10) {
            this.setSpeed(i);
            System.out.println(this.model + "가 달림, 시속 : " + this.speed + "km/h");
        }
    }
}
