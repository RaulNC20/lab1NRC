package org.example;

public class DoubleCalculator extends ACalculator {

    @Override
    public void init(Object value) {
        state = (Double) value;
    }

    public void add(Double value) {
        state = (Double) state + value;
    }

    public void subtract(Double value) {
        state = (Double) state - value;
    }

    public void multiply(Double value) {
        state = (Double) state * value;
    }
}