//package com.kashanok.lesson2;
//
//import org.omg.PortableServer.THREAD_POLICY_ID;
//
//public class LogicRunner
//{
//	private final static String MALE = "male";
//	private final static String FEMALE = "female";
//
//	public static void main(String[] args) throws InterruptedException
//	{
//		Human vasya = new Human();
//		vasya.age = 16;
//		vasya.gender = "male";
//
//		if(checkMaleGender(vasya.gender) && checkMoreThanThirtyAge(vasya.age)) {
//			System.out.println("Давай по пивку?");
//		} else {
//			System.out.println("Вы не доросли или не мужик!");
//		}
//
//		for (int i = 0; i < 15; i++)
//		{
//			Thread.sleep(1000);
//			System.out.println("Вася вырос на год!!! и ему теперь " + (vasya.age = vasya.age + 1));
//		}
//
//		if(checkMaleGender(vasya.gender) || checkMoreThanThirtyAge(vasya.age)) {
//			System.out.println("Давай по пивку?");
//		} else {
//			System.out.println("Вы не доросли или не мужик!");
//		}
//
//
//	}
//
//	private static boolean checkMaleGender(String gender) {
//		return gender == MALE;
//	}
//
//	private static boolean checkMoreThanThirtyAge(int age) {
//		return age > 30;
//	}
//
//}
