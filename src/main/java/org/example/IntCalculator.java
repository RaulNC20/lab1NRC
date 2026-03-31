package org.example;

public class IntCalculator {
    protected int state;

    public IntCalculator(int initialValue) {
        this.state = initialValue;
    }

    public IntCalculator add(int value) {
        state += value;
        return this;
    }

    public IntCalculator subtract(int value) {
        state -= value;
        return this;
    }

    public IntCalculator multiply(int value) {
        state *= value;
        return this;
    }
    public IntCalculator divide(int value){
        state/=value;
        return this;
    }
    public IntCalculator power(double value){
        state=(int)Math.pow(state,value);
        return this;
    }
    public IntCalculator root(int value){
        state=(int)Math.pow(state,1/value);
        return this;

    }

    public int result() {
        return state;
    }

    public void clear() {
        state = 0;
    }
}