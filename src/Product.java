import java.util.Scanner;

public class Product
{
	private String name;
	private double price;
	private double weight;
	private double value = price/weight;

	public Product(String aName, double aPrice, double aWeight)
	{
		this.name = aName;
		this.price = aPrice;
		this.weight = aWeight;
		this.value = aPrice/aWeight;
	}

	public Product()
	{
		System.out.println("Enter prouct name");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("Enter price");
		price = Double.parseDouble(sc.nextLine());
		weight = Double.parseDouble(sc.nextLine());
	}
	
	

	public double getCount()
	{
		return value;
	}

	public void setCount(double count)
	{
		this.value = count;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
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

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Product [Name = " + name + ", price = " + price + ", weight = " + weight + ", value =  " + value + "]";
	}

}
