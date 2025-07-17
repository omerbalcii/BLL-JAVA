import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Rastgele sayi
		Random randomSayi= new Random();
		
		//1-100 arası sayı olduğunu belirtir
		int rastgeleSayi=randomSayi.nextInt(100)+1;
		
		int tahmin;
		int denemeSayisi = 0;
		
		System.out.println("1 ile 100 Arasında Bir Sayi Tuttum Tahmin Et :");
		
		do {
			
			System.out.println("Tahmininiz : ");
			tahmin = scanner.nextInt();
			denemeSayisi ++;
			
			if(tahmin > rastgeleSayi)
			{ 
				System.out.println("Daha Küçük Sayı Giriniz : ");
			} else if(tahmin<rastgeleSayi){
				System.out.println("Daha Büyük Sayı Giriniz : ");
			}
			else
			{
				System.err.println("Tebrikler Sayiyi "+denemeSayisi+ " denemede Buldunuz ");
			}
		}
		while(tahmin!=rastgeleSayi);
			scanner.close();
		}

	}


