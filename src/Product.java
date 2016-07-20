import java.util.Scanner;

public class Product
{
	private String name;
	private double price;
	private double weight;
	
	public Product()
	{
		System.out.println("Enter prouct name");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter price");
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	
}
