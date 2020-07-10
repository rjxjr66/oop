package test;

public class Example {
    public Example() {
        this(1, 2, 3);
    }

    public Example(int a) {
        this(a, 2 ,3);
    }

    public Example(int a, int b) {
        this(a, b, 3);
    }

    public Example(int a, int b, int c) {
        System.out.println(String.format("%d %d %d", a, b, c));
    }
}