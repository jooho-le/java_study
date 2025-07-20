package chap02.c04;

public class KeycodeExample {
    public static void main(String[] args) throws Exception {
        int KEYCODE;

        KEYCODE = System.in.read();
        System.out.println("keycode : " + KEYCODE); // 입력된 키
        KEYCODE = System.in.read();
        System.out.println("keycode : " + KEYCODE); // enter읽음 
        KEYCODE = System.in.read();
        System.out.println("keycode : " + KEYCODE); // enter읽음 
    }
}
