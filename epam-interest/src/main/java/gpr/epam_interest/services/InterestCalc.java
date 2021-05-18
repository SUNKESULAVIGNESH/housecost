package gpr.epam_interest.services;

public interface InterestCalc {
	/**
	 *
	 * @param {double} principalAmount
	 * @param {double} rate
	 * @param {int} time
	 * @return {double} simpleInterest
	 */
	public double calculateSimpleInterest(double principalAmount, double rate, int time);

	/**
	 *
	 * @param {double} principalAmount
	 * @param {double} rate
	 * @param {int} time
	 * @return {double} compoundInterest
	 */
	public double calculateCompoundInterest(double principalAmount, double rate, int time);

}
