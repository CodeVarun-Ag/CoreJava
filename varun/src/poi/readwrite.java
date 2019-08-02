package poi;

import java.io.*;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class readwrite {
	
	
	int read(int row,int cell1)
	{
		int s=0;
	try
	
	{
	File f = new File("C:\\Users\\varun.agarwal1\\Documents\\1.xlsx");
	FileInputStream fis = new FileInputStream(f);
    XSSFWorkbook wb = new  XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheet("Numbers");
	
	XSSFRow rows = sh.getRow(row);
	XSSFCell cell = rows.getCell(cell1);
    s = (int)cell.getNumericCellValue();
	}
catch(IOException e){
		
		e.printStackTrace();
	}
	return s;
	
	}
	
	
	void write(int row, int cell,int data,String Sheet)
	{
try
		
		{
		File f = new File("C:\\Users\\varun.agarwal1\\Documents\\1.xlsx");
		
		

		FileInputStream fis = new FileInputStream(f);
        
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet(Sheet);
		XSSFRow row1 = sh.createRow(row);
		XSSFCell cell2 = row1.createCell(cell);
		cell2.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	
    
    static boolean prime(int n)
   {

 {
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
			return false;
			
	}
	return true;
}


}



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		readwrite rw = new readwrite();
		int i =0,j=0,k=0,l=0;
		for(i=0;i<10;i++)
		{
			int x = rw.read(i, 0);
		
		if(prime(x))
		{
			rw.write(j, 0, x, "Prime");
			j++;
		}
		else if(x%2==0)
		{
			rw.write(k, 0, x, "Even");
			k++;
		}
		else
		{
			rw.write(l, 0, x, "Odd");
			l++;
		}
}
}
}