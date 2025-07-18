
public class Lamba {
	//2 değişkenli Lamba Sınıfı
	String kavsakAdi;
	String renk;
	
	public static void main(String[] args) {
		
		Lamba[] lambalar = new Lamba[3];
		
		lambalar[0]= new Lamba();
		lambalar[0].renk="Kırmızı";
		lambalar[0].kavsakAdi="Kavşak1";
		
		lambalar[1]= new Lamba();
		lambalar[1].renk="Sarı";
		lambalar[1].kavsakAdi="Kavşak2";
		
		lambalar[2]= new Lamba();
		lambalar[2].renk="Yeşil";
		lambalar[2].kavsakAdi="Kavşak3";
		
		
		System.out.println("Lambaların Durumu");
		for(int i=0;i<lambalar.length;i++) {
			lambalar[i].durum();
			
		}
		
		
		
	}
	
	//durumu yazan method
	public void durum() {
		if(renk.equalsIgnoreCase("kırmızı")) {
			System.out.println(kavsakAdi + ": DUR");
		}else if(renk.equalsIgnoreCase("sarı")) {
			System.out.println(kavsakAdi + ": HAZIR OL");
		}else if(renk.equalsIgnoreCase("yeşil")) {
			System.out.println(kavsakAdi + ": GEÇ");
		}else
		{
			System.out.println("Hatalı Renk Girdiniz...");
		}
		
	}
	

}
