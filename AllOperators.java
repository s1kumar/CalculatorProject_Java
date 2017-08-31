/** this is my <code> AllOperators </code> 
	*@author s1kumar 
	*date:8/28/2017
	*@version 1.0.0
	This class has getFunction method for doing math operations.
	@param 	operatorType,number1, and number2; getFunction method in this class has parameters operatorType, number1 and number2 and at runtime  these parameters will take on the values of the arguments that are passed in by the user.
	*/
public class AllOperators{

	Modulus mod;
	ASquaredMinusBSquared ab1;
	APlusBWholeSquared ab;
	Add a;
	Subtract b;
	Multiply m;
	Division d;
	Result r;
	Power p;
	Pi pi;
	
	
		public Math_Operation getFunction( String operatorType, double number1, double number2){
		//calling the methods from all operator type classes
		a = new Add();
			if(operatorType.equals("+")){
			a.getOperator(number1, number2);
			}
		b = new Subtract();
			if(operatorType.equals("-")){
			b.getOperator(number1, number2);
			}
		m = new Multiply();
			if(operatorType.equals("*")){
			m.getOperator(number1, number2);
			}
		d = new Division();
			if(operatorType.equals("/")){
			d.getOperator(number1, number2);
			}
		r = new Result();
			if(operatorType.equals("r")){
				r.getOperator(number1, number2);
			}
		p = new Power();
			if(operatorType.toUpperCase(). trim().equals("POW")){
				p.getOperator(number1, number2);
			}
		mod = new Modulus();
			if(operatorType.equals("%")){
			mod.getOperator(number1, number2);
			}
		ab = new APlusBWholeSquared();
			if (operatorType.equals("ab")){
			ab.getOperator(number1, number2);
			}
		ab1 = new ASquaredMinusBSquared();
			if (operatorType.equals("ab1")){
			ab1.getOperator(number1, number2);
			}
		pi = new Pi();
			if(operatorType.toUpperCase().trim().equals("PI")){
			pi.getOperator(number1, number2);
			}
		return null;
		}
	
}
	
