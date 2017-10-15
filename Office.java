package office_buildings;

import java.util.ArrayList;

/**
 * Write a description of class Office here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Office {
	
	private String idCodeOfOffice;
	
	private boolean isOccupied;
	private boolean isReserved;
	
	private double lengthOfOffice;
	private double widthOfOffice;
	
	private ArrayList<Occupation> occupations;
	
	private Reservation reservation;
	
	public Office(String idCodeOfOfficeT, double lengthOfOfficeT, double widthOfOfficeT) {
		
		idCodeOfOffice = idCodeOfOfficeT;
		lengthOfOffice = lengthOfOfficeT;
		widthOfOffice = widthOfOfficeT;
		isOccupied = false;
		isReserved = false;
		reservation = null;
		
		occupations = new ArrayList<Occupation>();
		
	}
	

	
	public String getIdCodeOfOffice() {
		
		return idCodeOfOffice;
	}
	
	public void setIdCodeOfOffice(String idCodeOfOfficeT) {
		
		idCodeOfOffice = idCodeOfOfficeT;
	}
	
	public boolean getIsOccupied() {
		
		return isOccupied;
		
	}
	
	public void setIsOccupied(boolean isOccupiedT) {
		
		isOccupied = isOccupiedT;
		
	}
	
	public boolean getIsReserved() {
		
		return isReserved;
	}
	
	public void setIsReserved(boolean isReservedT) {
		
		isReserved = isReservedT;
	}
	
	public double getLengthOfOffice() {
		
		return lengthOfOffice;
	}
	
	public double getWidthOfOffice() {
		
		return widthOfOffice;
	}
	
	public double getAreaOfOffice() {
		
		return lengthOfOffice * widthOfOffice;
	}
	
	public void addOccupation(Occupation newOccupationT) {
		
		occupations.add(newOccupationT);
	}
	
	public Reservation getReservation() {
		
		return reservation;
	}
	
	public void setReservation(Reservation newReservationT) {
		
		reservation = newReservationT;
		
		if (getReservation() != null) {
			
			setIsReserved(true);
			
		} else {
			
			setIsReserved(false);
		}
	}
	
	public ArrayList<Occupation> getOccupations() {
		
		return occupations;
	}
	
	public String toString() {
		
		String occupiedStatus = (getIsOccupied())?"Occupied by " + occupations.get(occupations.size()-1).getCompanyThatOccupied().getNameOfCompany():"Free";
		String reservedStatus = (getIsReserved())?"Reserved by " + reservation.getPotentialClientName() : "Not Reserved";
		
		return "\t" + getIdCodeOfOffice() + ":  " + getAreaOfOffice() + " square meters (" + getLengthOfOffice() + " by " + 
				getWidthOfOffice() + ") " + occupiedStatus + " " + reservedStatus;
	}

}


