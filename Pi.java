/** this is my <code> Pi</code> 
	*@author s1kumar 
	*date:8/28/2017
	*@version 1.0.0
	This class has  getOperator method for finding  the pi value of a number passed in by the user.
		@param  number, number1 and number2 ;  getOperator method in this class have parameters named number1 and number2 and at runtime  these parameters will take on the values of the arguments that are passed in by the user.
		getOperator1 method in this class has parameter number.
*/
public class Pi extends Math_Operation {
	
	@Override
	public void getOperator(double number1, double number2){
		try{
			System.out.println(Math.PI*(number1+number2));
		} catch (Exception e) {
				System.out.println(("the exception is :"  + e));
		}
		
		
	}
	public double getOperator1(double number){
		
		try{
			System.out.println(Math.PI*(number));	
			} catch (Exception e) {
				System.out.println("the exception is :"  + e);
			}
		return number;
		
	}

}

