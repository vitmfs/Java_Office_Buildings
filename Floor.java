package office_buildings;

import java.util.ArrayList;

/**
* Write a description of class Floor here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Floor {
	
	private String nameOfFloor;
	private double lengthOfFloor;
	private double widthOfFloor;
	private ArrayList<Office> floorOffices;
	
	public Floor(String NameOfFloorT, double lengthOfFloorT, double widthOfFloorT) {
		
		nameOfFloor = NameOfFloorT;
		lengthOfFloor = lengthOfFloorT;
		widthOfFloor = widthOfFloorT;
		floorOffices = new ArrayList<Office>();
	}
	
	public String toString() {
		
		String descriptionOfFloor = "\n\t" + getNameOfFloor() + " " +  getAreaOfFloor() + " square meters " + " (" + getLengthOfFloor() + " by " + getWidthOfFloor() + ")\n\n";
		
		for (Office eachOffice: floorOffices) {
			
			descriptionOfFloor += "\t" + eachOffice.toString() + "\n";
			
		}
		
		return descriptionOfFloor;
	}
	
	public String getNameOfFloor() {
		
		return nameOfFloor;
	}
	
	public void setNameOfFloor(String nameOfFloorT) {
		
		nameOfFloor = nameOfFloorT;
	}
	
	public double getLengthOfFloor() {
		
		return lengthOfFloor;
	}
	
	public double getWidthOfFloor() {
		
		return widthOfFloor;
	}
	
	public ArrayList<Office> getFloorOffices() {
		
		return floorOffices;
	}
	
	public void addOffice(Office newOfficeT) {
		
		floorOffices.add(newOfficeT);
		
	}
	
	public double getAreaOfFloor() {
		
		return getLengthOfFloor() * getWidthOfFloor();
	}
	
	public int calcuteCapacity(double officesLengthT, double officesWidthT) {
		
		int maximumCapacity = 0;
		
		double timesThatOfficeLengthFitsFloorLength = new Double(lengthOfFloor/officesLengthT);
		int timesThatOfficeLengthFitsFloorLengthInt = (int) timesThatOfficeLengthFitsFloorLength;
		
		double timesThatOfficeWidthFitsFloorWidth = new Double(widthOfFloor/officesWidthT);
		int timesThatOfficeWidthFitsFloorWidthInt = (int) timesThatOfficeWidthFitsFloorWidth;
		
		int howManyOficesCanIFitOption1 = (timesThatOfficeLengthFitsFloorLengthInt * timesThatOfficeWidthFitsFloorWidthInt);

		double timesThatOfficeWidthFitsFloorLength = new Double(lengthOfFloor/officesWidthT);
		int timesThatOfficeWidthFitsFloorLengthInt = (int) timesThatOfficeWidthFitsFloorLength;
		
		double timesThatOfficeLengthFitsFloorWidth = new Double(widthOfFloor/officesWidthT);
		int timesThatOfficeLengthFitsFloorWidthInt = (int) timesThatOfficeLengthFitsFloorWidth;
		
		int howManyOficesCanIFitOption2 = timesThatOfficeWidthFitsFloorLengthInt * timesThatOfficeLengthFitsFloorWidthInt;
		
		maximumCapacity = (howManyOficesCanIFitOption1 > howManyOficesCanIFitOption2)?howManyOficesCanIFitOption1:howManyOficesCanIFitOption2;
		
		return maximumCapacity;
	}
}
