package lesson2;

import java.util.Scanner;

public class HelloExample
{
	public static void main(String[] args)
	{
		int v=450000;
		int sec=v%60;
		int m=(v-sec)/60;
		int min = m%60;
		System.out.println( m + " минут " + sec + " секунд" );
		int h=(m-min)/60;
		System.out.println(h + " часов " + min + " минут " + sec + " секунд" );
		int den = h/24;
		h = h%24;
		System.out.println(den + " дней " + h + " часов " + min + " минут " + sec + " секунд" );
		int ned =den/7;
		System.out.println(ned  + " недель " + den + " дней " + h + " часов " + min + " минут " + sec + " секунд" );
	}
}
