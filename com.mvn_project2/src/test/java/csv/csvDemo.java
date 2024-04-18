package csv;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class csvDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, CsvException {
		FileReader file = new FileReader("./src/test/resources/testDt/demoCsv.csv");
		CSVReader csvReder = new CSVReader(file);
//		for single reder
//		String[] vlue =csvReder.readNext();
//		for (String string : vlue) {
//			System.out.println(string);
//		}
//       for reding mulitple dt
		List<String[]> vlue = csvReder.readAll();
		for (String[] strings : vlue) {
			for (String strings2 : strings) {
				System.out.println(strings2);
			}
		}

	}

}
