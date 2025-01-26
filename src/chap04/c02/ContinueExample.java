public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++) {
            if(i%2 != 0) {
                continue;
            } // 2로 나눈 나머지가 0이 아닐경우 즉 홀수일 경우 실행하지 않고 다음으로 넘어감 
            System.out.println(i);
        }
    }
}
