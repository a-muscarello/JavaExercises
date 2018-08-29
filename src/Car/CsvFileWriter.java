package Car;

import java.io.FileWriter;
import java.util.List;

public class CsvFileWriter {
	
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";	
	private static final String FILE_HEADER = ("model, horsePower, color, manufactureYear");
	
	public static void writeCsvFile(String fileName) {	
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			
			fileWriter.append(FILE_HEADER.toString());
			
			fileWriter.append(NEW_LINE_SEPARATOR.toString());
			
			List<Car> cars = RunnerClass.carInfo();
			
			for (Car car: cars) {
				
				fileWriter.append(car.getModel());
				fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(String.valueOf(car.getHorsePower()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(car.getColor());
				fileWriter.append(COMMA_DELIMITER);
	fileWriter.append(String.valueOf(car.getManufactureYear()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
			System.out.println("CSV file was created successfully");
			}
		catch (Exception e){
			System.out.println("Error in csv filewriter");
			e.printStackTrace();
			}
		finally {
			try {
				fileWriter.close();

		} catch (Exception e) {
			System.out.println("Error while closing filewriter");
			e.printStackTrace();
		}
		}
	}
}
