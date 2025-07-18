import java.util.Random;

public class ZarAtma {
	
	public int at() {
		return new Random().nextInt(6)+1;
		
	}

	public static void main(String[] args) {
		ZarAtma z= new ZarAtma();
		
		int birinciOyuncununZari=z.at();
		int ikinciOyuncununZari=z.at();	
		
		System.out.println("Oyuncu 1 : " + birinciOyuncununZari);
		System.out.println("Oyuncu 2 : " + ikinciOyuncununZari);
		
		if(birinciOyuncununZari>ikinciOyuncununZari) {
		System.out.println("Birinci Oyuncu Kazandı");
		}else if(ikinciOyuncununZari>birinciOyuncununZari)
		{
		System.out.println("İkinci Oyuncu Kazandı");
		}
		else
		{
		System.out.println("Berabere!!");

		}
		}

	}


