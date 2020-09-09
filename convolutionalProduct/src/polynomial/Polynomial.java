package polynomial;

import java.util.Collections;
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
		return new Polynomial(Collections.unmodifiableList(Collections.singletonList(Double.valueOf(0))));
	}
	
	public static Polynomial buildConstantPolynomial(double c) {
		return new Polynomial(Collections.unmodifiableList(Collections.singletonList(Double.valueOf(c)))); 
	}
	
	public List<Double> getCoefficients(){
		return coefficients;
	}
}