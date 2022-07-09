package Z_Excel_Files;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog02 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream source = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\VelocityJava\\ExcelFiles\\Book1.xlsx");
		Sheet aa = WorkbookFactory.create(source).getSheet("Sheet2");
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String bb = aa.getRow(i).getCell(j).getStringCellValue();
				System.out.print(bb+"    ");
			}
			System.out.println();
		}
	}

}
