public class Calculator {
    // 메소드
    void powerOn() {
        System.out.println("전원 on");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }
    
    void powerOff() {
        System.out.println("전원 off");
    }
}
