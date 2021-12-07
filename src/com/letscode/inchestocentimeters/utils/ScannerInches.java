package com.letscode.inchestocentimeters.utils;

import java.util.Scanner;

public class ScannerInches {

    public static float getInches(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho em polegadas: ");
        float inches = sc.nextFloat();
        return inches;
    }
}
