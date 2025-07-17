
public class HayvanTest {
	
	String turu;
	int yas;
	
	public void sesCikar() {
		System.out.println( turu + " Sesi Çıkardı!");
	}

	public static void main(String[] args) {
		HayvanTest h1 = new HayvanTest();
		h1.turu="Kedi";
		h1.yas=3;
		
		HayvanTest h2 = new HayvanTest();
		h2.turu="Köpek";
		h2.yas=5;
		
		System.out.println(h1.turu + " " +h1.yas + " Yaşında");
		h1.sesCikar();
		System.out.println(h2.turu + " " +h2.yas + " Yaşında");
		h2.sesCikar();

	}
}
