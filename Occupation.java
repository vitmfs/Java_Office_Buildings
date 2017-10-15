package office_buildings;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.math.BigDecimal;

/**
 * Write a description of class Occupation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Occupation {
	
	private LocalDateTime arrivalDate;
	private LocalDateTime expectedExitDate;
	private LocalDateTime actualExitDate;
	private Company companyThatOccupied;
	private Office occupiedOffice;
	private BigDecimal priceOfOccupation;
	
	public Occupation(Company companyThatOccupiedT, Office occupiedOfficeT) {
		
		arrivalDate = LocalDateTime.now();
		companyThatOccupied = companyThatOccupiedT;
		occupiedOffice = occupiedOfficeT;
		expectedExitDate = null;
		actualExitDate = null;
		priceOfOccupation = BigDecimal.ZERO;
	}
	
	public LocalDateTime getArrivalDate() {
		
		return arrivalDate;
	}
	
	public void setArrivalDate(LocalDateTime arrivalDateT) {
		
		arrivalDate = arrivalDateT;
		
	}
	
	public LocalDateTime getExpectedExitDate() {
		
		return expectedExitDate;
	}
	
	public void setExpectedExitDate(LocalDateTime expectedExitDateT) {
		
		expectedExitDate = expectedExitDateT;
		
	}
	
	public LocalDateTime getActualExitDate() {
		
		return actualExitDate;
	}
	
	public void setActualExitDate(LocalDateTime actualExitDateT) {
		
		actualExitDate = actualExitDateT;
		
	}
	
	public BigDecimal getPriceOfOccupation(BigDecimal pricePerDayT) {
		
		if (actualExitDate != null) {
			
			long daysInTheOffice = ChronoUnit.DAYS.between(arrivalDate, actualExitDate);
			BigDecimal totalToPlay = pricePerDayT.multiply(new BigDecimal(daysInTheOffice));
			return totalToPlay;
		} else {
			
			return BigDecimal.ZERO;
		}
		
		
	}
	
	public Office getOccupiedOffice() {
		
		return occupiedOffice;
	}
	
	public Company getCompanyThatOccupied() {
		
		return companyThatOccupied;
	}
	public String toString() {
		
		return "";
	}
	
}
