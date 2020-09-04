package polynomial;

import java.util.ArrayList;
import java.util.List;

public class Polynomial {
	
	private final ArrayList<Double> coefficients;
	
	private Polynomial(ArrayList<Double> coeffs) {
		this.coefficients = coeffs;
	}
	
	public static Polynomial buildFromCoefficients(ArrayList<Double> coeffs) {
		return new Polynomial(coeffs);
	}
	
	public static Polynomial buildZeroPolynomial() {
		ArrayList<Double> zeroList = new ArrayList<>();
		zeroList.add(Double.valueOf(0));
		return new Polynomial(zeroList);
	}
	
	public List<Double> getCoefficients(){
		return coefficients;
	}
}