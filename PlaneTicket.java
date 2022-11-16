package JavaPatikasi;
import java.util.Scanner;
/**
 * @author Eda Patoğlu
 *
 */

public class PlaneTicket {
	public static void main(String[] args) {
		
		int km,age,select_type;
		double money;
		Scanner input=new Scanner(System.in);
		//Scanner ile gerekli bilgileri alma km,yaş,yolvuluk tipi
		System.out.println("Mesafeyi km türünden giriniz : ");
		km=input.nextInt();
		money=km*(0.10);	//Kilometreye göre parayı hesaplama
		System.out.println("Yaşınızı giriniz  : ");
		age=input.nextInt();
		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		select_type=input.nextInt();


		
		if(km<0 || age<0 || select_type<=0 || select_type>2)
		{
			System.out.println("Hatalı Veri Girdiniz ! ");
			
			
		}
		//Yukarıdaki şartlardan birine girmiyorsa programın çalışması gerektiğini gösterir
		else {
			
			if(age<=12)
			{
				money=money-money*(0.5);
			}
			else if(age>12 && age<=24)
			{
				money=money-money*(0.10);
			}
			else if(age>65)
			{
				money=money-money*(0.30);
			}
			if (select_type==2)
			{
				money=money-money*(0.20);
				money*=2;
			}
			
			System.out.println("Toplam Tutar = "+ money +"TL ");

		}
		
	}
}



