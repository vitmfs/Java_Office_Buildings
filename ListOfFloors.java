/**
 * Write a description of class ListOfFloors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class ListOfFloors extends ArrayList<Floor> {

    private String nameOfBuilding;
    private int numberOfFloorsToCreate;
    //private  int areaNeededPerFloor;
    private double lengthOfBuilding;
    private double widthOfBuilding;

    /**
     * Constructor for objects of class ListOfFloors
     */
    public ListOfFloors(    String nameOfBuildingT,
                            int numberOfFloorsToCreateT,
                            double lengthOfBuildingT,
                            double widthOfBuildingT) {
                                
        nameOfBuilding = nameOfBuildingT;
        numberOfFloorsToCreate = numberOfFloorsToCreateT;
        
        
        createFloorsAtStart( nameOfBuildingT, numberOfFloorsToCreateT, lengthOfBuildingT, widthOfBuildingT );
        
        
        
    }
    
    public String   getNameOfBuilding()             { return nameOfBuilding; }
    public int      getNumberOfFloorsToCreate()     { return numberOfFloorsToCreate; }
    
    public void createFloorsAtStart( String nameOfBuildingT, int numberOfFloorsToCreateT, double lengthOfBuildingT, double widthOfBuildingT ) {
        
        for ( int i = 0; i < numberOfFloorsToCreateT; i++ ) {
            
            Floor tempFloor = new Floor( "Floor " + i  +" " + nameOfBuildingT, lengthOfBuildingT, widthOfBuildingT );
            
            this.add( tempFloor );
            
            System.out.println( tempFloor + " created!" );

        }

    }

    
    
    public Floor addFloor( Floor newFloorT ) {
    
    
        if ( this.add( newFloorT ) ) {
        
                return newFloorT;
        
        }
        
        return null;
        
    }
    
    public int getRateOfOccupations() {
    
    
        return 0;
    }
    
    public int getRateOfReservation() {
    
    
        return 0;
    }
}
