public class Building implements IStructure {
    
    private String          nameOfBuilding;
    private int             numberOfFloors;
    private double          lengthOfBuilding;
    private double          widthOfBuilding;
    private int             areaOfOfficesInM2; 
    private int             numberOfOfficesPerFloor;
    private ListOfFloors    floors;
    
    /**
     * Constructor for objects of class Building
     */
    public Building(    String  nameOfBuildingT,
                        int     numberOfFloorsT,
                        double  lengthOfBuildingT,
                        double  widthOfBuildingT,
                        int     numberOfOfficesPerFloorT,
                        int     areaOfOfficesInM2T) {
                            
        nameOfBuilding              = nameOfBuildingT;
        numberOfFloors              = numberOfFloorsT;
        lengthOfBuilding            = lengthOfBuildingT;
        widthOfBuilding             = widthOfBuildingT;
        
        numberOfOfficesPerFloor     = numberOfOfficesPerFloorT;
        areaOfOfficesInM2           = areaOfOfficesInM2T;
        
        //int areaNeeded              = numberOfOfficesPerFloorT * areaOfOfficesInM2T + 20;
        floors                      = new ListOfFloors( nameOfBuildingT, numberOfFloorsT, lengthOfBuildingT, widthOfBuildingT );
        
    }
    
    public void getName() {
    
    }
    
    public void enter() {
    
    }
    
    
    public void exit() {
    
    }
    
    
    public void location() {
    
    
    }
    public String       getNameOfBuilding()                                         { return nameOfBuilding; }
    public int          getNumberOfFloors()                                         { return numberOfFloors; }
    public int          getAreaOfOfficesInM2()                                      { return areaOfOfficesInM2; }
    public int          getNumberOfOfficesPerFloor()                                { return numberOfOfficesPerFloor; }
    public ListOfFloors getListOfFloors()                                           { return floors; }
    
    public void         setNameOfBuilding( String nameOfBuildingT )                 { nameOfBuilding = nameOfBuildingT; }
    public void         setNumberOfFloors( int numberOfFloorsT )                    { numberOfFloors = numberOfFloorsT;}
    public void         setAreaOfOfficesInM2( int areaOfOfficesInM2T )              { areaOfOfficesInM2 = areaOfOfficesInM2T; }
    public void         setNumberOfOfficesPerFloor( int numberOfOfficesPerFloorT )  { numberOfOfficesPerFloor = numberOfOfficesPerFloorT;}
    public void         setListOfFloors( ListOfFloors floorsT )                     { floors = floorsT; }
    
    
}
