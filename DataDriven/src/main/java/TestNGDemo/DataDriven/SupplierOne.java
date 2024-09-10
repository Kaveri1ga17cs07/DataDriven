package TestNGDemo.DataDriven;

import org.testng.annotations.DataProvider;

public class SupplierOne {

	@DataProvider(name="supplierOne")
	public String[][] supplier1(){
		
		String[][] data= {{"Arun","Motoori","Apple"},
				{"Varun","Dhwath","Mango"},
				{"Tharun","Bhaskar","pineapple"}
				};
	return data;
	}
}
