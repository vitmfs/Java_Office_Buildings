/**
 * Write a description of class Office here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Office implements IStructure
{
    private static final int minimumDimensionSideOfSquaredDisp = 4;
    private static final int minimulLengthRectDisp = 5;
    private static final int minimuWidthhRectDisp = 3;

    // instance variables - replace the example below with your own
    private String uniqueCode;
    private boolean isOccupied;
    private boolean squaredSpatialDisposition;
    //private boolean rectangularSpatialDisposition;
    private double lengthOfOffice;
    private double widthOfOffice;
    private ListOfOccupations occupations;
    private ListOfReservations reservations;

    
    

    /**
     * Constructor for objects of class Office
     */
    public Office(  String uniqueCodeT,
                    boolean squaredSpatialDispositionT,
                    double lengthOfOfficeT,
                    double widthOfOfficeT) {
                        
        uniqueCode                  = uniqueCodeT;
        squaredSpatialDisposition   = squaredSpatialDispositionT;
        
        if ( squaredSpatialDispositionT == true) {
            
            if ( lengthOfOfficeT < minimumDimensionSideOfSquaredDisp || widthOfOfficeT < minimumDimensionSideOfSquaredDisp ) {
            
                lengthOfOfficeT = minimumDimensionSideOfSquaredDisp;
                widthOfOfficeT = minimumDimensionSideOfSquaredDisp;
            }
            
        } else {
            
            if ( lengthOfOfficeT < minimulLengthRectDisp || widthOfOfficeT < minimuWidthhRectDisp ) {
            
                lengthOfOfficeT = minimulLengthRectDisp;
                widthOfOfficeT = minimuWidthhRectDisp;
            }

        }

        lengthOfOffice              = lengthOfOfficeT;
        widthOfOffice               = widthOfOfficeT;
        
        isOccupied      = false;
        occupations     = new ListOfOccupations();
        reservations    = new ListOfReservations();
        
    }
    
    public void getName() {
    
    }
    
    public void enter() {
    
    }
    
    
    public void exit() {
    
    }
    
    
    public void location() {
    
    
    }
    
    public String               getUniqueCode()                     { return uniqueCode; }
    public boolean              getIsOccupied()                     { return isOccupied; }
    public ListOfOccupations    getOccupations()                    { return occupations; }
    public ListOfReservations   getReservations()                   { return reservations;}
    public boolean              getSquaredSpatialDisposition()      { return squaredSpatialDisposition; }
    //public boolean              getRectangularSpatialDisposition()  { return rectangularSpatialDisposition; }
    
    public void setUniqueCode( String uniqueCodeT )                 { uniqueCode = uniqueCodeT; }
    public void setIsOccupied( boolean isOccupiedT )                { isOccupied = isOccupiedT; }
    public void setOccupations( ListOfOccupations occupationsT )    { occupations = occupationsT; }
    public void setReserations( ListOfReservations reservationsT )  { reservations = reservationsT; }
    
    public boolean checkNameOfClient(String nameOfClientT ) {
        
        return true;
    
    
    
    }
    

    
    public void setSquaredSpatialDisposition() { 
        
        squaredSpatialDisposition = !squaredSpatialDisposition;
        //rectangularSpatialDisposition = !rectangularSpatialDisposition;
    }

    
}
