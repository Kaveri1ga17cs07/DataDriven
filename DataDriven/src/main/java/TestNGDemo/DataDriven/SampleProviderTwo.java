package TestNGDemo.DataDriven;

import org.testng.annotations.DataProvider;

public class SampleProviderTwo {
	public class SupplierThree {

	@DataProvider(name="passTest")
	public String[][] supplier3(){
		
		String[][] data= {{"kavya","Motoori","shravya"},
				{"divya","Dhwath","samyukta"},
				{"ramya","Bhaskar","sarita"}
				};
	return data;
	}
	}
	public class supplierFour {

		@DataProvider(name="supplierFour")
		public String[][] supplier4(){
			
			String[][] data= {{"shridhar","kaveri","sharvari"},
					{"kavita","Kartik","Rohit"},
					{"krishna","Manohar","kavari"}
					};
		return data;
		}
}
}


