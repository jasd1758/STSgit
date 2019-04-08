package test.maven2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 *    -¿¨¿¨ÂÞÌØ 
 * @author Administrator
 *
 */
public class TestSayHello2 {

	//123456
	@Test
	public void  testSayHello2(){
		
		SyHello2 say = new SyHello2();
		
		String result = say.sayTime("moring");
		
		assertEquals("hello,jessica,moring", result);
	}
}
