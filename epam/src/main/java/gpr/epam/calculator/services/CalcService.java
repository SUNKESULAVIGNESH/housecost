package gpr.epam.calculator.services;

public interface CalcService {
	/**
	 *
	 * @param number1
	 * @param number2
	 * @return sum of two numbers
	 */
	public int addNumber(int number1, int number2);

	/**
	 *
	 * @param number1
	 * @param number2
	 * @return multiplication of two numbers
	 */
	public int multiplyNumbers(int number1, int number2);

	/**
	 *
	 * @param number1
	 * @param number2
	 * @return division of two numbers
	 */
	public double divideNumbers(int number1, int number2);
	/**
	 * @param number1
	 * @param number2
	 * @return subtraction of two numbers
	 */
	public int subNumber(int number1, int number2);
}
