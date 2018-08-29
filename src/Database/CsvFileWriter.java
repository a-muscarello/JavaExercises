package Database;

import java.io.FileWriter;
import java.util.List;

public class CsvFileWriter {

	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String FILE_HEADER = ("Brand, Size, Color, Heel Height, Type");
	
	public static void writeCsvFile (String fileName) {
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter (fileName);
			
			fileWriter.append(FILE_HEADER.toString());
			fileWriter.append(NEW_LINE_SEPARATOR.toString());
			
			List<Shoes> footwear = Runner.shoeInfo();
			
			for (Shoes shoes : footwear) {
				
				fileWriter.append(shoes.getBrand());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(shoes.getSize()));				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(shoes.getColor());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(shoes.getHeelHeight()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(shoes.getType());
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
			System.out.println("CSV file was successfully created");
		}
		catch (Exception e) {
			System.out.println("Error in csv fileWriter");
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.close();
			}
			catch (Exception e) {
				System.out.println("Error while closing csv fileWriter");
				e.printStackTrace();
			}

		}
	}
}
