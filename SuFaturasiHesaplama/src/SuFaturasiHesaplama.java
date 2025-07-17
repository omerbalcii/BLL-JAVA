import java.util.Scanner;

public class SuFaturasiHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç Ton Su Tükettiniz :");
		int ton =scanner.nextInt();
		
		System.out.println("Abonelik Türünüzü Seçiniz :");
		
		System.out.println("1- Ev");
		System.out.println("2-Iş Yeri");
		System.out.println("3-Fabrika");
		System.out.println("Seçiminiz : ");
		int secilenAbonelik = scanner.nextInt();
		
		double birimFiyat;
		double toplamFiyat;
		
		if(ton<=10) {
			birimFiyat=5.0;
		} else if (ton<=20)
		{
			birimFiyat=7.0;
		}else {
			birimFiyat=10.0;
		}
		toplamFiyat=ton*birimFiyat;
		
		switch(secilenAbonelik) {
		case 1:
			System.out.println("Ev Abonesi ..Ek Ücret Uygulanmadı");
			break;
		case 2:
			toplamFiyat= toplamFiyat*1.10;
			System.out.println("İş Yeri Abonesi Yüzde 10 ek ücret eklendi");
			break;
		case 3:
			toplamFiyat= toplamFiyat*1.25;
			System.out.println("Fabrika Abonesi Yüzde 25 ek ücret eklendi");
			break;
		default:
			System.out.println("Hatalı Tuşlama Yaptınız.Ev Aboneliği sayıldı");
			break;
			
		}
		System.out.println("Su Tüketiminiz : " + ton + " TON ");
		System.out.println("Birim Fiyat : " + birimFiyat + " TL");
		System.out.println("Toplam Fatura : " + toplamFiyat + " TL");
		scanner.close();
		
		
		
		

	}

}
