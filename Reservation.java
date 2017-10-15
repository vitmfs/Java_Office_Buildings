package office_buildings;

import java.time.LocalDateTime;

public class Reservation {
	
	private LocalDateTime dateOfReservation;
	private Office reservedOffice;
	private String potentialClientName;
	
	public Reservation(String potentialClientNameT, Office reservedOfficeT) {
		
		dateOfReservation = LocalDateTime.now();
		potentialClientName = potentialClientNameT;
		reservedOffice = reservedOfficeT;
	}
	
	public LocalDateTime getDateOfReservation() {
		
		return dateOfReservation;
	}
	
	public String getPotentialClientName() {
		
		return potentialClientName;
	}
	
	public String setPotentialClientName(String potentialClientNameT) {
		
		return potentialClientName;
	}
	
	public Office getReservedOffice() {
		
		return reservedOffice;
	}
	
	public void setReservedOffice(Office reservedOfficeT) {
		
		reservedOffice = reservedOfficeT;
	}
	
	public String toString() {
		
		return "Office " + this.getReservedOffice().getIdCodeOfOffice() + " was reserved by " +
				getPotentialClientName() + "in " + getDateOfReservation().toString();
	}

}
