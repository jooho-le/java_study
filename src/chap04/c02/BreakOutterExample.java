package chap04.c02;

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter : for (char upper='A'; upper<='Z'; upper++) {
            for (char lower='a'; lower<='z'; lower++) {
                System.out.println(upper + "- " + lower);
                if (lower == 'g') {
                    break Outter; // Outter 반복문까지 탈출하는 break문
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
