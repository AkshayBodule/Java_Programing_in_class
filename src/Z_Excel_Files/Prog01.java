package Z_Excel_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog01 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream abc = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\VelocityJava\\ExcelFiles\\Book1.xlsx");
		
		Sheet excel = WorkbookFactory.create(abc).getSheet("Sheet1");
		String aa = excel.getRow(0).getCell(0).getStringCellValue();  // for Only Horizontal
		System.out.println(aa);
		String bb = excel.getRow(0).getCell(1).getStringCellValue();
		System.out.println(bb);
		
		
	}

}
