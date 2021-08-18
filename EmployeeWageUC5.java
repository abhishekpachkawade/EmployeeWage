
//Calculating Wages for a Month- Assume 20 Working Day per Month

public class EmployeeWageUC5 {

	public static void main(String[] args) {
		//local variable 
         int wagePerHour = 20;
         int fullDayHour = 8;
         int partTimeHour = 4;
         int workingDays =20;
         int dailyWage;
         int monthlyWage;
         
 		// To Generat Random Number
         double empCheck= Math.floor(Math.random()*10%2);
         
      // conveting to interger value and assin to choice
         int choice = (int) (empCheck);
         
         // print value 
         System.out.println(choice);
         
         //switch case statment 
         switch (choice) {
             case 1:
            	 
            	// calculating dailywage 
                 dailyWage = wagePerHour * fullDayHour;
                 
              // calculating Monthlywage
                 monthlyWage = dailyWage*workingDays;

                 // print statment 
                 System.out.print("Employee is Full Time");
                 System.out.println("Employee wage per day: " + dailyWage);
                 System.out.println("Monthly wage:" +monthlyWage);
                 break;

             case 0:
            	 
            	 //calculating dailywage
                 dailyWage = wagePerHour * partTimeHour;
                 
              // calculating Monthlywage
                 monthlyWage = dailyWage*workingDays;
                 
                 //print statment 
                 System.out.print("Employee is Part Time");
                 System.out.println("Employee wage per day: " + dailyWage);
                 System.out.println("Monthly wage:" +monthlyWage);
                 break;

         }
	}

}


/*
	output
1
Employee is Full TimeEmployee wage per day: 160
Monthly wage:3200


**/