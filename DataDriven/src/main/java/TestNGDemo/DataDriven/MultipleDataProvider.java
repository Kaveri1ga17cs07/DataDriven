package TestNGDemo.DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataProvider {
	@Test(dataProvider="passTest",dataProviderClass=SampleProviderTwo.class)
	public void sample(String one,String two,String three) {
		System.out.println(one+"-"+two+"-"+three);
	}

	

	
	

}
	
