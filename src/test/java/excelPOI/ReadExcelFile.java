package excelPOI;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public void readExcel(String filePath, String fileName, String sheetName) throws Exception {

		// Create an object of File class to open xlsx file
		File file = new File(filePath + "\\" + fileName);
		
		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wbook = null;
		
		// Find the file extension by splitting file name in substring and getting only extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		// Check condition if the file is xlsx file
		if (fileExtensionName.equals(".xlsx")) {
			wbook = new XSSFWorkbook(inputStream);
		}
		else if (fileExtensionName.equals(".xls")) {
			wbook = new HSSFWorkbook(inputStream);
		}

		Sheet sheet = wbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		
		// Create a loop over all the rows of excel file to read it
		for (int i = 0; i < rowCount + 1; i++) {
			Row row = sheet.getRow(i);
			// Create a loop to print cell values in a row
			for (int j = 0; j < row.getLastCellNum(); j++) {
				// Print Excel data in console
				System.out.print(row.getCell(j).getStringCellValue() + "| ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		ReadExcelFile objExcelFile = new ReadExcelFile();
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\documents";
		objExcelFile.readExcel(filePath, "Data.xlsx", "Sheet1");
	}

}
