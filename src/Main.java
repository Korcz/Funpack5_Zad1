import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{
	
	
	public static void main(String[] args)
	{
		double MAXw = 10;
		
		List<Product> lista = new ArrayList<>();
		
		lista.add(new Product("Shirt", 75, 7));
		lista.add(new Product("Trouers", 150, 8));
		lista.add(new Product("Sweater", 250, 6));
		lista.add(new Product("Cap", 35, 4));
		lista.add(new Product("Trunks", 10, 3));
		lista.add(new Product("Footwear", 100, 9));
		
		Collections.sort(lista, new Comparator<Product>()
		{
			public int compare(Product p1, Product p2)
			{
				if(p1.getCount() > p2.getCount()) return -1;
				if(p1.getCount() < p2.getCount()) return 1;
				return 0;
			}
		});
		
		for (int i = 0; i < lista.size(); i++)
		{
			System.out.println(lista.get(i).toString());
		}
		
		List<Product> backPack = new ArrayList<>();
		
		for (int i = 0; i < lista.size(); i++)
		{
			if(lista.get(i).getWeight() <= MAXw && MAXw != 0)
			{
					MAXw = MAXw - lista.get(i).getWeight();
					backPack.add(lista.get(i));
			}
		}
		
		System.out.println();
		System.out.println("----------------------------------BACKPAC---------------------------------------");
		
		for (Product produkt : backPack)
		{
			System.out.println(produkt);
		}
		
	}
}