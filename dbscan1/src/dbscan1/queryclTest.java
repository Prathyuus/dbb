package dbscan1;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.junit.Assert;

class queryclTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
	querycl juint = new querycl();
	String name = "select * from ipl.csv where season > 2014 and city = 'Bangalore'";
	String results = juint.extfname(name);
	//assertEquals("ipl",results,"Incorrect file name");
	Assert.assertTrue(results.equals("ipl"));
	/*String[] name1 = { "select","*","from","ipl.csv","where","season",">","2014","and","city","=","'Bangalore'"};
	String results1 = juint.splwhr("where",name1);
	Assert.assertTrue(results1.equals("season>2014"));*/
	String results1 = juint.bfwhr(name);	
	Assert.assertTrue(results1.equals("select * from ipl.csv "));
	String results2 = juint.afwhr(name);	
	Assert.assertTrue(results2.equals("season > 2014 and city = 'Bangalore'"));
	
	
	}
	
}
