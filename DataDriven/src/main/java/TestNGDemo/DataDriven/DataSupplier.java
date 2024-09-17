package TestNGDemo.DataDriven;

import org.testng.annotations.DataProvider;



public class DataSupplier {
	@DataProvider(name="getTextData")
	public String[][] dataSupplier() {
		String[][] data={{"kaverijamb1234@gmail.com","12345"},{"kavitajamb1234@gmail.com","4321"},{"shridhar1234@gmail.com","4567"}};
				
				return data;
System.out.println("hello");
		
	}
	

}
