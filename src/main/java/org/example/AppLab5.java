package org.example;

public class AppLab5 {
    public static void main(String[] args) {

        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + result);

        AdvancedCalculator adv = new AdvancedCalculator(10);
        int advResult = adv.add(5).subtract(3).multiply(2)
                .divide(2).power(2).root(2)
                .result();
        System.out.println("b) " + advResult);
    }
}