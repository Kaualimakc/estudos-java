package util;

public class currencyConvert {
	public static final double IOF = 0.06 ;

	public  static double quantidadeReal(double dollar, double quantity) {
		return dollar *quantity;
	}
	public static double total(double real) {
		return real += real * IOF;
	}
}
