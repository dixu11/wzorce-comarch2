package structural.decorator2;

public class CalculatorFactoryImpl implements CalculatorFactory {
    @Override
    public Calculator getStandardCalculator() {
        return new StandardCalculator();
    }

    @Override
    public Calculator getPrintingCalculator() {
        return new PrintingCalculator(new StandardCalculator());
    }

    @Override
    public Calculator getPrintingAndSavingCalculator() {
        return new PrintingCalculator(new SavingCalculator(new StandardCalculator()));
    }

    @Override
    public Calculator getSavingCalculator() {
        return new SavingCalculator(new StandardCalculator());
    }

    @Override
    public Calculator getSpammingCalculator(int timesSpamming) {
        Calculator calculator = new StandardCalculator();
        for (int i = 0; i < timesSpamming; i++) {
            calculator = new PrintingCalculator(calculator);
        }
        return  calculator;
    }
}
