
public class Main {
	public static void main(String[] args) 
	{
		String ogrenci1 = "Engin";
		String ogrenci2 = "Senem";
		String ogrenci3 = "Tunahan";
		String ogrenci4 = "Yıldız";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-------------------------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Senem";
		ogrenciler[2] = "Tunahan";
		ogrenciler[3] = "Yıldız";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}
}