package Varun1;

import java.io.*;

import org.apache.poi.xssf.usermodel.*;

import poi.File;
import poi.FileInputStream;
import poi.FileOutputStream;
import poi.IOException;
import poi.String;

public class teststudent1 {
	
//	int Sid,Java,Sel;
//	String SName,Grade;
//	double Average;
	
	
	Student1 readexcel(int row){
		
		
		Student1 s1 = new Student1();
		
		
//		Student1 Girish = new Student1();
//		Student1 Mohan = new Student1();
//		Student1 Rakesh = new Student1();
		
		
		try
		
		{
		File f = new File("C:\\Users\\varun.agarwal1\\Documents\\varun.xlsx");
		FileInputStream fis = new FileInputStream(f);
	    XSSFWorkbook wb = new  XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		for(int i=1;i<=3;i++)
		{
		XSSFRow r = sh.getRow(i);
		XSSFCell c = r.getCell(0);
		s1.Sid=(int) c.getNumericCellValue();
	    c = r.getCell(1);
	    s1.SName= c.getStringCellValue();
	    c = r.getCell(2);
	    s1.Java=(int) c.getNumericCellValue();
	    c = r.getCell(3);
	    s1.Sel=(int) c.getNumericCellValue();
		}
}
		
		
//		XSSFRow row = sh.getRow(1);
//		XSSFCell cell = row.getCell(0);
//	    Girish.Sid = (int) cell.getNumericCellValue();
//	    cell = row.getCell(1);
//	    Girish.SName= cell.getStringCellValue();
//	    cell = row.getCell(2);
//	    Girish.Java=(int) cell.getNumericCellValue();
//	    cell = row.getCell(3);
//	    Girish.Sel=(int) cell.getNumericCellValue();
//		
//		row = sh.getRow(2);
//		cell = row.getCell(0);
//		Mohan.Sid = (int) cell.getNumericCellValue();
//		cell = row.getCell(1);
//		Mohan.SName= cell.getStringCellValue();
//		cell = row.getCell(2);
//		Mohan.Java=(int) cell.getNumericCellValue();
//		cell = row.getCell(3);
//		Mohan.Sel=(int) cell.getNumericCellValue();
//	    
//	    
//	    
//	    row = sh.getRow(3);
//	    cell = row.getCell(0);
//	    Rakesh.Sid = (int) cell.getNumericCellValue();
//	    cell = row.getCell(1);
//	    Rakesh.SName= cell.getStringCellValue();
//	    cell = row.getCell(2);
//	    Rakesh.Java=(int) cell.getNumericCellValue();
//	    cell = row.getCell(3);
//	    Rakesh.Sel=(int) cell.getNumericCellValue();

		
	catch(IOException e){
			
			e.printStackTrace();
		}
		return s1 ;
		
	}
		
		Student1 writeexccel(int row,double Average,String Grade){
			
			
		try
				
				{
				File f = new File("C:\\Users\\varun.agarwal1\\Documents\\varun.xlsx");
				
				

				FileInputStream fis = new FileInputStream(f);
		        
				XSSFWorkbook wb = new  XSSFWorkbook(fis);
				
				XSSFSheet sh = wb.getSheet("Sheet1");
				
				int i;
				XSSFRow r = sh.createRow(i);
				XSSFCell c = r.createCell(4);
				c.setCellValue(Average);
				c = r.createCell(5);
				c.setCellValue(Grade);
				
				FileOutputStream fos = new FileOutputStream(f);
				
				
				wb.write(fos);
				
				
				}
				
				catch(IOException e){
					
					e.printStackTrace();
				}
				
			
			
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
