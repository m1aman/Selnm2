package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_read 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream fis= new FileInputStream("C:\\Users\\PC\\Desktop\\DDT1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");	//getsheet
	
	Row rw = sh.getRow(0);	//getrow
	Cell cl = rw.getCell(0);
	String vl = cl.toString();	//or getStringcellvalue
	System.out.println(vl);			
	
	String vl2 = rw.getCell(1).toString();
	System.out.println(vl2);		
	
	System.out.println(rw.getCell(2).toString()); 		
	
	
}
}
