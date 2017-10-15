package office_buildings;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.awt.Color;

public class MainConsoleOfficeBuildings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Building> buildings = loadBuildings();
		
		
		showAllBuildings(buildings);
		
		
		
		
		
		
		System.out.println("Welcome to Office Spaces!");
		
		Scanner scanner = new Scanner(System.in);
		
		int opcaoEscolhida = 0;
		
		do {
			
			try {
				
				imprimeOpcoes();
				opcaoEscolhida = Integer.parseInt(scanner.next());
				
				
			} catch (Exception e) {
				
				opcaoEscolhida = 999;
				
			}
			
			
			
		} while (opcaoEscolhida != 1 &&
				opcaoEscolhida != 2 &&
				opcaoEscolhida != 3 &&
				opcaoEscolhida != 4 &&
				opcaoEscolhida != 5 &&
				opcaoEscolhida != 6 &&
				opcaoEscolhida != 7 &&
				opcaoEscolhida != 8 &&
				opcaoEscolhida != 0);
		
		
		
		while (opcaoEscolhida != 0) {
			
			
			
			switch (opcaoEscolhida) {
			
				case 1:
					System.out.println("1) Visualize Building");
					
					System.out.print("\nPlease enter the name of building: ");
					
					String givenNameOfBuilding = scanner.next();
					
					boolean found = false;
					
					int i = 0;
					
					while (i < buildings.size()) {
						
						if (buildings.get(i).getNameOfBuilding().toLowerCase().contains(givenNameOfBuilding.toLowerCase())) {
							
							System.out.println(buildings.get(i));
							found = true;
							break;
						}
						
						i++;
					}
					
					if (found == false) {
						
						System.out.println("Bulding not found!");
					}
					
					createFile();
					break;
					
				case 2:
					System.out.println("2) Check Office");
					
					System.out.print("\nPlease enter the name of the Office: ");
					
					String givenNameOfOffice = scanner.next();
					
					System.out.println(searchOffice(buildings, givenNameOfOffice));
					
					break;
					
				case 3:
					System.out.println("3) Search by Company Name or Owner");
					
					System.out.print("\nPlease enter Company Name or Owner Name ");
					
					String currrentCompanyOrOwner = scanner.next();
					
					boolean compNameOrOwnerNameFound = false;
					
					for (Building eachBuilding: buildings) {
						
						for (Floor eachFloor: eachBuilding.getFloorsOfBuilding()) {
							
							for (Office eachOffice: eachFloor.getFloorOffices()) {
								
								if (eachOffice.getIsOccupied()) {
									
									// gets current company
									Company currrentCompany = eachOffice.getOccupations().get(eachOffice.getOccupations().size() - 1).getCompanyThatOccupied();
									
									if (currrentCompany.getNameOfCompany().trim().equalsIgnoreCase(currrentCompanyOrOwner.trim()) ||
											currrentCompany.getOwnerOfTheCompany().trim().equalsIgnoreCase(currrentCompanyOrOwner.trim())) {
										
										compNameOrOwnerNameFound = true;
										System.out.println(currrentCompanyOrOwner + " found! Currently located in " + eachOffice.toString());
										
									}
									
									
								}
								
								if (eachOffice.getIsReserved()) {
									
									
									if(eachOffice.getReservation().getPotentialClientName().trim().toLowerCase().contains(currrentCompanyOrOwner.trim().toLowerCase())) {
										
										compNameOrOwnerNameFound = true;
										System.out.println(currrentCompanyOrOwner + " found! Currently has a reservation to " + eachOffice.toString());
										
									}
								}
							}
						}
					}
					
					if (compNameOrOwnerNameFound == false) {
						
						System.out.println("Nothing was found!");
					}
					
					break;
					
				case 4:
					System.out.println("4) Install new Company");
					
					
					char companyType; 
					do {
						
						System.out.println("Is it a (S)tartUp or a Small Or (M)edium Company?");
						companyType = scanner.next().toUpperCase().charAt(0);
					} while (companyType != 'S' && companyType != 'M');
					
					System.out.println("What is the name of the Owner of the StartUp?");
					String nameOfOwnerOfStartUp = scanner.next();
					scanner.nextLine();
					
					System.out.println("What is the taxpayer number of the StartUp?");
					String taxpayerNumberOfStartUp = scanner.next();
					scanner.nextLine();
					
					System.out.println("What is the name of the StartUp?");
					String nameOfOfStartUp = scanner.next();
					scanner.nextLine();
					
					/*
					System.out.println("What is the color of the StartUp?");
					String colorOfOfStartUp = scanner.next();
					scanner.nextLine();
					*/
					
					System.out.println("What is the first RGB value?");
					float firstColorOfOfStartUp = Float.parseFloat(scanner.next());
					scanner.nextLine();
					
					System.out.println(firstColorOfOfStartUp);
					
					System.out.println("What is the second RGB value?");
					float secondColorOfOfStartUp = Float.parseFloat(scanner.next());
					scanner.nextLine();
					
					System.out.println(secondColorOfOfStartUp);
					
					System.out.println("What is the third RGB value?");
					float thirdColorOfOfStartUp = Float.parseFloat(scanner.next());
					scanner.nextLine();
					
					System.out.println(thirdColorOfOfStartUp);
					
					// Color colorOfCompany = new Color(firstColorOfOfStartUp, secondColorOfOfStartUp, thirdColorOfOfStartUp);
					
					Color colorOfCompany = Color.BLUE;
					
					Company newPMECompany = null;;
					Company newStartUpCompany = null;
					
					if (companyType == 'M') {
						
						System.out.println("What is the minumum area required?");
						double minimumAreaRequired = Double.parseDouble(scanner.next());
						scanner.nextLine();
						
						newPMECompany = new SmallMediumEnterprise(nameOfOwnerOfStartUp, taxpayerNumberOfStartUp, nameOfOfStartUp, colorOfCompany, minimumAreaRequired);
						
					} else {
						
						newStartUpCompany = new StartUp(nameOfOwnerOfStartUp, taxpayerNumberOfStartUp, nameOfOfStartUp, colorOfCompany);
					}
					
					System.out.println("What is the code of Office to fill?");
					String codeOfOfficeToFill = scanner.next();
					scanner.nextLine();
					
					Office officeToFill = searchOffice(buildings, codeOfOfficeToFill);
					
					if (officeToFill != null) {
						
						officeToFill.setIsOccupied(true);
						if ((companyType == 'M' && newPMECompany != null)) {
							
							Occupation newOccupation = new Occupation(newPMECompany, officeToFill);
							officeToFill.getOccupations().add(newOccupation);
							officeToFill.setIsOccupied(true);
							
							
						}
						
						if ((companyType == 'S' && newStartUpCompany != null)) {
							
							Occupation newOccupation = new Occupation(newStartUpCompany, officeToFill);
							officeToFill.getOccupations().add(newOccupation);
							officeToFill.setIsOccupied(true);
							
							
						}
						
					}
					
					System.out.println(officeToFill);


					
					break;
					
				case 5:
					System.out.println("5) Make a Reservation");
					
					System.out.println("What is the name of the potential client?");
					String potentialClient = scanner.next();
					scanner.nextLine();
					
					System.out.println(potentialClient);
					
					System.out.println("What is the code of the Office?");
					String officeCode = scanner.next();
					scanner.nextLine();
					
					System.out.println(officeCode);
					
					
					Office searchedOffice = searchOffice(buildings, officeCode);
					
					System.out.println(officeCode);
					
					System.out.println(makeReservation(potentialClient, searchedOffice, buildings));
					
					
					
					
					break;
					
				case 6:
					
					System.out.println("6) Insert new Building");
					
					System.out.println("Insert name of New Building");
					String nameOfNewBuilding = scanner.next();
					scanner.nextLine();
					
					System.out.println("Insert Address of New Building");
					String addressOfNewBuilding = scanner.next();
					scanner.nextLine();
					
					System.out.println("Insert Length of New Building");
					double lengthOfNewBuilding = Double.parseDouble(scanner.next());
					scanner.nextLine();
					
					System.out.println("Insert Width of New Building");
					double widthOfNewBuilding = Double.parseDouble(scanner.next());
					scanner.nextLine();
					
					System.out.println("Insert number number of Floors of New Building");
					int numberOfFloorsOfNewBuilding = Integer.parseInt(scanner.next());
					scanner.nextLine();
					
					System.out.println("6) Insert number number of Offices per Floor of New Building");
					int numberOfOfficesPerFloorOfNewBuilding = Integer.parseInt(scanner.next());
					scanner.nextLine();
					
					System.out.println("6) Insert Length of Offices in New Building");
					double lengthOfOfficesNewBuilding = Double.parseDouble(scanner.next());
					scanner.nextLine();
					
					System.out.println("6) Insert Width  of Offices of New Building");
					double widthOfOfOfficesNewBuilding = Double.parseDouble(scanner.next());
					scanner.nextLine();
					
					System.out.println("6) Insert Price per day of occupation  of New Building");
					BigDecimal pricePerday = new BigDecimal(scanner.next());
					scanner.nextLine();
					
					insertNewBuilding(buildings, nameOfNewBuilding, addressOfNewBuilding,
							lengthOfNewBuilding, widthOfNewBuilding, numberOfFloorsOfNewBuilding, numberOfOfficesPerFloorOfNewBuilding,
							lengthOfOfficesNewBuilding, widthOfOfOfficesNewBuilding, pricePerday);
					
					
					
					
					
					break;
					
				case 7:
					System.out.println("7) Delete Building");
					
					System.out.println("Insert name of Building to delete");
					String nameOfBuildingToDelete = scanner.next();
					scanner.nextLine();
					
					Building buildingForDeletion = null;
					
					for (Building eachBuliding: buildings) {
						
						if (nameOfBuildingToDelete.trim().toLowerCase().equals(eachBuliding.getNameOfBuilding().trim().toLowerCase())) {
							
							buildingForDeletion = eachBuliding;
						}
					}
					
					if (buildingForDeletion != null) {
						
						buildings.remove(buildingForDeletion);
						System.out.println("Building deleted!");
						
					} else {
						
						System.out.println("Building not found!");
						
					}
					
					
					break;
					
				case 8:
					System.out.println("8) Oldest Company in Building");
					
					System.out.println("Insert name of Building");
					String nameOfBuilding = scanner.next();
					scanner.nextLine();
					
					for (Building eachBuilding: buildings) {
						
						if (eachBuilding.getNameOfBuilding().trim().equalsIgnoreCase(nameOfBuilding.trim())) {
							
							for (Floor eachFloor: eachBuilding.getFloorsOfBuilding()) {
								
								for (Office eachOffice: eachFloor.getFloorOffices()) {
									
									if (eachOffice.getIsOccupied()) {
										
										Occupation currentOccupation = eachOffice.getOccupations().get(eachOffice.getOccupations().size() - 1);
										
										System.out.println(eachOffice);
									}
								}
								
							}
							
							
						}
					}
					
					
					break;
					
				default:
					System.out.println("I don't know that option!");
					break;
			
			
			
			
			
			
			
			
			
			
			}
			
			
			
			do {
				
				try {
					
					imprimeOpcoes();
					opcaoEscolhida = Integer.parseInt(scanner.next());
					
					
				} catch (Exception e) {
					
					opcaoEscolhida = 999;
					
				}
				
				
				
			} while (opcaoEscolhida != 1 &&
					opcaoEscolhida != 2 &&
					opcaoEscolhida != 3 &&
					opcaoEscolhida != 4 &&
					opcaoEscolhida != 5 &&
					opcaoEscolhida != 6 &&
					opcaoEscolhida != 7 &&
					opcaoEscolhida != 8 &&
					opcaoEscolhida != 0);
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println("Thank you, have a nice day!");
		scanner.close();
		
		
	}
	
	
	public static void imprimeOpcoes() {
		
		System.out.println("\n");
		
		System.out.println("1) Visualize Building");
		System.out.println("2) Check Office");
		System.out.println("3) Search by Company Name or Owner");
		System.out.println("4) Install new Company");
		System.out.println("5) Make a Reservation");
		System.out.println("6) Insert New Building");
		System.out.println("7) Delete Building");
		System.out.println("8) Oldest Company in Building");
		System.out.println("0) Sair");
		
		System.out.print("\nOpção Escolhida: \n");
		
	}
	
	public static void createFile() {
		
		try {
			
			PrintWriter writer = new PrintWriter("buildings.txt", "UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.close();
			
		} catch (IOException e) {
			
			
		}
	}
	
	public static ArrayList<Building> loadBuildings() {
		
		ArrayList<Building> createdBuildings = new ArrayList<Building>();
		
		Building building_one = new Building("Alpha", "Alpha Street nº1 Alabama", 50.0, 30.0, 11, 4, 4, 4, new BigDecimal(100));
		for (int i = 0; i < building_one.getNumberOfFloors(); i++) {
			
			Floor newFloor = new Floor( (building_one.getNameOfBuilding() + "_FL" + i),
										building_one.getLengthOfBuilding(),
										building_one.getWidthOfBuilding());
			
			for (int x = 0; x < building_one.getNumberOfOfficesPerFloor(); x++) {
				
				Office newOffice = new Office( (newFloor.getNameOfFloor().substring(0, 3).toUpperCase() + "_F" + i + "_OFF" + (x + 1)), 4, 4);
				newFloor.getFloorOffices().add(newOffice);
			}
			
			building_one.getFloorsOfBuilding().add(newFloor);
		}
		
		
		
		
		Building building_two = new Building("Beta", "Boolean Street nº2 Boise", 70, 30, 22, 6, 3, 5, new BigDecimal(200));
		for (int j = 0; j < building_two.getNumberOfFloors(); j++) {
			
			Floor newFloor = new Floor( (building_two.getNameOfBuilding() + "_FL" + j),
										building_two.getLengthOfBuilding(),
										building_two.getWidthOfBuilding());
			
			for (int y = 0; y < building_two.getNumberOfOfficesPerFloor(); y++) {
				
				Office newOffice = new Office( (newFloor.getNameOfFloor().substring(0, 3).toUpperCase() + "_F" + j + "_OFF" + (y + 1)), 5, 3);
				newFloor.getFloorOffices().add(newOffice);
			}
			
			building_two.getFloorsOfBuilding().add(newFloor);
		}
		
		
		
		
		Building building_three = new Building("City", "City Street nº3 Alabama", 100, 60, 33, 8,6, 6, new BigDecimal(300));
		for (int k = 0; k < building_three.getNumberOfFloors(); k++) {
			
			Floor newFloor = new Floor( (building_three.getNameOfBuilding() + "_FL" + k),
										building_three.getLengthOfBuilding(),
										building_three.getWidthOfBuilding());
			
			for (int z = 0; z < building_two.getNumberOfOfficesPerFloor(); z++) {
				
				Office newOffice = new Office( (newFloor.getNameOfFloor().substring(0, 3).toUpperCase() + "_F" + k + "_OFF" + (z + 1)), 10, 6);
				newFloor.getFloorOffices().add(newOffice);
			}
			
			building_three.getFloorsOfBuilding().add(newFloor);
		}
		
		createdBuildings.add(building_one);
		createdBuildings.add(building_two);
		createdBuildings.add(building_three);
		
		/*
		  	ALP_F10_OFF1:  16.0 square meters (4.0 by 4.0) Free
		    ALP_F10_OFF2:  16.0 square meters (4.0 by 4.0) Free
			ALP_F10_OFF3:  16.0 square meters (4.0 by 4.0) Free
			ALP_F10_OFF4:  16.0 square meters (4.0 by 4.0) Free
		 */
		
		Office firstOfficeToReserve = searchOffice(createdBuildings, "ALP_F10_OFF1");
		Reservation reservation_one = new Reservation("Arnie Arnold", firstOfficeToReserve);
		firstOfficeToReserve.setReservation(reservation_one);
		
		Office secondOfficeToReserve = searchOffice(createdBuildings, "ALP_F10_OFF2");
		Reservation reservation_two = new Reservation("Bernardo Bertulucci", secondOfficeToReserve);
		secondOfficeToReserve.setReservation(reservation_two);
		
		Office thirdfficeToReserve = searchOffice(createdBuildings, "ALP_F10_OFF3");
		Reservation reservation_three = new Reservation("Carlos Centos", thirdfficeToReserve);
		thirdfficeToReserve.setReservation(reservation_three);
		
		
		return createdBuildings;
	}
	
	public static boolean makeReservation(String nameOfPotentialClientT, Office officeToBeReservedT, ArrayList<Building> buildingsT) {
		
		if (officeToBeReservedT != null) {
			
			if ( (officeToBeReservedT.getReservation() == null)  && (officeToBeReservedT.getIsReserved() == false) ) {
				
				Reservation myReservation = new Reservation(nameOfPotentialClientT, officeToBeReservedT);
				
				for (Building building: buildingsT) {
					
					if (officeToBeReservedT.getIdCodeOfOffice().substring(0, 3).toLowerCase().equals(building.getNameOfBuilding().substring(0, 3).toLowerCase())) {
						
						building.getReservations().add(myReservation);
						officeToBeReservedT.setReservation(myReservation);
						return true;
					}
				}
				return false;
			}
			
			return false;
			
		}
		
		return false;
		
		
	}
	
	public static boolean insertNewBuilding(ArrayList<Building> buildingsT, String nameOfBuildingT, String addressOfBuildingT,
										double lengthOfBuildingT, double widthOfBuildingT, int numberOfFloorsT, 
										int numberOfOfficesPerFloorT, double lengthOfOfficesT, double widthOfOfficesT,
										BigDecimal priceOfOfficePerDayT) {
		
		Building buildindToInsert = new Building(nameOfBuildingT, addressOfBuildingT, lengthOfBuildingT, widthOfBuildingT, numberOfFloorsT, 
				numberOfOfficesPerFloorT, lengthOfOfficesT, widthOfOfficesT, priceOfOfficePerDayT);
		
		for (int i = 0; i < buildindToInsert.getNumberOfFloors(); i++) {
			
			Floor newFloor = new Floor( (buildindToInsert.getNameOfBuilding() + "_FL" + i),
					buildindToInsert.getLengthOfBuilding(),
					buildindToInsert.getWidthOfBuilding());
			
			for (int x = 0; x < buildindToInsert.getNumberOfOfficesPerFloor(); x++) {
				
				Office newOffice = new Office( (newFloor.getNameOfFloor().substring(0, 3).toUpperCase() + "_F" + i + "_OFF" + (x + 1)), 4, 4);
				newFloor.getFloorOffices().add(newOffice);
			}
			
			buildindToInsert.getFloorsOfBuilding().add(newFloor);
		}
		
		if (buildingsT != null && buildindToInsert != null) {
			
			buildingsT.add(buildindToInsert);
			return true;

		}
		
		return false;
		
		
		
		
	}
	
	public static Office searchOffice(ArrayList<Building> buildingsT, String codeOfOfficeT) {
		
		for (Building eachBuilding: buildingsT) {
			
			for (Floor eachFloor: eachBuilding.getFloorsOfBuilding()) {
				
				for (Office eachOffice: eachFloor.getFloorOffices()) {
					
					if (eachOffice.getIdCodeOfOffice().equals(codeOfOfficeT)) {
						
						return eachOffice;
					}
				}
			}
		}
		
		return null;
		
		
	}
	
	public static void showAllBuildings(ArrayList<Building> buildingsT) {
		
		for (Building eachBuilding: buildingsT) {
			
			System.out.println(eachBuilding);
		}
		
		
	}
	
	public static void showMeTheMoney(Object whateverObjectT) {
		
		System.out.println(whateverObjectT);
		
		
	}

}
