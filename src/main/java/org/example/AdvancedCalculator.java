package org.example;

public class AdvancedCalculator extends IntCalculator {

    public AdvancedCalculator(int initialValue) {
        super(initialValue);
    }

    public AdvancedCalculator divide(int value) {
        if (value != 0) {
            state /= value;
        }
        return this;
    }

    public AdvancedCalculator power(int exponent) {
        state = (int) Math.pow(state, exponent);
        return this;
    }

    public AdvancedCalculator root(int n) {
        state = (int) Math.pow(state, 1.0 / n);
        return this;
    }
}
