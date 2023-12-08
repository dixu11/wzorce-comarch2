package structural.decorator2;

public class PrintingCalculator implements Calculator {
    private Calculator calculator;

    public PrintingCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int number1, int number2) {
        int result = calculator.add(number1, number2);
        System.out.printf("%d+%d=%d\n",number1,number2,result);
        return result;
    }
}
