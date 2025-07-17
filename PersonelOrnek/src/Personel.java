public class Personel {
	
	String ad;
	String soyAdi;
	String tc;
	int yas;
	String gorevi;
	
	public static void main(String[] args) {
		
		Personel p1=new Personel();
		p1.ad="Akif";
		p1.soyAdi="Doğanay";
		p1.tc="34323332232";
		p1.yas=19;
		p1.gorevi="Asistan";
		
		System.out.println("Personel Görevi :"+p1.gorevi);
		System.out.println("Personel Adı :" + p1.ad);
		System.out.println("Personel Soyadı :" + p1.soyAdi);
		System.out.println("Personel Kimlik No :" + p1.tc);
		System.out.println("Personel Yaş :" + p1.yas);
	}
}
