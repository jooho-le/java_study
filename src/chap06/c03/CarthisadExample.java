package chap06.c03;

public class CarthisadExample {
    public static void main(String[] args) {
        Carthisad car1 = new Carthisad();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Carthisad car2 = new Carthisad("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        Carthisad car3 = new Carthisad("자가용", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Carthisad car4 = new Carthisad("택시", "검정", 200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxspeed : " + car4.maxSpeed);
        System.out.println();
    }
}
