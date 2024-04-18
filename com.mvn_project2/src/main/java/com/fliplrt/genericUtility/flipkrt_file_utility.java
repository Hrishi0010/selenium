package com.fliplrt.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flipkrt_file_utility implements flipkrt_constnts {

	public FileInputStream fis;
	

	public String propertyFile(String key) throws IOException {
		fis = new FileInputStream(fileProperty);
		Properties prop = new Properties();
		prop.load(fis);
		String vlue = prop.getProperty(key);
		return vlue;
	}

	public String excelFile(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		fis = new FileInputStream("");
		Workbook wb = WorkbookFactory.create(fis);
		String vlue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return vlue;

	}
}
