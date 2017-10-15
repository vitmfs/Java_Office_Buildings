package office_buildings;

import java.awt.Color;

/**
 * Write a description of class Company here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Company {
	
	private String ownerOfTheCompany;
	private String taxPayerIdNumber;
	private String nameOfCompany;
	private Color colorOfCompany;
	
	public Company(String ownerOfTheCompanyT, String taxPayerIdNumberT, String nameOfCompanyT, Color colorOfCompanyT) {
		
		ownerOfTheCompany = ownerOfTheCompanyT;
		taxPayerIdNumber = taxPayerIdNumberT;
		nameOfCompany = nameOfCompanyT;
		colorOfCompany = colorOfCompanyT;
		
	}
	
	public String getOwnerOfTheCompany() {
		
		return ownerOfTheCompany;
	}
	
	public void setOwnerOfTheCompany(String ownerOfTheCompanyT) {
		
		ownerOfTheCompany = ownerOfTheCompanyT;
	}
	
	public String getTaxPayerIdNumber() {
		
		return taxPayerIdNumber;
	}
	
	public void setTaxPayerIdNumber(String taxPayerIdNumberT) {
		
		taxPayerIdNumber = taxPayerIdNumberT;
	}
	
	public String getNameOfCompany() {
		
		return nameOfCompany;
	}
	
	public void setNameOfCompany(String nameOfCompanyT) {
		
		nameOfCompany = nameOfCompanyT;
	}
	
	public Color getColorOfCompany() {
		
		return colorOfCompany;
	}
	
	public void setColorOfCompany(Color colorOfCompanyT) {
		
		colorOfCompany = colorOfCompanyT;
	}
	
	public String toString() {
		
		return "Company Name: " + getNameOfCompany() + " Tax Payer ID Number: " + getTaxPayerIdNumber() +
				" Owner: " + getOwnerOfTheCompany() + " Color: " + getColorOfCompany();
	}
	

}
