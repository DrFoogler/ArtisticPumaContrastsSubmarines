/**
 * This class demonstrates the awesome power of <code>Javadoc</code>.
 * At the same time, students will see some more examples of methods.
 * @author mferraro <a href="mailto:mferraro@balstaff.org">email</a>
 */
public class MathGenie {
	private double mainNumber;
	
	/**
	 * @param num the number on which to perform operations
	 */
	public MathGenie(double num) {
		mainNumber = num;
	}
	
	/**
	 * multiplies <code>mainNumber</code> by 4 and returns that value
	 * @return value that is <code>mainNumber</code> times 4
	 */
	public double quadruple() {
		return 4 * mainNumber;
	}
	
	/**
	 * finds and returns the square root of <code>mainNumber</code>
	 * @return square root of <code>mainNumber</code>
	 */
	public double sqrt() {
		return Math.sqrt(mainNumber);
	}
	
	/**
	 * returns the result of dividing <code>mainNumber</code> by the input parameter
	 * requires that <code>divisor</code> be non-zero
	 * 
	 * @param divisor number by which to divide <code>mainNumber</code>
	 * @return quotient of <code>mainNumber</code> and parameter <code>divisor</code>
	 */
	public double divideBy(double divisor) {
		return mainNumber / divisor;
	}
}