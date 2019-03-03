/**
 * Write a description of class ListOfReservations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;


public class ListOfReservations extends ArrayList<Reservation>
{
    
    /**
     * Constructor for objects of class ListOfReservations
     */
    public ListOfReservations()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean addReservation( Reservation newReservationT )
    {
        
        return this.add(newReservationT);
        
    }
    
    public boolean checkNameInListOfReservations( String nameOfClientT ) {
    
        return true;
    }
}
