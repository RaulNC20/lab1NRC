package org.example;

public class NewIntCalculator extends ACalculator {

    @Override
    public void init(Object value) {
        state = (Integer) value;
    }

    public void add(Integer value) {
        state = (Integer) state + value;
    }

    public void subtract(Integer value) {
        state = (Integer) state - value;
    }

    public void multiply(Integer value) {
        state = (Integer) state * value;
    }
}