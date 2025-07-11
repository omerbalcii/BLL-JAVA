import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ornek1();
		ornek2();

	}

	public static void ornek2() {
		Scanner input = new Scanner(System.in);
		System.out.println("İlk Sayıyı Giriniz = ");
		
		int sayi1= input.nextInt(); 
		
		System.out.println("İkinci Sayıyı Giriniz");
		
		int sayi2= input.nextInt();
		
		System.out.println("İşlem Seçiniz (+,-,*,/)");
		
		String islem =input.next();
		
		switch (islem) {
			
		case "+" :
			System.out.println("Toplam = " + (sayi1 + sayi2));
		break;
		
		case "-" :
			System.out.println("Fark = " + (sayi1 - sayi2));
		break;
		
		case "*" :
			System.out.println("Çarpım = " + (sayi1 * sayi2));
		break;
		
		case "/" :
			if(sayi2 !=0)
			{
			System.out.println("Bölüm = " + ((double)sayi1/sayi2)); }
			else 
			{
			System.out.println("Sıfıra Bölme Hatası");
			}
		break;
		
		
		
		}
		
		
	}

	public static void ornek1() {
		
		int day =3;
		
		switch(day) {
		
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		
		}
		
		
	}

}
