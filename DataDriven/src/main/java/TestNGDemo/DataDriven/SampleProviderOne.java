package TestNGDemo.DataDriven;

import org.testng.annotations.DataProvider;

public class SampleProviderOne {
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
		public class supplierTwo {

			@DataProvider(name="supplierTwo")
			public String[][] supplier2(){
				
				String[][] data= {{"shridhar","kaveri","sharvari"},
						{"kavita","Dhwath","Mango"},
						{"krishna","Bhaskar","pineapple"}
						};
			return data;
			}
}
	}

	

