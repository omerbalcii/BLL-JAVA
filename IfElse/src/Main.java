import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		ornek1();
//		ornek2();
//		ornek3();
		ornek4();
		

	}
	
	
	
	public static void ornek1() {
		
		int x =60;
		
		if(x>25) {
			System.out.println("x ,25 den daha büyüktür ");
		}
		else
		{ 
			System.out.println("x ,25 den daha küçüktür ");
		}
		
		
	}
	
	public static void ornek2() {
		
		String kullaniciAdi = "OmerBalci";
		String sifre = "1234";
		
		String girilenKullanici = "OmerBalci";
		String girilenSifre = "1234";
		
		if(girilenKullanici.equals(kullaniciAdi) && girilenSifre.equals(sifre)) {
			
			System.out.println("Tebrikler ... Kullanıcı Adı ve Şifre Doğru");
			
		}
		else
		{
			System.out.println("Kullanıcı Adı veya Şifre Yanlış");	
			
		}
			
		
	}
	
	public static void ornek3() {
		
		String dogruKullanici = "OmerBalci";
		String dogruSifre = "1234";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanıcı Adını Giriniz = ");
		
		String girilenKullanici = input.nextLine();
		
		System.out.println("Şifrenizi Giriniz = ");
		
		String girilenSifre = input.nextLine();
		
		if(girilenKullanici.equals(dogruKullanici)&&girilenSifre.equals(dogruSifre))
		{
			System.out.println("Tebrikler ... Kullanıcı Adı ve Şifre Doğru");
			
		}
		else
		{
			System.out.println("Kullanıcı Adı veya Şifre Yanlış");	
			
		}
		
		
		
	}
	
	
	
	public static void ornek4() {
		//Scanner Klavyeden değer girmeyi sağlar
		Scanner input = new Scanner(System.in);
		
		System.out.println("Notunuzu Giriniz = ");
		
		int not = input.nextInt();
		
		if(not <0 || not >100) {
			System.out.println("Geçerli Bir Değer Giriniz");
		}
		else if(not>=50) {
			System.out.println("Dersi Geçtiniz");
		}
		else
		{
			System.out.println("Dersi Geçemediniz");
		}
		
		
	}
	
	
}
