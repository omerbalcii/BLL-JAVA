
public class Main {

	public static void main(String[] args) {
		//ornek1();
		//ornek2();
		//ornek3();
		//ornek4();
		ornek5();

	}

	private static void ornek5() {
		String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
	    for (int i = 0; i < arabalar.length; i++) {
	      System.out.println(arabalar[i]);
	    }
		
	}

	private static void ornek4() {
		int[] sayilar =  new int[8];
//	int [] sayilar = {20,40,50,24,25,45,55,75}; ile aynı işlemi yapar
		
		sayilar[0]=20;
		sayilar[1]=40;
		sayilar[2]=50;
		sayilar[3]=24;
		sayilar[4]=25;
		sayilar[5]=45;
		sayilar[6]=55;
		sayilar[7]=75;
		
		System.out.println(sayilar[0]);
		

		
	}

	private static void ornek3() {
		String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
		
		arabalar[0]="Mercedes";
		
		System.out.println(arabalar.length);
//		System.out.println(arabalar[3]);
		
	}

	private static void ornek2() {
		int [] sayilar = {2,4,88,98,56};
		
		System.out.println(sayilar[1]);
		System.out.println(sayilar[4]);
	}

	private static void ornek1() {
		//diziler 0'dan başlar 
		String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
		
		arabalar[0]="Mercedes";
		
		System.out.println(arabalar[0]);
//		System.out.println(arabalar[3]);
	}

}
