package FileHandler;

public class CsvWriteReadTest {

    public static void main(String[] args) {

        String fileName = "src/student.txt";
        /*/Users/ahmshahparan/student.csv*/

        System.out.println("Write CSV file:");
        CsvFileWriter.writeCsvFile(fileName);

//	        System.out.println("\nRead CSV file:");
//	        CsvFileReader.readCsvFile(fileName);

	}
}
