﻿package chap05.c02;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] scores = { { 95, 80 }, { 92, 96, 80 } };
        for (int i=0; i<scores.length; i++) {
            for (int j=0; j<scores[i].length; j++) {
                System.out.println("scores[" + i + "][" + j + "]=" + scores[i][j] );
            }
        }
    }
}
