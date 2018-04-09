package com.learnFramework.generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib {
	// setting the config file path
	public static String getPropertyValue(String propertyKey) {
		String propertyValue = "";
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("./config.properties"));
			propertyValue = prop.getProperty(propertyKey);
		} catch (Exception e) {
		}
		return propertyValue;
	}

	// setting the excel file path
	static Workbook wb;

	public static String getCellValue(String sheet, int row, int column) {
		try {
			wb = WorkbookFactory.create(new FileInputStream("./testdata/inputdata.xlsx"));
		} catch (Exception e) {
		}
		return wb.getSheet(sheet).getRow(row).getCell(column).toString();
	}

	// fetching rowcount
	public static int getRowCount(String sheet) {
		try {
			wb = WorkbookFactory.create(new FileInputStream("./testdata/inputdata.xlsx"));
		} catch (Exception e) {
		}
		return wb.getSheet(sheet).getLastRowNum();
	}
}
