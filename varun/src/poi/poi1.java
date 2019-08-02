package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poi1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		
		{
		File f = new File("C:\\Users\\varun.agarwal1\\Documents\\1.xlsx");
		
		
// read from the cell
		FileInputStream fis = new FileInputStream(f);
        
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow row = sh.getRow(0);
		XSSFCell cell = row.getCell(0);
		
		String s = cell.getStringCellValue();
		System.out.println("Data "+ s);

// update the exsisting cell	
		FileOutputStream fos = new FileOutputStream(f);
		
		cell.setCellValue("NOIDA");
		wb.write(fos);
		
		}
		
		catch(IOException e){
			
			e.printStackTrace();
		}
		
        
        
	}

}
