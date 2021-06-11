package fjnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecisionCondition {
	com a = new com();
	//����-�ж�����
		/*
		 * ����һ��headphones<=0
		 * ��������shells<0
		 * ��������protectors<0?
		 * �����ģ�total<1000
		 * �����壺1000<total<1800
		 */
	
	@Test
	//T1T2T3 
	public void testCommission1() {
		float except = -1;
		float result = a.commission(0,-1,-1);
		assertEquals(except,result,0);
	}

	@Test
	//F1F2F3T4 
	public void testCommission2() {
		float except = 98;
		float result = a.commission(10,10,10);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1F2F3F4T5 
	public void testCommission3() {
		float except = 112;
		float result = a.commission(10,20,10);
		assertEquals(except,result,0);
	}
	
	@Test
	//F1F2F3F4F5 
	public void testCommission4() {
		float except = 296;
		float result = a.commission(20,50,10);
		assertEquals(except,result,0);
	}
}
