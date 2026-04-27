package lab6.calculator;

public class Application {
    static void main(String[] args) {
        lab6.calculator.IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("5.5.1 a) Intcalculator result: " + result);

        lab6.calculator.AdvancedCalculator calculator2 = new AdvancedCalculator(10);
        result = calculator2.add(5).subtract(3).multiply(2).add(3).root(3).result();
        System.out.println("5.5.1 b) AdvancedCalculator result:" + result);
    }
}
