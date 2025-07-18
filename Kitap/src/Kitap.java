//Kitap class
public class Kitap {
	
	//Değişkenler
	String yazar;
	String ad;
	int adet;

	//Main Methodu
	public static void main(String[] args) {
		
		Kitap k1= new Kitap();
		k1.ad="Sefiller";
		k1.yazar="Victor Hugo";
		k1.adet=50;
		
		Kitap k2= new Kitap();
		k2.ad="Harry Potter";
		k2.yazar="Rowling";
		k2.adet=40;
		
		Kitap k3= new Kitap();
		k3.ad="Suç ve Ceza";
		k3.yazar="Dostoyevski";
		k3.adet=25;
		
		System.out.println("Kütüphanemizdeki Kitaplar : ");
		
		k1.kitapBilgileri();
		k2.kitapBilgileri();
		k3.kitapBilgileri();
		
		int toplamKitapSayisi= k1.adet+k2.adet+k3.adet;
		//\n bir alt satıra geçer
		System.out.println("\nToplam Kitap Sayisi : " +toplamKitapSayisi);

		

	}
	
	//kitapBilgileri Methodumuz
	public void kitapBilgileri() {
		System.out.println(ad + " - " + yazar + " - Adet : " + adet);
	}

}
