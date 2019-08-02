package assessment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q3 {


@SuppressWarnings("resource")
static Product readExcel(int row)
{
Product p = new Product();



try {

File f = new File("C:\\Users\\varun.agarwal1\\Documents\\Book2.xlsx");
FileInputStream fis = new FileInputStream(f);
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sh = wb.getSheet("Sheet1");
XSSFRow r = sh.getRow(row);
XSSFCell c = r.getCell(0);
p.productId = (int)c.getNumericCellValue();
p.productName = r.getCell(1).getStringCellValue();
p.perUnitRate =  (int) r.getCell(2).getNumericCellValue();
p.unitPurchased = (int) r.getCell(3).getNumericCellValue();


} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

return p;
}


static void writeExcel(int row, int price, String grade)
{
try {

File f = new File("C:\\Users\\varun.agarwal1\\Documents\\Book2.xlsx");
FileInputStream fis = new FileInputStream(f);
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sh = wb.getSheet("Sheet1");
XSSFRow r = sh.getRow(row);
XSSFCell c = r.createCell(4);
c.setCellValue(price);
XSSFCell c1 = r.createCell(5);
c1.setCellValue(grade);

FileOutputStream fos = new FileOutputStream(f);
wb.write(fos);



} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}



public static void main(String[] args) {
// TODO Auto-generated method stub

Product p1 = new Product();

ArrayList<Product> al = new ArrayList<Product>();

for(int i=1;i<=3;i++)
{
p1 = readExcel(i);
al.add(p1);
al.get(i-1).price();
al.get(i-1).grade();

writeExcel(i,al.get(i-1).price,al.get(i-1).grade);

}


}

}

