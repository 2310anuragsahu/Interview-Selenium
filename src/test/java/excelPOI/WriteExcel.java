package excelPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public void writeExcel(String filePath, String fileName, String sheetName, String[] dataToWrite)
			throws IOException {

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
		
		// Get the first row from the sheet
		Row row = sheet.getRow(0);
		
		// Create a new row and append it at last of sheet
		Row newRow = sheet.createRow(rowCount + 1);
		
		// Create a loop over the cell of newly created Row
		for (int j = 0; j < row.getLastCellNum(); j++) {
			// Fill data in row
			Cell cell = newRow.createCell(j);
			cell.setCellValue(dataToWrite[j]);
		}
		
		// Close input stream
		inputStream.close();
		
		// Create an object of FileOutputStream class to create write data in excel file
		FileOutputStream outputStream = new FileOutputStream(file);
		
		// write data in the excel file
		wbook.write(outputStream);
		
		// close output stream
		outputStream.close();
	}

	public static void main(String[] args) throws IOException {
		String[] valueToWrite = { "Mr. E", "Noida" };
		WriteExcel objExcelFile = new WriteExcel();
		objExcelFile.writeExcel(System.getProperty("user.dir") + "\\src\\test\\resources\\documents", "Data.xlsx",
				"Sheet1", valueToWrite);
	}
}
