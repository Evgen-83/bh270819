package lesson2;

public class StringExample
{

	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;
		String test = "test";
		String test2 = "test2";

		System.out.println(test + a);                // test5
		System.out.println(a + test);                // 5test
		System.out.println(test + a + b);            // test510
		System.out.println(b + a + test);            // 105test или 15test
		System.out.println(test + a + b + test2);    // test510test2
		System.out.println(b + a + test + test2);    // 105testtest2 или 15testtest2

	}
}
