package TestingFizzBuzz;

public class FizzBuzz {

	protected String getResult(int n) {
		
		if(n % 3 == 0 && n % 5 == 0 && n % 7 != 0) return "FizzBuzz";
		if(n % 7 == 0 && n % 3 == 0 && n % 5 != 0) return "Fizz pop";
		if(n % 7 == 0 && n % 5 == 0 && n % 3 != 0) return "Buzz pop";
		if(n % 7 == 0 && n % 5 == 0 && n % 3 == 0) return "FizzBuzz pop";
		
		if(n % 3 == 0) return "Fizz";
		if(n % 5 == 0) return "Buzz";			
		if(n % 7 == 0) return "pop";
		
		return " ";

	}

}
