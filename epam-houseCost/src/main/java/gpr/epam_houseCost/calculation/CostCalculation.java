package gpr.epam_houseCost.calculation;

public interface CostCalculation {
	/**
	 * 
	 * @param {double} area
	 * @param {String} choiceMaterial
	 * @param {String} choiceAutomation
	 * @return {double} cost per Area(square feet)
	 */

	public double calculateCost(double area, String choiceMaterial, String choiceAutomation);

}
