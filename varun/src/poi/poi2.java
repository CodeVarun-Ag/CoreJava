package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poi2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		
		{
		File f = new File("C:\\Users\\varun.agarwal1\\Documents\\1.xlsx");
		
		

		FileInputStream fis = new FileInputStream(f);
        
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow row1 = sh.createRow(2);
		XSSFCell cell1 = row1.createCell(0);
		cell1.setCellValue("Varun Agarwal");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		
		wb.write(fos);
		
		}
		
		catch(IOException e){
			
			e.printStackTrace();
		}
		
        
        
	}

}
