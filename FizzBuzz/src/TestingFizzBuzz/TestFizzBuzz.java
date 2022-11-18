package TestingFizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

import org.junit.jupiter.api.Test;

//import junit.framework.Assert;

class TestFizzBuzz {

	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void testFizzNumberReturnsFizz() {
		FizzBuzz fz = new FizzBuzz();
	
		Assert.assertEquals("Fizz", fz.getResult(3));
	}
	
	@Test
	public void testBuzzNumberReturnsBuzz() {
		FizzBuzz fz = new FizzBuzz();
	
		Assert.assertEquals("Buzz", fz.getResult(5));
	}
	
	@Test
	public void testPopNumberReturnsPop() {
		FizzBuzz fz = new FizzBuzz();
	
		Assert.assertEquals("pop", fz.getResult(7));
	}
	
	@Test
	public void testFizzBuzzNumberReturnsFizzBuzz() {
		FizzBuzz fz = new FizzBuzz();
	
		Assert.assertEquals("FizzBuzz", fz.getResult(15));
	}
	
	@Test
	public void testFizzBuzzNumberReturnsNotFizzBuzz() {
		FizzBuzz fz = new FizzBuzz();
	
		Assert.assertNotEquals(" ", fz.getResult(15));
	}
	
	@Test
	public void testFizzPopNumberReturnsFizzPop() {
		FizzBuzz fz = new FizzBuzz();
	
		Assert.assertEquals("Fizz pop", fz.getResult(21));
	}
	
	@Test
	public void testBuzzPopNumberReturnsBuzzPop() {
		FizzBuzz fz = new FizzBuzz();
	
		Assert.assertEquals("Buzz pop", fz.getResult(35));
	}
	
	@Test
	public void testFizzBuzzPopNumberReturnsFizzBuzzPop() {
		FizzBuzz fz = new FizzBuzz();
	
		Assert.assertEquals("FizzBuzz pop", fz.getResult(105));
	}
	
	@Test
	public void testFizzBuzzPopNumberReturnsNotFizzBuzzPop() {
		FizzBuzz fz = new FizzBuzz();
	
		Assert.assertNotEquals(" ", fz.getResult(105));
	}


}
