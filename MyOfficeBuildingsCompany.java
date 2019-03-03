
/**
 * Write a description of class MyOfficeBuildingsCompany here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public final class MyOfficeBuildingsCompany
{
    private static MyOfficeBuildingsCompany officeBuildingsCompany;
    private String nameOfCompany;
    private ListOfBuildings buildings;

    /**
     * Constructor for objects of class MyOfficeBuildingsCompany
     */
    private MyOfficeBuildingsCompany()
    {
       nameOfCompany = "";
       buildings = new ListOfBuildings();
    }
    
    public String getNameOfCompany() { return nameOfCompany; }
    
    public void setNameOfCompany( String nameOfCompanyT ) { nameOfCompany = nameOfCompanyT; }
    
    public String toString() {
    
            return  "Company Name: " + nameOfCompany +
                    "Buildings: \n" + buildings.toString();
                    
    }
    
    public static MyOfficeBuildingsCompany getRef() {
        
        if ( officeBuildingsCompany == null ) {
        
            officeBuildingsCompany = new MyOfficeBuildingsCompany();
        
        }
        
        return officeBuildingsCompany;
    
    }

    
}
