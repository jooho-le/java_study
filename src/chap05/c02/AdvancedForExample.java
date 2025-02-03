public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = { 95, 71, 84, 93, 87 };

        int sum = 0;
        for (int score : scores) { // 타입변수 : 배열 , 배열에서 가져올 값이 존재한다면 for문 실행 
            sum = sum + score;
        }

        System.out.println("총합 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
