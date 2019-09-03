package lesson2;

public class Arithmetic
{
	public static void main(String[] args)
	{

		// >  <  ! == >= <=


		String hello = "Hello World";
		String hello2 = new String("Hello World");
		String hello3 = hello;
		String hello4 = hello2;



		System.out.println("Is Hello = Hello: " + (hello.equals(hello2)));	// true
		System.out.println("Is Hello = Hello: " + (hello.equals(hello3)));	// true
		System.out.println("Is Hello = Hello: " + (hello.equals(hello4)));	// true
		System.out.println("Is Hello = Hello: " + (hello2.equals(hello3)));// true
		System.out.println("Is Hello = Hello: " + (hello2.equals(hello4)));// true
		System.out.println("****************");
		System.out.println("Is Hello = Hello: " + (hello == hello2));	//	false
		System.out.println("Is Hello = Hello: " + (hello == hello3));	//	true
		System.out.println("Is Hello = Hello: " + (hello == hello4));	//	false
		System.out.println("Is Hello = Hello: " + (hello2 == hello3));	//	false
		System.out.println("Is Hello = Hello: " + (hello2 == hello4));	//	true


		//"Is Hello = Hello: " + (hello == hello2);





	}
}
