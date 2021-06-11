package fjnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultipleCondition {
	com a = new com();
	//条件组合覆盖
	/*
	 * 条件一：headphones<=0
	 * 条件二：shells<0
	 * 条件三：protectors<0?
	 * 条件四：total<1000
	 * 条件五：1000<total<1800
	 *
	 *  条件标记               判定取值
	 * 	 T1T2T3             第一个判定为真
	 * 	 F1T2T3             第一个判定为真
	 * 	 T1F2T3             第一个判定为真
	 *   T1T2F3             第一个判定为真
	 *   F1F2T3             第一个判定为真
	 *   F1T2F3             第一个判定为真
	 *   T1F2F3             第一个判定为真
	 *   F1F2F3             第一个判定为假
	 *   T4             	第二个判定为真
	 *   F4             	第二个判定为假
	 *   T5             	第三个判定为真
	 *   F5             	第三个判定为假
	 */
	
	@Test
	//T1T2T3 
	public void testCommission1() {
		float except = -1;
		float result = a.commission(0,-1,-1);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1T2T3 
	public void testCommission2() {
		float except = -1;
		float result = a.commission(1,-1,-1);
		assertEquals(except,result,0);
	}
	
	@Test
	//T1F2T3 
	public void testCommission3() {
		float except = -1;
		float result = a.commission(0,1,-1);
		assertEquals(except,result,0);
	}
	
	@Test
	//T1T2F3 
	public void testCommission4() {
		float except = -1;
		float result = a.commission(0,-1,1);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1F2T3 
	public void testCommission5() {
		float except = -1;
		float result = a.commission(1,1,-1);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1T2F3 
	public void testCommission6() {
		float except = -1;
		float result = a.commission(1,-1,1);
		assertEquals(except,result,0);
	}

	@Test
	//T1F2F3  
	public void testCommission7() {
		float except = -1;
		float result = a.commission(0,1,1);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1F2F3T4  
	public void testCommission8() {
		float except = 98;
		float result = a.commission(10,10,10);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1F2F3F4T5  
	public void testCommission9() {
		float except = 112;
		float result = a.commission(10,20,10);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1F2F3F4F5  
	public void testCommission10() {
		float except = 296;
		float result = a.commission(20,50,10);
		assertEquals(except,result,0);
	}
}
