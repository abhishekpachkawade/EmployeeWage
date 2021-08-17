
// TO check Employee is present or absent also calculate to employee Wage

public class EmployeeWageUC2 {

	public static void main(String[] args) {
		// local variable 
		 int empPresent=1;
	     int wagePerHour=20;
	     int fullDayHour=8;
	     int dailyWage;
	     
		// To Generat Random Number
	     double empCheck= Math.floor(Math.random()*10%2);
	     
	     // if else condition to check Employee is present or Absent if present than calculate wage also
	     if(empCheck == empPresent){
	    	 
	    	 // calculate Dailywage 
	          dailyWage=wagePerHour*fullDayHour;
	          System.out.print("Employee is Presnt and his daily wage is: "+dailyWage);
	       }
	     else {
	            System.out.print("Employee is Absent");
	        }
	}

}

/*
	outpute

	Employee is Presnt and his daily wage is: 160
**/
