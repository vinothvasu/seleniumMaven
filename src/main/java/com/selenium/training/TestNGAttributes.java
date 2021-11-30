package com.selenium.training;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNGAttributes {

	@DataProvider(name = "excelReader")
	public Object[][] createData(Method m) throws IOException {
		String excelfileName = "Team";
		String sheetName = "";
		return readExcelData(excelfileName, sheetName, m);
	}


	@Test(dataProvider = "excelReader") 
	public void qa(String name, String employeeID) {
		System.out.println("QA team: "+name+ ","+employeeID);
	}


	/*
	 * @Test(dataProvider = "excelReader") public void dev(String name, String
	 * employeeID, String jobTitle, String grade) {
	 * System.out.println("Dev team: "+name+ ","+employeeID+","+jobTitle+","+grade);
	 * }
	 */


	public static Object[][] readExcelData(String excelfileName, String sheetName, Method m) throws IOException {
		XSSFWorkbook wbook = 
				new XSSFWorkbook("./data/"+excelfileName+".xlsx");
		if (m.getName().equalsIgnoreCase("QA")) {
			sheetName = "QA";
			System.out.println(sheetName);
		}else if(m.getName().equalsIgnoreCase("Dev")) {
			sheetName = "Dev"; 	
			System.out.println(sheetName);
		}

		XSSFSheet sheet = wbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j] = stringCellValue; 
			} 
		}
		wbook.close();
		return data;
	}



}
