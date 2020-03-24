public class CalculatorModel {

    private int calculationValue;

    public void addTwoNumbers (int firstNumber, int SecondNumber) {

        calculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue() {
        return calculationValue;
    }
}
