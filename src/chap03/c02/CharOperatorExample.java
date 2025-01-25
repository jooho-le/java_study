public class CharOperatorExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1; // A의 유니코드 65에서 1을 더한 66이 되어 B가 됨 , 리터럴간의 연산ㅇ느 컴파일 단계에서 수행하기 떄문에 문제가 되지 않음 
        char c2 = 'A';
        char c3 = (char) (c2 + 1); // 그냥 c2+1을 하게되면 int로 변환되기 때문에 char로 변환이 필요함 

        System.out.println("c1: " + c1);
        System.out.println("c1: " + c2);
        System.out.println("c3: " + c3);
    }
}
