package util;

public class CurrencyConverter {

  public static double IOF = 0.06;

  public static double convert(double dollarPrice, double dollars) {
    double dollarsBought = dollarPrice * dollars;

    double iof = dollarsBought * IOF;
    
    return dollarsBought + iof;
  }
}
