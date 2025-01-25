public class ForSumFrom1To100Example2 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 0; // 초기화 변수 for 밖에 선언할 경우 전역변수로 사용 가능 
        for (i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~" + (i-1) + "합 : " + sum);
    }
}
