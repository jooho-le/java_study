public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8; // 8~11까지 중 난수
        System.out.println("현재시간 : " + time + " 시");

        switch (time) {
            case 8:
                System.out.println("출근");
            case 9:
                System.out.println("업무");
            case 10:
                System.out.println("회의");
            case 11:
                System.out.println("외근");
        }
    }
}

// break가 없으므로 case값 실행 후 그 이후 case들 실행 됨 
