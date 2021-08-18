
// Add Part time Employee & Wage - Assume Part time Hour is 8

public class EmployeeWageUC3 {

	public static void main(String[] args) {
		//local variable 
		 	int empFullTime=1;
	        int wagePerHour=20;
	        int fullDayHour=8;
	        int partTimeHour=4;
	        int dailyWage;
	    
	     // To Generat Random Number
	        double empCheck= (int) Math.floor(Math.random()*10%3);
	        
	     // if else condition to check Employee is present or Absent if present than calculate wage also
	        if(empCheck == empFullTime){
	        	
		    	 // calculate Dailywage for FullTime employee
	            dailyWage=wagePerHour*fullDayHour;
	            System.out.print("Employee is Full Time and his daily wage is: "+dailyWage);
	            }
	        else {
	        	
	        	// nested if else condition 
	        	if(empCheck == partTimeHour){
	      
	        	// calculate Dailywage for PartTime employee	
	            dailyWage=wagePerHour*partTimeHour;
	            System.out.print("Employee is Part Time and his daily wage is: "+dailyWage);
	            }
	           else {
	        	System.out.println("Employee is Absent");
	            }
	        }

	}

}

/* Output

  Employee is Full Time and his daily wage is: 160

**/