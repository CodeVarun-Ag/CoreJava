package assessment;

public class Product {
	
	
	public int productId,perUnitRate,unitPurchased,price;
	String productName,grade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

	}

	public void price() {
		// TODO Auto-generated method stub
		
		price=unitPurchased*perUnitRate;
		
	}

	public void grade() {
		// TODO Auto-generated method stub
		if(price<25000)
		grade ="GradeA";
		else
			grade="B";
	}

	

	

}
