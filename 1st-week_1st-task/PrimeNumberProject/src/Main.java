
public class Main {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		Boolean isPrime = true;
		
		if (number == 1) 
		{
			System.out.println("Asal sayi değildir.");
			return;
		}
		
		if (number < 1) 
		{
			System.out.println("Geçersiz sayidir.");
			return;
		}
		
		for (int i = 0; i < number; i++) 
		{
			if (number % 2 == 0) 
			{
				isPrime = false;
			}
			
		}
		
		if (isPrime) 
		{
			System.out.println("Asal sayidir.");
		} else 
		{
			System.out.println("Asal sayi değildir.");
		}
		
		
	}
}
