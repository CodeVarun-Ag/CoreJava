package Day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_io {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\sajal.gupta1\\Desktop\\Book1.xlsx");
		try {
			FileInputStream fi= new FileInputStream(f);
			XSSFWorkbook w = new XSSFWorkbook(fi);
			XSSFSheet s = w.getSheet("sheet1");
			XSSFRow r1 = s.createRow(0);
			XSSFCell c1=r1.createCell(3);
			c1.setCellValue("Hello everyone");
			FileOutputStream fo = new FileOutputStream(f);
			w.write(fo);
			
//			XSSFRow r = s.getRow(0);
//			XSSFCell c= r.getCell(0);
//			String str= c.getStringCellValue();
//			System.out.println(str);
//			c.setCellValue("Noida");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
