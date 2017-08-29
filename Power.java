
public class Power extends Math_Operation {
	/** this is my <code> Power class  </code> 
	*@author s1kumar 
	*date:8/28/2017
	*@version 1.0.0
	This class has  getOperator method for finding the  power value of the user input number.
		@param  number1 and number2 ;getOperator method in this class has parameters named number1 and number2 and at runtime  these parameters will take on the values of the arguments that are passed in by the user. 
		*/
	
	
	
	@Override
	
	public void getOperator(double number1, double number2){
		try{
			System.out.println(Math.pow(number1, number2));
		} catch (Exception e) {
				System.out.println("the exception is :"  + e);
		}
		
		
	}
}

