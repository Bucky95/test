package fjnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class Statement {
	com a = new com();
	
	//Óï¾ä¸²¸Ç
	@Test
	//acd
	public void testCommission1() {
		float except = 98;
		float result = a.commission(10,10,10);
		assertEquals(except,result,0);
	}
	
	@Test
	//acef
	public void testCommission2() {
		float except = 169;
		float result = a.commission(15,10,20);
		assertEquals(except,result,0);
	}
	
	@Test
	//aceg
	public void testCommission3() {
		float except = 296;
		float result = a.commission(20,50,10);
		assertEquals(except,result,0);
	}
	
}
