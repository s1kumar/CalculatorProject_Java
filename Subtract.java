
public class Subtract extends Math_Operation  {
	/** this is my <code> Subtract class  </code> 
	*@author s1kumar 
	*date:8/28/2017
	*@version 1.0.0
	This class has getOperator method for subtracting the user input numbers.
		@param  number1 and number2 ; getOperator method in this class has parameters named  number1 and number2 and at runtime  these parameters will take on the values of the arguments that are passed in by the user.
	*/
	
	
	
	@Override
	public void getOperator(double number1, double number2) {
		// TODO Auto-generated method stub
		try{
			System.out.println(number1-number2);
			} catch (Exception e) {
				System.out.println(("the exception is :"  + e));
			}
		
		
	}
}


