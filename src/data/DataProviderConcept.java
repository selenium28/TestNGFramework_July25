package data;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderConcept {
  @Test(dataProvider = "dataProviderMethod")
  public void testCAseOne(Integer n, String s) {
	  
	  System.out.println("Number" +n);
	  System.out.println("Name" +s);
  }

  @DataProvider
  public Object[][] dataProviderMethod() {
	  Object[][] data = new Object[2][2];
	  
	  data[0][0] = 10;
	  data[0][1] = "Diya";
	  
	  data[1][0] = 20;
	  data[1][1] = "Pooja";
	  
	return data;
    
  }
}
