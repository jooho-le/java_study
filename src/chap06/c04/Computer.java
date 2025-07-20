package chap06.c04;

public class Computer {
    // 매개변수의 개수를 모를 경우 
    // 방법1. 매개변수 배열 타입으로 선언 
    int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
    
    // 방법2. ... 사용
    int sum2(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}


