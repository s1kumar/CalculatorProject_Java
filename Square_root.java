
public class Square_root {
	/** 
	 * this is my <code> Square_root class  </code> 
	*@author s1kumar 
	*date:8/28/2017
	*@version 1.0.0
	This class has  getOperator method for finding the square root of the number passed in by the user.
	@param number ;  getOperator method in this class has parameter named number and at runtime this parameter will take on the value of the argument that is passed in by the user.
	*/
	
	
	
	public double number;

	public  double getSqroot(double number){
		
		try{
		System.out.println(Math.sqrt(number));
		
		} catch (Exception e) {
			
			System.out.println(" the exception is : " + e );
		}
		return number;
	}

	

	

}
