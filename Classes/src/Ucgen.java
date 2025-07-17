import java.util.Scanner;

public class Ucgen {

	double kenar1;
	double taban;
	double yukseklik;
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	Ucgen u =new Ucgen();
	
	System.out.println("Kenar 1 Giriniz : ");
	u.kenar1 = input.nextDouble();
	
	System.out.println("Yükseklik Giriniz : ");
	u.yukseklik=input.nextDouble();
	
	System.out.println("Taban Giriniz : ");
	u.taban=input.nextDouble();
	
	u.bilgiGoster();
	
	
	 double cevre = u.cevrehesapla();
     System.out.println("Çevre: " + cevre);

     
     double alan = u.alanhesapla();
     System.out.println("Alan: " + alan);

     input.close();
	


}
	
	public double alanhesapla() {
		return (taban*yukseklik)/2;
	}
	public double cevrehesapla() {
		return kenar1+yukseklik+taban;
	}
	
	public void bilgiGoster() {
        System.out.println("Kenar 1: " + kenar1);
        System.out.println("Taban: " + taban);
        System.out.println("Yükseklik: " + yukseklik);
    }
	
	
	
	
	
}