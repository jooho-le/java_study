public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "자바";
        strArray[1] = "자바";
        strArray[2] = new String("자바");

        System.out.println(strArray[0] == strArray[1]); // 같은 객체를 참조하므로 t
        System.out.println(strArray[0] == strArray[2]); // 다른 객체를 참조하므로 f
        System.out.println(strArray[0].equals(strArray[2])); // 문자열이 동일하므로 t
    }
}
