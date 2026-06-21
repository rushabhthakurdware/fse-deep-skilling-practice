//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double futureValue(double presentValue, double rate, int years) {

        // Base Case
        if (years == 0) {
            return presentValue;
        }

        // Recursive Case
        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double result = futureValue(1000, 0.10, 3);

        System.out.println("Future Value: " + result);
    }
}