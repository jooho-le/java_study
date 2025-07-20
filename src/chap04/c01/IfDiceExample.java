package chap04.c01;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1; // Math.random() : 0.0부터포함 1.0 전까지의 난수 하나 리턴 , 해서 int로 바꾸고 6곱하고 +1해서 1부터 6사이 난수 리턴

        if (num == 1) {
            System.out.println("1 나왔습니다");
        }
        else if (num == 2) {
            System.out.println("2 나왔습니다");
        }
        else if (num == 3) {
            System.out.println("3 나왔습니다");
        }
        else if (num == 4) {
            System.out.println("4 나왔습니다");
        }
        else if (num == 5) {
            System.out.println("5 나왔습니다");
        }
        else {
            System.out.println("6 나왔습니다");
        }
    }
}
