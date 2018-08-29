package Database;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static List<Shoes> shoeInfo () {
		
		Shoes shoes1 = new Shoes ("Ferragamo", 7.0, "Black", 1, "Flats");
		Shoes shoes2 = new Shoes ("Reebok", 6.5, "Green", 1, "Sneakers");
		Shoes shoes3 = new Shoes ("Calvin Klein", 6.0, "Silver", 3, "Kitten Heels");
		Shoes shoes4 = new Shoes ("Jimmy Choo", 7.5, "Blue", 5, "High Heels");
		Shoes shoes5 = new Shoes ("Skechers", 8.5, "Gold", 2, "Casual");
		
		List <Shoes> shoes = new ArrayList<Shoes>();
		
		shoes.add(shoes1);
		shoes.add(shoes2);
		shoes.add(shoes3);
		shoes.add(shoes4);
		shoes.add(shoes5);
		
		return shoes;
	}
	
	public static void main(String[] args) {
		
		shoeInfo();
		String fileName = "src/footwear.csv";
		CsvFileWriter.writeCsvFile(fileName);
		
	}
}




