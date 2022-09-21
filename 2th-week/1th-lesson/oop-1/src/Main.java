
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Delongi kahve makinası");
		product.setDiscount(800);
		product.setUnitPrice(50);
		product.setUnitsInstock(1);
		product.setImageUrl("selongi_kahve.jpg");
		
		Product product1 = new Product();
		product1.setName("Smeg Kahve Makinası");
		product1.setDiscount(800);
		product1.setUnitPrice(50);
		product1.setUnitsInstock(1);
		product1.setImageUrl("smeg.jpg");
		
		
		Product product2 = new Product();
		product2.setName("Kitchen kahve makinası");
		product2.setDiscount(100);
		product2.setUnitPrice(500);
		product2.setUnitsInstock(10);
		product2.setImageUrl("kitchen_kahve.jpg");
		
		
		Product[] products = {product,product1,product2};
		System.out.println("<ul>");
		for (Product product3 : products) 
		{
			System.out.println("<li>" + "Ürün adı : " + product3.getName() + "</li>");
			System.out.println("\n");
		}
		System.out.println("</ul>");
		
	}

}
