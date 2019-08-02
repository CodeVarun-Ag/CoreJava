package Day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.dev.XSSFSave;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class NumbersToExcel {

	/**
	 * @param args
	 */
	int n1=0,n2=0,n3=0;
	public void read_excel(File f)
	{
		
		try {
			FileInputStream fi = new FileInputStream(f);
			XSSFWorkbook w = new XSSFWorkbook(fi);
			XSSFSheet s = w.getSheet("sheet1");
			for(int i=0;i<10;i++)
			{
				XSSFRow r = s.getRow(i);
				XSSFCell c = r.getCell(0);
				int data =  (int)c.getNumericCellValue();
				if(isPrime(data))
				{
					System.out.println("Prime  : "+data);
					excel_write(f,"Sheet2",data);
				}
				else if(isEven(data))
				{
					System.out.println("Even  : "+data);
					excel_write(f,"Sheet3",data);
				}
				else {
					System.out.println("Odd  : "+data);
					excel_write(f,"Sheet4",data);
				}
//					
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
				
			public void excel_write(File f, String s, int data)
			{
				try {
					FileInputStream fi1 = new FileInputStream(f);
					XSSFWorkbook w1 = new XSSFWorkbook(fi1);
					if(s.compareTo("Sheet2")==0)
					{
						XSSFSheet s1 = w1.getSheet(s);
						XSSFRow r1 = s1.createRow(n1);
						n1++;
						XSSFCell c1 = r1.createCell(0);
						c1.setCellValue((double)data);
						FileOutputStream fo = new FileOutputStream(f);
						w1.write(fo);
//						System.out.println("ITS in prime");
						
					}
					else if(s.compareTo("Sheet3")==0)
					{
						XSSFSheet s1 = w1.getSheet(s);
						XSSFRow r1 = s1.createRow(n2);
						n2++;
						XSSFCell c1 = r1.createCell(0);
						c1.setCellValue(data);
						FileOutputStream fo = new FileOutputStream(f);
						w1.write(fo);
					}
					else
					{
						XSSFSheet s1 = w1.getSheet(s);
						XSSFRow r1 = s1.createRow(n3);
						n3++;
						XSSFCell c1 = r1.createCell(0);
						c1.setCellValue(data);
						FileOutputStream fo = new FileOutputStream(f);
						w1.write(fo);
					}
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	public boolean isPrime(int n)
	{
		if(n==1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if( n%i==0)
				return false;
		}
		return true;
	}
	
	public boolean isEven(int n)
	{
		if(n%2==0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumbersToExcel obj = new NumbersToExcel();
		File f = new File("C:\\Users\\sajal.gupta1\\Desktop\\Book3.xlsx");
		obj.read_excel(f);
		
	}

}
