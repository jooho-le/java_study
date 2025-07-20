package chap05.c02;

public class ArrayCopyByArraycopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = { "자바", "파이썬", "코틀린" };
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length); // 원본배열, 복사 시작 인덱스, 새 배열, 붙여넣을 시작 인덱스, 복사할 개수 

        for (int i=0; i<newStrArray.length; i++) {
            System.out.println(newStrArray[i]);
        }
    }
}
