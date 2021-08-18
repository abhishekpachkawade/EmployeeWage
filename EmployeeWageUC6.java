
//Calculate Wages till a condition of total working hours or days is reached for a month - Assume 100 hours

public class EmployeeWageUC6 {

	public static void main(String[] args) {
		//local variable
		  int MAX_DAYS=20;
	        int MAX_HOURS=100;
	        int empHrs=0,totalWorkingHours=0;
	        int totalWorkingDays=0;

	        // final is the keywold 
	        final int FULLTIME=1;
	        final int HALFTIME=0;

	        //while loop 
	        while(empHrs<MAX_HOURS && totalWorkingDays <=MAX_DAYS){
	            totalWorkingDays++;
	            
	            // To Generat Random Number
	            int check=(int)(Math.floor(Math.random()*10)%3);
	            
	            //switch case statment 
	            switch(check) {
	                case FULLTIME:
	                    empHrs=8;
	                    break;
	                case HALFTIME:
	                    empHrs=4;
	                    break;
	                default:
	                    empHrs=0;
	                    break;
	            }
	            totalWorkingHours+=empHrs;
	            
	            // print statement 
	            System.out.println("Total working Hours " + totalWorkingHours);
	            System.out.println("Total working Days " + (totalWorkingDays-1));
	}

	}
}
