public class CompareOperatorExample2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3);

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println((float)v4 == v5); // 0.1f는 근사값 0.100000000149~로 표현되어 0.1보다 큰 값이라 피연산자 모두 float로 변환해서 비교하거나 정수 타입으로 변환해서 비교해야 함 
    }
}
