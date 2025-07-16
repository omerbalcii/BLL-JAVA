import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		int birinciSayi=10;
//		int ikinciSayi=20;
//		
//		toplama(birinciSayi,ikinciSayi);
//		
//		adSoyad("Ömer Faruk","Balci");
//		int yas=17;
//		
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Yaşınızı Giriniz = ?");
//		
//		int dogumYili=input.nextInt();
//		
//		yasHesap(dogumYili);
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Adınızı Giriniz = ?");
//		
//		String isim = input.nextLine();
//		
//		System.out.println("Doğum yılınızı Giriniz = ?");
//		
//		int dogumYili = input.nextInt();
//		
//		bilgileriYazdir(isim,dogumYili);
		
		Scanner input = new Scanner(System.in);
		System.out.println("İlk Sınav notunuzu giriniz = ?");
		int ilkSinav=input.nextInt();
		
		System.out.println("Performans notunuzu giriniz = ?");
		int performans=input.nextInt();
		
		notOrtalamasi(ilkSinav,performans);
		
	}
	
	private static void notOrtalamasi(int ilkSinav, int performans) {
		double ortalama=(ilkSinav*0.6)+(performans*0.4);
		System.out.println("Ortalama = " + ortalama);	
	}

	private static void bilgileriYazdir(String isim,int dogumYili) {
		
		int mevcutYil = LocalDate.now().getYear(); //2025
		int yas=mevcutYil-dogumYili;
		
		System.out.println("Adınız : "+isim+" Yaşınız : "+yas);
			
		}
	
	
	private static void toplama(int sayi1,int sayi2) {
		
		System.out.println("Toplam = " + (sayi1+sayi2));	
		
	}
	
	private static void adSoyad(String ad,String soyad) {
		System.out.println("Ad Soyad ="+ad + " " + soyad);
	}
	
	private static void yasHesap(int age) {
		
		if(age>18) {
			System.out.println("Ehliyet alabilirsiniz");
		}
		else
		{
			System.out.println("Ehliyet alamazsınız..");
		}
		
		
	}

}
