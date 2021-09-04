package excelPOI;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FilloForExcel {
	Fillo fillo = new Fillo();

	public void selectQuery(String excelPath, String strQuery) throws FilloException {
		Connection connection = fillo.getConnection(excelPath);
		Recordset recordset = connection.executeQuery(strQuery);
		while (recordset.next()) {
			System.out.println(
					recordset.getField("ID") + " " + recordset.getField("Name") + " " + recordset.getField("Country"));
		}
		recordset.close();
		connection.close();
	}

	public void updateQuery(String excelPath, String strQuery) throws FilloException {

		Connection connection = fillo.getConnection(excelPath);
		connection.executeUpdate(strQuery);
		connection.close();
	}

	public void insertQuery(String excelPath, String strQuery) throws FilloException {

		Connection connection = fillo.getConnection(excelPath);
		connection.executeUpdate(strQuery);
		connection.close();
	}

	public static void main(String[] args) throws FilloException {
		FilloForExcel filloQuery = new FilloForExcel();

		String excelPath = ".\\src\\test\\resources\\documents\\Data.xlsx";
		String strQuery = "Select * from Sheet2";
		
		System.out.println("Select Query Result:");
		filloQuery.selectQuery(excelPath, strQuery);

		// Update Query
		System.out.println();
		System.out.println("Updating the Excel Sheet");
		String strQuery2 = "Update Sheet2 Set Country='America' where ID='100'";
		filloQuery.updateQuery(excelPath, strQuery2);
		filloQuery.selectQuery(excelPath, strQuery);
		
		//Insert Query
		System.out.println();
		System.out.println("Inserting in Excel Sheet");
		String strQuery3 = "Insert into sheet2 (ID,Name,Country) Values(300,'Peter','UK')";
		filloQuery.updateQuery(excelPath, strQuery3);
		filloQuery.selectQuery(excelPath, strQuery);
		
	}
}
