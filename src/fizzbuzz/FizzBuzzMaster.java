package fizzbuzz;

public class FizzBuzzMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int number=0;number<=100; number++){
			if (((number % 3)==0) && ((number % 5)==0))		
				System.out.print ("fizz" +"buzz");
			else if ((number %3)==0)
				System.out.print("Fizz");
			else if((number % 5)==0)
				System.out.print("Buzz");
			else System.out.print(number);	
			System.out.print(",");
		}

	}

}


