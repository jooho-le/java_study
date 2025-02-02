public class Calculator_in {
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x, y); // 내부 메소드 plus호출
        double result = sum / 2;
        return result;
    }

    void execute() {
        double result = avg(7, 10); // 내부 메소드 avh호출
        println("실행결과 : " + result);
    }

    void println(String message) { // println 호출
        System.out.println(message);
    }
}
