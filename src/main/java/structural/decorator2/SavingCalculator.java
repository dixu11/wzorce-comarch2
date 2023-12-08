package structural.decorator2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SavingCalculator implements Calculator{


    private Calculator calculator;

    public SavingCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int number1, int number2) {
        int result = calculator.add(number1, number2);
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("result.txt",true));
            out.printf("%d, ",result);
            out.close();
        } catch (FileNotFoundException e) {

        }
        return result;
    }
}
