package jdk8.lambda;
import org.apache.log4j.Logger;

import java.util.function.Function;

public class LambdaT {
    private static final Logger logger = Logger.getLogger("lambda");

    static int[] integers = { 0, 1, 2, 3, 4, 5 };


    /** Function to be called with an int and a Function;
     * just apply the function to the int and return the result
     */
    static int doTheMath(int n, Function<Integer,Integer> func) {
        return func.apply(n);
    }
    public static void main(String[] args) {


        int total = 0;
        for (int i : integers) {
            // Call doTheMath with 'i' and a Lambda for n^2 +1
            total += doTheMath(i, k -> k * k + 1 );
        }

        logger.info(total);
    }
}
