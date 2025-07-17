import java.util.Scanner;

public class EnKucukSayiyiBulma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci Sayıyı Giriniz :");
		int sayi1 =scanner.nextInt();
		System.out.println("İkinci Sayıyı Giriniz :");
		int sayi2 =scanner.nextInt();
		System.out.println("Üçüncü Sayıyı Giriniz :");
		int sayi3 =scanner.nextInt();
		// İlk Sayiyi varsayılan en küçük seçtik
		int enKucuk = sayi1;
		
		if(sayi2<enKucuk) {
			enKucuk=sayi2;
		}
		if(sayi3<enKucuk) {
			enKucuk=sayi3;
		}
		
		System.err.println("En Küçük Sayı :" + enKucuk);
		
		scanner.close();

		

	}

}
