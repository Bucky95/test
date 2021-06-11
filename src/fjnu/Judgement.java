package fjnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class Judgement {
	com a = new com();
	//ÅÐ¶¨¸²¸Ç
	@Test
	//ab
	public void testCommission1() {
		float except = -1;
		float result = a.commission(0,0,0);
		assertEquals(except,result,0);
	}
	
	@Test
	//aceg
	public void testCommission2() {
		float except = 296;
		float result = a.commission(20,50,10);
		assertEquals(except,result,0);
	}

	@Test
	//acd
	public void testCommission3() {
		float except = 98;
		float result = a.commission(10,10,10);
		assertEquals(except,result,0);
	}
	
	@Test
	//acef
	public void testCommission4() {
		float except = 112;
		float result = a.commission(10,20,10);
		assertEquals(except,result,0);
	}
	
}
