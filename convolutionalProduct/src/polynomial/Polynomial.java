package polynomial;

import java.util.ArrayList;
import java.util.List;

public class Polynomial {
	
	private final List<Double> coefficients;
	
	private Polynomial(List<Double> coeffs) {
		this.coefficients = coeffs;
	}
	
	public static Polynomial buildFromCoefficients(List<Double> coeffs) {
		return new Polynomial(coeffs);
	}
	
	public static Polynomial buildZeroPolynomial() {
		ArrayList<Double> zeroList = new ArrayList<>();
		zeroList.add(Double.valueOf(0));
		return new Polynomial(zeroList);
	}
	
	public static Polynomial buildConstantPolynomial(double c) {
		ArrayList<Double> constantList = new ArrayList<>();
		constantList.add(c);
		return new Polynomial(constantList); 
	}
	
	public List<Double> getCoefficients(){
		return coefficients;
	}
}