package chap02.c04;

import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String inputData;

        while(true) {
            inputData = scanner.nextLine(); // enter키가 입력되기 전까지 대기 상태가 되며 enter키가 입력되면 입력된 모든 내용 문자열로 읽음 
            System.out.println("입력된 문자열 : \"" + inputData + "\"");
            if(inputData.equals("q")) {
                break;	
            }
        }

        System.out.println("종료");
    }
}
