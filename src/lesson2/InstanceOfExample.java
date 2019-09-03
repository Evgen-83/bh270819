package lesson2;

import java.util.Map;

public class InstanceOfExample
{
	private static String test = "test";

	private static Human somebody = new Woman();
//	private Human woman = new Woman();


	public static void main(String[] args)
	{

		//Вот сюда

		if(somebody instanceof Man) {
			System.out.println("Давай по пивку!");
		} else {
			System.out.println("Шампусика?");
		}


	}
}
