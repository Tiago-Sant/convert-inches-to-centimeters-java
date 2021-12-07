package com.letscode.inchestocentimeters;

import com.letscode.inchestocentimeters.services.Calculator;
import com.letscode.inchestocentimeters.utils.ScannerInches;

public class Main {

    public static void main(String[] args) {
        double inches = ScannerInches.getInches();

        double centimeters = Calculator.convertInchesToCentimeters(inches);

        System.out.printf("%.3fin = %.3fcm", inches, centimeters);
    }
}
