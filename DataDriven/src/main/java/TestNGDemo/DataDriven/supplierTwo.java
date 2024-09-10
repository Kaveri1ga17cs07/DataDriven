package TestNGDemo.DataDriven;

import org.testng.annotations.DataProvider;

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
