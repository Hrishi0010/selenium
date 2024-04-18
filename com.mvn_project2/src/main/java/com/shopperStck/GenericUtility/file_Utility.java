package com.shopperStck.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class file_Utility implements frmeWork_constnts {

	public static String sheetnme;
	FileInputStream fis;

	public String propertyFile(String key) throws IOException {
		fis = new FileInputStream(propertyPth);
		Properties prop = new Properties();
		prop.load(fis);
		String vlue = prop.getProperty(key);
		return vlue;
	}

	public String excelFile(String sheetnme, int row, int cell) throws EncryptedDocumentException, IOException {
		fis = new FileInputStream(excelPth);
		Workbook wb = WorkbookFactory.create(fis);
		String vlue = wb.getSheet(sheetnme).getRow(row).getCell(cell).getStringCellValue();
		return vlue;
	}
}
