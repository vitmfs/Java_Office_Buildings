/**
 * Write a description of class SmallOrMediumCompany here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class SmallOrMediumCompany extends Company
{
    private double minimumAreaNeeded;

    /**
     * Constructor for objects of class SmallOrMediumCompany
     */
    public SmallOrMediumCompany(    String nameOfOwnerT, 
                                    String fiscalIdNumberT,
                                    String colorOfLogoTypeT,
                                    double minimumAreaNeededT) {
    
        super( nameOfOwnerT, fiscalIdNumberT, colorOfLogoTypeT );
        
        minimumAreaNeeded = minimumAreaNeededT;
        
    }
    
    public double getMinimumAreaNeeded() { return minimumAreaNeeded; }

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
