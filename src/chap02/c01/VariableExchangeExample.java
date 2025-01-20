package chap02.c01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x : " + x + " y : " + y);

        int temp = x; // temp에 x값인 3저장
        x = y; // x에 y값인 5 저장 
        y = temp; // y에 temp값인 3저장
        System.out.println("x : " + x + " y : " + y);
    }
}
