public class CarExample_return {
    public static void main(String[] args) {
        Car_return myCar = new Car_return();

        myCar.setGas(5); // setGas메소드 호출하고 매개값 5

        boolean gasState = myCar.isLeftGas(); // isLeftGas메소드 호출
        if(gasState) {
            System.out.println("출발");
            myCar.run(); // run메소드 호출 
        }

        if(myCar.isLeftGas()) { // isLeftGas메소드 호출 
            System.out.println("gas주입 필요 없음"); // 리턴값이 true일경우
        } else {
            System.out.println("gas 주입 필요"); // 리턴값이 false일경우
        }
    }
}
