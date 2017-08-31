/** this is my <code> Division</code> 
	*@author s1kumar 
	*date:8/28/2017
	*@version 1.0.0
	This class has getOperator method for dividing  the  numbers passed in by the user.
		@param number1 and number2 ; getOperator method in this class has parameters number1 and number2 and at runtime  these parameters will take on the values of the arguments that are passed in by the user.
	
	*/
public class Division extends Math_Operation  {
	
@Override
	public void getOperator(double number1,  double number2){
		try{
		
			System.out.println(" the answer is:" +  number1/number2);
			} catch (Exception e) {
			System.out.println("the exception is : " + e);
			}	//end of try catch block
			
		}
}

