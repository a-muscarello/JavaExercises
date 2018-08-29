package Car;

import java.util.ArrayList;
import java.util.List;

public class RunnerClass {

	
public static List<Car> carInfo () {
		
	Car car1 = new Car("Honda Accord", 200, "Black", 2017);
	Car car2 = new Car("Audi A6", 300, "Gray", 2018);
	Car car3 = new Car("Volvo S90", 395, "Black", 2016);
	Car car4 = new Car("Hyundai Genesis", 400, "Silver", 2017);
		
//	Car[] car = new Car [] {car1, car2, car3, car4};
	
	List<Car> car = new ArrayList<Car>();
	car.add(car1);
	car.add(car2);
	car.add(car3);
	car.add(car4);
	
	return car;
	}

	public static void main(String[] args) {
		
		carInfo();
		String fileName = "src/cars.csv";
		CsvFileWriter.writeCsvFile(fileName);
		
		
	}


}
