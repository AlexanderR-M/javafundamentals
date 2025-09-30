package basics;

public class OperatorsTest {
	
	public static void main(String[] args) {
		
		arithmeticOperationTest();
		unaryOperatorsTest();
		assigmentOperatorsTest();
	}
	
	private static void assigmentOperatorsTest() {
		// TODO Auto-generated method stub
		int number1 = 3;
		int number2 = 20;
		float result = number1 + number2;
		System.out.println(result);
		result += number1;
		
		System.out.println(result);
		result -= number1;
		
		System.out.println(result);
		result /= number1;
		
		System.out.println(result);
		result %= number1;
		
		System.out.println(result);
		result *= number1;
		
		
		
	}

	private static void unaryOperatorsTest() {
		
		int num1 = 234;
		num1++;
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		num1--;
		--num1;
		
	}

	private static void arithmeticOperationTest() {
		// TODO Auto-generated method stub
		
		//declaring 3 variables
		
		int num1, num2, num3;
		num1 = 23;
		num2 = 78;
		num3 = 54;
		
		System.out.println(num1);
				
		int result;
		
		/** 
		 * 1 se leen los valores de los operandes del lado derecho 
		 * 2 se reailiza la operación con los operandes 
		 * 3 se asigna el resultado de la oprecion a la variable al lado izquierdo
		 * 
		 * 
		 * */
		
		result = num1 + num2 + num3;
		System.out.println(result);
		
		
		//subtraction
		result = result - num3;
		System.out.println(result);
		
		//multiplication
		result = result *2;
		System.out.println("multiplying " + result);
		
		
		//division
		result = result /2;
		System.out.println("division " + result);
		
		//modulus
		
		result = result % 2;
		
		
		
		
	}

}
