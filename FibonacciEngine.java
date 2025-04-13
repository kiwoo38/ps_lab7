

/**
 * This class implements the FIBONACCI engine which computes
 * the nth Fibonacci number for a given integer input.
 */
public class FibonacciEngine implements Computable {

    private static final String engineName = "FIBONACCI";
    private int n;
    private double result;

    /**
     * Sets input value and checks for validity.
     *
     * @param args command line arguments
     */
    public void setInput(String[] args) {
        if (args.length != 2) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }

        n = Integer.parseInt(args[1]);

        if (n < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
    }

    /**
     * Computes  nth Fibonacci number.
     */
    public void compute() {
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = b;
                b = a + b;
                a = temp;
            }
            result = b;
        }
    }

    /**
     * Returns computed Fibonacci number.
     *
     * @return result as a double
     */
    public double getResult() {
        return result;
    }

    /**
     * Sets result manually.
     *
     * @param result  result to set
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * Returns name of this engine.
     *
     * @return engine name
     */
    public String getEngineName() {
        return engineName;
    }

    /**
     * Returns input value n.
     *
     * @return value of n
     */
    public int getN() {
        return n;
    }
}
