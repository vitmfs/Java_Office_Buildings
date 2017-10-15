package office_buildings;

import java.awt.Color;

/**
 * Write a description of class Company here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallMediumEnterprise extends Company {
	
	private double minimumAreaRequired;
	
	public SmallMediumEnterprise(String ownerOfTheSEM_T, String taxPayerIdNumberT, String nameOfSME_T, Color colorOfSMT_T, double minimumAreaRequiredT) {
		
		super(ownerOfTheSEM_T, taxPayerIdNumberT, nameOfSME_T, colorOfSMT_T);
		
		minimumAreaRequired = minimumAreaRequiredT;
	}
	
	public double getMinimumAReaRequired() {
		
		return minimumAreaRequired;
	}
	
	public void setMinimumAReaRequired(double minimumAreaRequiredT) {
		
		minimumAreaRequired = minimumAreaRequiredT;
	}
}
