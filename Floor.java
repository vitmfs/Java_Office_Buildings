/**
 * Write a description of class Floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Floor extends ArrayList<Office> implements IStructure
{
    
    private String  nameOfFloor;
    private double  lengthOfFloor;
    private double  widthOfFloor;
    
    /**
     * Constructor for objects of class Floor
     */
    public Floor(   String nameOfFloorT, 
                    double lengthOfFloorT,
                    double widthOfFloorT) {
        
        nameOfFloor     = nameOfFloorT;
        lengthOfFloor   = lengthOfFloorT;
        widthOfFloor    = widthOfFloorT;

    }
    
    public void getName() {
    
    }
    
    public void enter() {
    
    }
    
    
    public void exit() {
    
    }
    
    
    public void location() {
    
    
    }
    
    public String toString() {
        
        return "Name of Floor: " + nameOfFloor ;
    
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }

    public Office addOffice( Office newOfficeT ) {

        this.add( newOfficeT );
        
        return newOfficeT;

    }
}
