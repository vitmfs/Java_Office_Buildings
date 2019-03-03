/**
 * Write a description of class MainOfficeBuildingsProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.Arrays;

public class MainOfficeBuildingsProgram
{
    public static void main( String[] args ) {

        System.out.println("Welcome to the Office Buildings Program!");

        MyOfficeBuildingsCompany myCompany = MyOfficeBuildingsCompany.getRef();
        myCompany = createTestData( myCompany );
        myCompany.setNameOfCompany( "Buildings Inc.\n" );
        System.out.println( myCompany );

        System.out.println( getStringOfOptions() );
        int chosenOption = -1;
        chosenOption = chooseOption();

        while ( chosenOption != 0 ) {

            System.out.println("Inside the loop!");

            switch ( chosenOption ) {

                case 1:
                System.out.println("Option 1 chosen!");
                break;

                case 2:
                System.out.println("Option 2 chosen!");
                break;

                case 3:
                System.out.println("Option 3 chosen!");
                break;

                case 4:
                System.out.println("Option 4 chosen!");
                break;

                case 5:
                System.out.println("Option 5 chosen!");
                break;

                case 6:
                System.out.println("Option 6 chosen!");
                break;

                case 7:
                System.out.println("Option 7 chosen!");
                break;

                case 8:
                System.out.println("Option 8 chosen!");
                break;

                case 9:
                System.out.println("Option 9 chosen!");
                break;

                default:
                System.out.println("Option Unknown!");
                break;

            }

            chosenOption = chooseOption();
        }
        System.out.println("Your chosen option is: " + chosenOption);

        
        
        
        
        
        
        System.out.println("\nThank You, have a nice day!");
    }

    public static String getStringOfOptions() {

        String options = "" +
            "1) Option 1\n" + 
            "2) Option 2\n" + 
            "3) Option 3\n" + 
            "4) Option 4\n" + 
            "5) Option 5\n" + 
            "6) Option 6\n" + 
            "7) Option 7\n" + 
            "8) Option 8\n" + 
            "9) Option 9\n" + 
            "0) Exit Program\n\n";

        return options;

    }

    public static int[] getValidOptionsValues() {

        int[] validOptions = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        return validOptions;

    }

    public static boolean isValidOption( int chosenOptionT ) {

        int[] validOptions = getValidOptionsValues();
        int lengthOfValidOptions = validOptions.length;

        for (int i = 0; i < lengthOfValidOptions; i++) {

            if ( chosenOptionT == validOptions[i] ) {

                return true;
            }

        }

        return false;

    }

    public static int chooseOption() {

        Scanner scanner = new Scanner( System.in );

        int chosenOption = -1;
        do {

            try {

                System.out.print("Enter your option: ");
                chosenOption = Integer.parseInt( scanner.next() );
                scanner.nextLine();

            } catch (Exception e) {

                chosenOption = -1;

            }

        } while ( !isValidOption( chosenOption ) );

        scanner.close();

        return chosenOption;
    }

    public static MyOfficeBuildingsCompany createTestData( MyOfficeBuildingsCompany myCompanyT ) {

        StartUpCompany startupC01 = new StartUpCompany( "Name of Owner of StartUp One", "111111111", "Blue" );
        StartUpCompany startupC02 = new StartUpCompany( "Name of Owner of StartUp Two", "222222222", "Red" );
        StartUpCompany startupC03 = new StartUpCompany( "Name of Owner of StartUp Three", "333333333", "Green" );

        SmallOrMediumCompany smallMed01 = new SmallOrMediumCompany( "Name of Owner of Small Medium One", "444444444", "Blue", 10 );
        SmallOrMediumCompany smallMed02 = new SmallOrMediumCompany( "Name of Owner of Small Medium Two", "555555555", "Red", 20 );
        SmallOrMediumCompany smallMed03 = new SmallOrMediumCompany( "Name of Owner of Small Medium Three", "444444444", "Green", 30 );

        Occupation occup01 = new Occupation( startupC01 );
        Occupation occup02 = new Occupation( startupC02 );
        Occupation occup03 = new Occupation( startupC03 );
        Occupation occup04 = new Occupation( smallMed01 );
        Occupation occup05 = new Occupation( smallMed02 );
        Occupation occup06 = new Occupation( smallMed03 );

        ListOfOccupations listOccup01 = new ListOfOccupations();
        ListOfOccupations listOccup02 = new ListOfOccupations();
        ListOfOccupations listOccup03 = new ListOfOccupations();
        ListOfOccupations listOccup04 = new ListOfOccupations();
        ListOfOccupations listOccup05 = new ListOfOccupations();
        ListOfOccupations listOccup06 = new ListOfOccupations();

        listOccup01.add( occup01 );
        listOccup02.add( occup02 );
        listOccup03.add( occup03 );
        listOccup04.add( occup04 );
        listOccup05.add( occup05 );
        listOccup06.add( occup06 );

        Reservation reserv01 = new Reservation( "Reservator 01" );
        Reservation reserv02 = new Reservation( "Reservator 02" );
        Reservation reserv03 = new Reservation( "Reservator 03" );
        Reservation reserv04 = new Reservation( "Reservator 04" );
        Reservation reserv05 = new Reservation( "Reservator 05" );
        Reservation reserv06 = new Reservation( "Reservator 06" );

        ListOfReservations listReser01 = new ListOfReservations();
        ListOfReservations listReser02 = new ListOfReservations();
        ListOfReservations listReser03 = new ListOfReservations();
        ListOfReservations listReser04 = new ListOfReservations();
        ListOfReservations listReser05 = new ListOfReservations();
        ListOfReservations listReser06 = new ListOfReservations();

        listReser01.add( reserv01 );
        listReser02.add( reserv02 );
        listReser03.add( reserv03 );
        listReser04.add( reserv04 );
        listReser05.add( reserv05 );
        listReser06.add( reserv06 );

        

        
        Building building01 = new Building( "Building A", 3, 100, 100, 3, 100 );
        Building building02 = new Building( "Building B", 4, 200, 200, 4, 120 );
        Building building03 = new Building( "Building C", 5, 300, 300, 5, 140 );
        
        System.out.println(building01.getListOfFloors().size() );
        System.out.println(building02.getListOfFloors().size() );
        System.out.println(building03.getListOfFloors().size() );
        
        ListOfBuildings buildings = new ListOfBuildings();
        
        buildings.add( building01 );
        buildings.add( building02 );
        buildings.add( building03 );
        // floors are created automatically
        
        
        

        
        return myCompanyT;
    }

    
}

