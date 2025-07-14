
public class Main {

	public static void main(String[] args) {
		ornek1();
		//ornek2();
		
	}

	private static void ornek1() {
		int sayac = 1;
		while ( sayac <= 10 ){
		    System.out.println(sayac);
		   
		    sayac ++ ;
		}
		
	}
	private static void ornek2() {
		int sayac = 0;
		do{
		    System.out.println("Do-While döngüsü çalıştı.");
		    sayac++;
		}while(sayac >1);
		
	}

}
