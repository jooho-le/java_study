public class WhileSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // 루프카운터 변수 전역변수로 선언 

        while (i<=100) {
            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1) + "합 : " + sum);
    }
}
