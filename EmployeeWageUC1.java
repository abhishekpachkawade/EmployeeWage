
// check Employee is present Or Absent 

public class EmployeeWageUC1 {
		
	public static void main(String[] args) {
		// local variable 
		int empPresent = 1;
		
		// To Generat Random Number  
        double empCheck= Math.floor(Math.random()*10%2);
        
        // if else condition to check Employee is present or Absent 
        if(empPresent == empCheck) {

        	//print samtment 
    		System.out.println("Employee is present");
        }
        else {
        	//print samtment
        	System.out.println("Employee is Absent");
        }

	}

}

/*
	Out Put
Employee is Absent

**/