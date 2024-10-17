package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_write 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream fis= new FileInputStream("C:\\Users\\PC\\Desktop\\DDT1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh;
	try
	{
	sh=wb.createSheet("Sheet2"); //createsheet
	}
	catch (Exception e) 
	{
	sh = wb.getSheet("Sheet2"); //getesheet
	}
	
	Row rw0 = sh.createRow(0);	//createrow
	rw0.createCell(0).setCellValue("aaa1"); //setcellvalue
	rw0.createCell(1).setCellValue("bbb1");
	rw0.createCell(2).setCellValue("ccc1");
	
	Row rw1 = sh.createRow(1);
	rw1.createCell(0).setCellValue("ddd1");
	rw1.createCell(1).setCellValue("eee1");
	rw1.createCell(2).setCellValue("fff1");
	
	FileOutputStream fos= new FileOutputStream("C:\\Users\\PC\\Desktop\\DDT1.xlsx");
	wb.write(fos);
	
}
}
