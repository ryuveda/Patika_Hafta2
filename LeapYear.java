package JavaPatikasi;
import java.util.Scanner;
/**
 * @author Eda Patoğlu
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner input=new Scanner(System.in);
		//Scanner ile gerekli bilgileri alma
		System.out.println("Yıl Giriniz : ");
		year=input.nextInt();
		if( year%400==0)
		{
			System.out.println(year +" bir artık yıldır ! ");
		}
		else if(year % 100==0)
		{
			System.out.println(year +" bir artık yıl değildir ! ");
		}
		else if(year % 4==0)
		{
			System.out.println(year +" bir artık yıldır ! ");
		}
		else 
		{
			System.out.println(year +" bir artık yıl değildir ! ");
		}
	}

}
