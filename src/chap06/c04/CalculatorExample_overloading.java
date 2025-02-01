public class CalculatorExample_overloading {
    public static void main(String[] args) {
        Calculator_overloading myCalcu = new Calculator_overloading();

        double result1 = myCalcu.areaRectangle(10);

        double result2 = myCalcu.areaRectangle(10, 20);

        System.out.println("정사각형 넓이 : " + result1);
        System.out.println("직직사각형 넓이 : " + result2);
    }
}
