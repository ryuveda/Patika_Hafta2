package JavaPatikasi;
import java.util.Scanner;
/**
 * @author Eda Patoğlu
 *
 */

public class ChineseZodiac {

	public static void main(String[] args) {
		
		int birth_year,zodiac_sign;
		Scanner input=new Scanner(System.in);
		//Scanner ile gerekli bilgileri alma doğum tarihi
		System.out.println("Doğum Yılınızı Giriniz :  ");
		birth_year=input.nextInt();
		birth_year=birth_year % 12;//doğum tarihinin modunu alma işlemi
		//Switch case ile moda göre burç hesaplama
		switch(birth_year)
		{
		case 0:
			System.out.println("Çin Zodyağı Burcunuz : Maymun");
			break;
		case 1:
			System.out.println("Çin Zodyağı Burcunuz : Horoz");
			break;
		case 2:
			System.out.println("Çin Zodyağı Burcunuz : Köpek");
			break;
		case 3:
			System.out.println("Çin Zodyağı Burcunuz : Domuz");
			break;
		case 4:
			System.out.println("Çin Zodyağı Burcunuz : Fare");
			break;
		case 5:
			System.out.println("Çin Zodyağı Burcunuz : Öküz");
			break;
		case 6:
			System.out.println("Çin Zodyağı Burcunuz : Kaplan");
			break;
		case 7:
			System.out.println("Çin Zodyağı Burcunuz : Tavşan");
			break;
		case 8:
			System.out.println("Çin Zodyağı Burcunuz : Ejferha");
			break;
		case 9:
			System.out.println("Çin Zodyağı Burcunuz : Yılan");
			break;
		case 10:
			System.out.println("Çin Zodyağı Burcunuz : At");
			break;
		case 11:
			System.out.println("Çin Zodyağı Burcunuz : Koyun");
			break;
		default:
			
			break;
	
		}
	}

}


