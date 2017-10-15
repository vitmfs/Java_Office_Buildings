package office_buildings;

import java.util.ArrayList;
import java.math.BigDecimal;

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building {
	
	private String nameOfBuilding;
	private String addressOfBuilding;
	
	private double lengthOfBuilding;
	private double widthOfBuilding;
	private double lengthOfOffices;
	private double widthOfOffices;
	
	private int numberOfFloors;
	private int numberOfOfficesPerFloor;

	private char dispositionOfOffices;
	
	private BigDecimal priceOfOfficePerDay;
	
	private ArrayList<Floor> floorsOfBuilding;
	private ArrayList<Office> offices;
	private ArrayList<Reservation> reservations;
	
	
	
	public Building(String nameOfBuildingT, String addressOfBuildingT,
					double lengthOfBuildingT, double widthOfBuildingT,
					int numberOfFloorsT, int numberOfOfficesPerFloorT,
					double lengthOfOfficesT, double widthOfOfficesT,
					BigDecimal priceOfOfficePerDayT) {
		
		nameOfBuilding = nameOfBuildingT;
		addressOfBuilding = addressOfBuildingT;
		lengthOfBuilding = lengthOfBuildingT;
		widthOfBuilding = widthOfBuildingT;
		numberOfFloors = numberOfFloorsT;
		numberOfOfficesPerFloor = numberOfOfficesPerFloorT;
		lengthOfOffices = lengthOfOfficesT;
		widthOfOffices = widthOfOfficesT;
		
		floorsOfBuilding = new ArrayList<Floor>();
		offices = new ArrayList<Office>();
		reservations = new ArrayList<Reservation>();
	}
	
	public double getRateOfOccupation() {
		
		int numberOfOccupiedOffices = 0;
		
		for (Office eachOffice: getOffices()) {
			
			if (eachOffice.getIsOccupied()) {
				
				numberOfOccupiedOffices++;
			}
		}
		
		
		int numberOfOfficesInTheBuilding = getNumberOfFloors() * getNumberOfOfficesPerFloor();
		
		if (numberOfOfficesInTheBuilding != 0) {
			
			return numberOfOccupiedOffices / numberOfOfficesInTheBuilding;
			
		} else {
			
			return 0.0;
		}
		
		
	}
	
	public ArrayList<Office> getOffices() {
		
		return offices;
	}
	
	public String toString() {
		
		String descriptionOfBuilding = (getNameOfBuilding() + " in " + getAddressOfBuilding() + "\n\n").toUpperCase();
		
		for (Floor eachFloor: floorsOfBuilding) {
			
			descriptionOfBuilding += "\t" + eachFloor.toString();
		}
		
		return descriptionOfBuilding;
	}
	
	
	
	public String getNameOfBuilding() {
		
		return nameOfBuilding;
		
	}
	
	public void setNameOfBuilding(String nameOfBuildingT) {
		
		nameOfBuilding = nameOfBuildingT;
	}
	
	public String getAddressOfBuilding() {
		
		return addressOfBuilding;
	}
	
	public ArrayList<Floor> getFloorsOfBuilding() {
		
		return floorsOfBuilding;
	}
	
	public char getDispositionOfOffices() {
		
		return dispositionOfOffices;
	}
	
	public int getNumberOfFloors() {
		
		return numberOfFloors;
	}
	
	public int getNumberOfOfficesPerFloor() {
		
		return numberOfOfficesPerFloor;
	}
	
	public double getAreaOfOffices() {
		
		return lengthOfOffices * widthOfOffices;
	}
	
	public double getLengthOfOffices() {
		
		return lengthOfOffices;
	}
	
	public double getWidthOfOffices() {
		
		return widthOfOffices;
	}
	
	public void setLengthOfOffices(double lengthOfOfficesT) {
		
		lengthOfOffices = lengthOfOfficesT;
	}
	
	public void setWidthOfOffices(double widthOfOfficesT) {
		
		widthOfOffices = widthOfOfficesT;
	}
	
	public double getLengthOfBuilding() {
		
		return lengthOfBuilding;
	}
	
	public double getWidthOfBuilding() {
		
		return widthOfBuilding;
	}
	
	public ArrayList<Reservation> getReservations() {
		
		return reservations;
	}

	
	

}
