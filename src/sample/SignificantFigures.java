package sample;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SignificantFigures {

    public static void main(String[] args) {
        double a = 123.4567;
        double b = 0.1234567;
        double c = 7.654321;
        double d = 1.0;

        System.out.println(getSignificant(a, 4));
        System.out.println(getSignificant(b, 4));
        System.out.println(getSignificant(c, 4));
        System.out.println(getSignificant(d, 4));
    }

    //Probably need to find out how exactly this function works.
    public static String getSignificant(double value, int sigFigs) {
        MathContext mc = new MathContext(sigFigs, RoundingMode.UP);
        BigDecimal bigDecimal = new BigDecimal(value, mc);
        return bigDecimal.toPlainString();
    }
}
