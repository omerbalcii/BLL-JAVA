
public class Main {

	public static void main(String[] args) {
		//ornek1();
		//ornek2();
		ornek3();

	}

	private static void ornek3() {
		//kendi adınızı soyadınızı konsola 10 kere yazdırın
		for(int i = 0;i<=10;i++) {
			System.out.println("Ömer Faruk Balci");
		}
		
	}

	private static void ornek2() {
		int toplam=0;
	    for (int i = 1; i <= 5; i++) {
	    	toplam = toplam + i;
	      }
	      System.out.println("Toplam = " + toplam);
	    }
		
	

	private static void ornek1() {

		//for(başlangıç,aralık,artış veya azalış)
		for(int i = 0;i<5;i++) {
			System.out.println(i);
		}
		
	}

}
