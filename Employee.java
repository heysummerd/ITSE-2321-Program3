package program3;

//********************************************************************
//
//Author:        Summer Davis
//
//Program #:     Three
//
//File Name:     Employee.java
//
//Course:        ITSE 2321 Object-Oriented Programming
//
//Description:  Employee class will manage three instance variables
//				for each object created:
//				- first name
//				- last name
//				- monthly salary (must be positive in order for the value to be set)
//
//********************************************************************

public class Employee {
	
	// Declare instance variables
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	
	// Declare constructor
	
	//***************************************************************
	//
	//  Method:       Employee
	// 
	//  Description:  The constructor of the class
	//				  - checks that monthly salary is positive
	//					before setting the value
	//
	//  Parameters:   String, String, double
	//
	//  Returns:      N/A
	//
	//**************************************************************
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (monthlySalary >= 0) {
		    this.monthlySalary = monthlySalary;
		}
	} // end of constructor method
	
	
	// Setters and Getters
	
	//***************************************************************
	//
	//  Method:       setFirstName
	// 
	//  Description:  The setter for firstName instance variable
	//
	//  Parameters:   String
	//
	//  Returns:      N/A 
	//
	//**************************************************************
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	} // end of setFirstName method
	
	//***************************************************************
	//
	//  Method:       getFirstName
	// 
	//  Description:  The getter for firstName instance variable
	//
	//  Parameters:   N/A
	//
	//  Returns:      String 
	//
	//**************************************************************
	public String getFirstName() {
		return firstName;
	} // end of getFirstName method
	
	//***************************************************************
	//
	//  Method:       setLastName
	// 
	//  Description:  The setter for lastName instance variable
	//
	//  Parameters:   String
	//
	//  Returns:      N/A 
	//
	//**************************************************************
	public void setLastName(String lastName) {
		this.lastName = lastName;
	} // end of setLastName method
	
	//***************************************************************
	//
	//  Method:       getLastName
	// 
	//  Description:  The getter for lastName instance variable
	//
	//  Parameters:   N/A
	//
	//  Returns:      String 
	//
	//**************************************************************
	public String getLastName() {
		return lastName;
	} // end of getLastName method
	
	//***************************************************************
	//
	//  Method:       setMonthlySalary
	// 
	//  Description:  The setter for monthlySalary instance variable
	//				  - checks that monthly salary is positive
	//					before setting the value
	//
	//  Parameters:   double
	//
	//  Returns:      N/A 
	//
	//**************************************************************
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary >= 0) {
		    this.monthlySalary = monthlySalary;
		}
	} // end of setMonthly Salary method
	
	//***************************************************************
	//
	//  Method:       getMonthlySalary
	// 
	//  Description:  The getter for monthlySalary instance variable
	//
	//  Parameters:   N/A
	//
	//  Returns:      double 
	//
	//**************************************************************
	public double getMonthlySalary() {
		return monthlySalary;
	} // end of getMonthlySalary method
}
