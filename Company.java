/**
 * Write a description of class Company here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Company {

    private String nameOfOwner;
    private String fiscalIdNumber;
    private String colorOfLogoType;

    /**
     * Constructor for objects of class Company
     */
     public Company(    String nameOfOwnerT, 
                        String fiscalIdNumberT,
                        String colorOfLogoTypeT) {
                            
        nameOfOwner         = nameOfOwnerT;
        fiscalIdNumber      = fiscalIdNumberT;
        colorOfLogoType     = colorOfLogoTypeT;

    }
    
    public String getNameOfOwner()          { return nameOfOwner; }
    public String getFiscalIdNumber()       { return fiscalIdNumber; }
    public String getColorOfLogoType()      { return colorOfLogoType; }
    
    public void setNameOfOwner(     String nameOfOwnerT     ) { nameOfOwner       = nameOfOwnerT;}
    public void setFiscalIdNumber(  String fiscalIdNumberT  ) { fiscalIdNumber    = fiscalIdNumberT;}
    public void setColorOfLogoType( String colorOfLogoTypeT ) { colorOfLogoType   = colorOfLogoTypeT; }

    public String toString() {
        
        return  "Owner: " + nameOfOwner +
                " Fiscal Number: " + fiscalIdNumber +
                " Logo Color: " + colorOfLogoType;

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
}
