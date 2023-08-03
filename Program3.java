package program3;

//********************************************************************
//
//Author:        Summer Davis
//
//Program #:     Three
//
//File Name:     Program3.java
//
//Course:        ITSE 2321 Object-Oriented Programming
//
//Description:   Program3 leverages the Employee class to accomplish the following:
//				 - Creates two employee objects
//      	     - Displays each employee's yearly salary
//				 - Gives each employee a 20% raise
//				 - Displays each employee's new yearly salary
//
//********************************************************************

public class Program3 {
//***************************************************************
//
//  Method:       main
// 
//  Description:  The main method of the program
//
//  Parameters:   String array
//
//  Returns:      N/A 
//
//**************************************************************
	public static void main(String[] args) {
	   
		// display developer info
		developerInfo();
		
		// create two employee objects
		Employee employee1 = new Employee("John", "Doe", 2875.00);
		Employee employee2 = new Employee("Jane", "Doe", 3150.75);
		
		// Display each employee's yearly salary
		System.out.printf("%s %s's yearly salary: $%,.2f%n",
				employee1.getFirstName(), employee1.getLastName(),
				employee1.getMonthlySalary() * 12);
		System.out.printf("%s %s's yearly salary: $%,.2f%n",
				employee2.getFirstName(), employee2.getLastName(),
				employee2.getMonthlySalary() * 12);
		
		// Give each employee a 20% raise
		employee1.setMonthlySalary(employee1.getMonthlySalary() +
				employee1.getMonthlySalary() * 0.2);
		employee2.setMonthlySalary(employee2.getMonthlySalary() +
				employee2.getMonthlySalary() * 0.2);
		
		// Display each employee's yearly salary again
		System.out.printf("%s %s's yearly salary: $%,.2f%n",
				employee1.getFirstName(), employee1.getLastName(),
				employee1.getMonthlySalary() * 12);
		System.out.printf("%s %s's yearly salary: $%,.2f%n",
				employee2.getFirstName(), employee2.getLastName(),
				employee2.getMonthlySalary() * 12);

} // End of main method
	
//***************************************************************
//
//  Method:       developerInfo
// 
//  Description:  The developer information method of the program
//
//  Parameters:   None
//
//  Returns:      N/A 
//
//**************************************************************
public static void developerInfo() {
   System.out.println("Name:    Summer Davis");
   System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
   System.out.println("Program: Three \n");

} // End of developerInfo method
} 