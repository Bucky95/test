package fjnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class Condition {
	com a = new com();
	//条件覆盖
	/*
	 * 条件一：headphones<=0
	 * 条件二：shells<0
	 * 条件三：protectors<0?
	 * 条件四：total<1000
	 * 条件五：1000<total<1800
	 */
	@Test
	//T1 F2 F3  
	public void testCommission1() {
		float except = -1;
		float result = a.commission(0,0,0);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1 T2 F3  
	public void testCommission2() {
		float except = -1;
		float result = a.commission(2,-1,0);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1 F2 T3  
	public void testCommission3() {
		float except = -1;
		float result = a.commission(1,1,-1);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1 F2 F3 T4  
	public void testCommission4() {
		float except = 98;
		float result = a.commission(10,10,10);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1 F2 F3 F4 T5  
	public void testCommission5() {
		float except = 112;
		float result = a.commission(10,20,10);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1 F2 F3 F4 F5 
	public void testCommission6() {
		float except = 296;
		float result = a.commission(20,50,10);
		assertEquals(except,result,0);
	}
}
