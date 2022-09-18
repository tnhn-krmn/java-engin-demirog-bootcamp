
public class Main {
	public static void main(String[] args) 
	{
		int sayi1 = 35;
		int sayi2 = 15;
		int sayi3 = 85;
		int enBuyukSayi = sayi2;
		String mesaj = "En büyük sayi";
		
		if (enBuyukSayi < sayi1) 
		{
			enBuyukSayi = sayi1;
		} 
		
		if (enBuyukSayi < sayi3) 
		{
			enBuyukSayi = sayi3;
		}
		
		System.out.println(mesaj + " : " + enBuyukSayi);
	}
}
