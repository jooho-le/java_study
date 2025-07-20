package chap05.c02;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] { 83, 90, 87 }; // 이미 scores배열 선언했으므로 new연산자 이용해서 값 넣어줌 

        int sum1 = 0;
        for (int i=0; i<3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        
        int sum2 = add( new int[] { 83, 90, 87 } ); // add메서드 이용 
        System.out.println("총합 : " + sum2);
        System.out.println();
    }

    // add 메서드 
    public static int add(int[] scores) {
        int sum = 0;
        for (int i =0; i<3; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
