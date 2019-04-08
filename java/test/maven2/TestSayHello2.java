package test.maven2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSayHello2 {

	
	@Test
	public void  testSayHello2(){
		
		SyHello2 say = new SyHello2();
		
		String result = say.sayTime("moring");
		
		assertEquals("hello,jessica,moring", result);
	}
}
