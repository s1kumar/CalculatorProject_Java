

import java.util.Scanner;

public class Calculator {
		static String choice;

		public static void main(String[] args) {
			
			/** this is my <code> Calculator class </code> program
			*@author s1kumar 
			*date:8/28/2017
			*@version 1.0.0
			* @param operatorType; This parameter at run time will take on the value of the argument that is passed in by the user.  
			*/
		 boolean shouldQuit = false;	
		 do {
			String operatorType=null;
			Scanner sc1= new Scanner(System.in);
			String s1 = "";
			double number1 = 0;
			boolean validNumber = false;
		        do {
				System.out.println("Enter a valid first number: ");
				s1 = sc1.next();
				try {
				number1 = Double.parseDouble(s1);
				validNumber = true;
				} catch (Exception e) {
				validNumber = false;
				  }
			} while (validNumber == false);
		        
		      	if(number1==0){
					
				System.out.println("Please enter a valid first number");
				s1=	sc1.next();
					
				number1 = Double.parseDouble(s1);
			}
		//user entering the second number 
		Scanner sc2= new Scanner(System.in);
	        double number2 = 0;
	        String s2 = "";
	        boolean validNumber1 = false;
	        do {
			System.out.println("Enter a valid second number: ");
			s2 = sc2.next();
			try {
			number2 = Double.parseDouble(s2);
			validNumber1 = true;
			} catch (Exception e) {
			validNumber1 = false;
		} while (validNumber1 == false);
	        
	      	if(number2==0){
				
			System.out.println("Please enter a valid second number:");
			s2=	sc2.next();
			number2 = Double.parseDouble(s2);
		}
	      	
	      	System.out.println(" Please enter: \n + for Addition,  \n - for subtraction, \n * for multiplication, \n / for division, \n % for modulus, \n p for Power, \n r for Result \n (a+b) ^2 for a+b the whole square, \n a2-b2 for a2-b2,\n pi for PI: ");
	      	Scanner sc3=new Scanner(System.in);
	      	operatorType=sc3.next();
	      	choice  = "y";
	      	
	      	AllOperators selectOperator = new AllOperators();
		    selectOperator.getFunction(operatorType, number1, number2);
		      		
		     if((sc3.equals(operatorType))){
				
			System.out.println("Please enter a valid operatorType:");
			operatorType=	sc3.next();
				 
	        }
	      	
	      	Scanner sc4 = new Scanner(System.in);
			System.out.println("Want to find square root of a number? y/n:");
			String option=sc4.next();
			double number=0.00;
		if(option.equalsIgnoreCase("y")){
			System.out.println("Enter a double");
			number = sc4.nextDouble();
			Square_root sq = new Square_root();
			double sqr =sq.getSqroot(number);
			} else if(option.equals("n")) {
			ystem.out.println("Please proceed");
		}
				Scanner sc5 = new Scanner(System.in);
				System.out.println("Want to find pi value of a number? y/n:");
				option=sc5.next();
				double num=0.00;
				if(option.equalsIgnoreCase("y")){
						System.out.println("Enter a double");
						num = sc5.nextDouble();
				
				Pi pi = new Pi();
				double p =pi.getOperator1(num);
				} else if(option.equals("n")) {
				System.out.println("Please proceed");
				
				}
				
				System.out.println("Want to exit? please type EXIT");
				Scanner sc6 = new Scanner(System.in);
				String	q = sc6.next();
					if("EXIT".equals(q)){
					System.out.println("Thank you!!");
					shouldQuit = true;
					}
					else 	{
					shouldQuit = false;
					}
	   }	 while (shouldQuit==false);	
	} // end main			
} // end class	
							
							
					
					
					
	
				   
		    
	

		    
			   
			    	
			  

			    
			    
			    
		
		
		
		
		
		
			    
	 
			
		
	        
		


	          

	        
		      
		    
		
		




		





