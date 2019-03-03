/**
 * Write a description of class ListOfOcupations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class ListOfOccupations extends ArrayList<Occupation>
{

    /**
     * Constructor for objects of class ListOfOcupations
     */
    public ListOfOccupations()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Occupation addOccupation(Occupation newOccupationT)
    {
        this.add( newOccupationT );
        
        return newOccupationT;
    }
    
    public boolean checkNameInListOfOccupations( String nameOfClientT ) {
    
        return true;
    }
    
    public Occupation getCompanyWithBiggerOccupTime() {
    
    
    
    
    
        return null;
    }
}
