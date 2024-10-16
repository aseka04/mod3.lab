package labka;

class AdditionOperation {
    int Execute(int a, int b) {
        return a + b;
    }
}

class Calculator {
    public static void main(String[] args) {
        AdditionOperation a = new AdditionOperation();
        System.out.println(a.Execute(8,6));
    }
}
