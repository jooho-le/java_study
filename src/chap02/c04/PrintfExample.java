package chap02.c04;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품 가격 : %d원\n", value);
        System.out.printf("상품 가격 : %6d원\n", value);
        System.out.printf("상품 가격 : %-6d원\n", value);
        System.out.printf("상품 가격 : %06d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f",10, area);
    }
}
