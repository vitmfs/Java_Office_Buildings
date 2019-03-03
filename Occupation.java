/**
 * Write a description of class Occupation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.time.LocalDateTime;

public class Occupation
{
    // instance variables - replace the example below with your own
    private Company presentCompany;
    private LocalDateTime dateOfOccupation;
    
    
    

    /**
     * Constructor for objects of class Occupation
     */
    public Occupation( Company companyT)
    {
        presentCompany = companyT;
        dateOfOccupation = LocalDateTime.now();
    }
    
    
    public Company getPresentCompany()      { return presentCompany; }
    public LocalDateTime dateOfOccupation() { return dateOfOccupation; }
    
   

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
}
