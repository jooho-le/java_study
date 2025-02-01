public class CarExample_out {
    public static void main(String[] args) {
        Car_out myCar = new Car_out(); // 외부 클래스에서 메소드 호출 위해 클래스로부터 객체 생성 
        myCar.keyTurnOn(); // keyTurnOn 메소드 호출
        myCar.run(); // run 메소드 호출
        int speed = myCar.getSpeed();
        System.out.println("현재속도 : " + speed + "km/h");
    }
}
