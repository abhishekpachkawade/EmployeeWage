
// TO check Employee is present or absent also calculate to employee Wage
//Solving using Switch Case Statement

public class EmployeeWageUC4 {

	public static void main(String[] args) {
		// Local variable
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int dailyWage;
        
     // To Generat Random Number
        double empCheck= Math.floor(Math.random()*10%2);
       
        // conveting to interger value and assin to choice 
        int choice = (int) (empCheck);
        
        //print value 
        System.out.println(choice);
        
        //switch case statment 
        switch (choice) {
            case 1:
            	
            	// calculating wage 
                dailyWage = wagePerHour * fullDayHour;
                System.out.print("Employee is Full Time");
                System.out.print("Employee wage: " + dailyWage);
                break;

            case 0:
                dailyWage = wagePerHour * partTimeHour;
                System.out.print("Employee is Part Time");
                System.out.print("Employee wage: " + dailyWage);
                break;

        }
	}

}


/*
	output

0
Employee is Part TimeEmployee wage: 80

**/
