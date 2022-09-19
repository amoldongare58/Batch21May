package impData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
	public String getDataFromExcel(String path, String sheetName, int row, int cell) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream(path);
		String data=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}

	
}
