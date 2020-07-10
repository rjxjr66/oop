package test;

public class Operation {
    Operator operator;

    public Operation(Operator operator) {
        this.operator = operator;
    }

    public int excute(int a, int b) {
        return this.operator.excute(a, b);
    }
}