package gpr.epam_houseCost;

import gpr.epam_houseCost.calculation.CostCalculation;

public class App 
{
	private CostCalculation costCalculationService;

	public App(CostCalculation costCalculationService) {
		this.costCalculationService = costCalculationService;
	}

	/**
	 * 
	 * @param area
	 * @param choiceMaterial
	 * @param choiceAutomation
	 * @return cost to build the house
	 */
	public double calculatePricing(double area, String choiceMaterial, String choiceAutomation) {
		return costCalculationService.calculateCost(area, choiceMaterial, choiceAutomation);
	}
}
