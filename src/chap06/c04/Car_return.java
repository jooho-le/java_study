﻿package chap06.c04;

public class Car_return {
    // 필드 
    int gas;
    
    // 생성자

    // 메소드 
    // 리턴값이 없는 메소드 
    void setGas(int gas) {
        this.gas = gas;
    }

    // 리턴값이 boolean인 메소드
    boolean isLeftGas() {
        if (gas == 0){
            System.out.println("gas가 없습니다");
            return false;
        } 
        System.out.println("gas가 있습니다");
        return true;
    }

    // 리턴값이 없는 메소드 
    void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("달림(gas잔량 : " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춤(gas잔량 : " + gas + ")");
                return; // 메소드 실행 종료 
            }
        }
    }
}
