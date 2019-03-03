/**
 * Write a description of class ListOfBuildings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class ListOfBuildings extends ArrayList<Building> {

    /**
     * Constructor for objects of class ListOfBuildings
     */
    public ListOfBuildings()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Building addBuilding( Building newBuildingT ) {

        this.add( newBuildingT );

        return newBuildingT;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Building modifyBuilding( Building buildingToModifyT ) {

    
        return null;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Building deleteBuilding(Building buildingToDeleteT) {

    
        return null;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String viewBuildings() {

        String buildingsDescription = "";

        return this.toString();
    }
    
    
}
