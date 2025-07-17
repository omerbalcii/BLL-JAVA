
public class ArabaOrnek {

	String renk;
	int kilometre;
	String marka;
	int model;
	double lastikBasinci;
	boolean koltukRahatmi;
	
	public static void main(String[] args) {
		
		ArabaOrnek a1 = new ArabaOrnek(); 
		
		a1.renk="mavi";
		a1.model=2025;
		a1.kilometre=50000;
		a1.marka="BMW";
		a1.lastikBasinci = 8.15;
		a1.koltukRahatmi=true;
		
		System.out.println("Araba Rengi " + a1.renk);
		System.out.println("Araba Modeli " + a1.model);
		System.out.println("Araba Kilometresi " + a1.kilometre);
		System.out.println("Araba Markası " + a1.marka);
		System.out.println("Araba Lastik Basıncı " + a1.lastikBasinci);
		System.out.println("Araba Rahatlığı " + a1.koltukRahatmi);
		
		ArabaOrnek a2 = new ArabaOrnek();
		
		a2.renk="sarı";


		}
}
