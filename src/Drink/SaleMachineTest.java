package Drink;

import static org.junit.Assert.*;

import org.junit.Test;

public class SaleMachineTest {
	SaleMachine a = new SaleMachine();
	@Test
	public void test1() {
		assertEquals("��ȡ��beer",a.sale("beer", 5));
		assertEquals("��ȡ��orange",a.sale("orange", 5));
		assertEquals("����ָ��! ",a.sale("beer", 10));
		assertEquals("����ָ��! ",a.sale("orange", 10));
		assertEquals("��ȡ��beer",a.sale("beer", 5));
		assertEquals("��ȡ��beer",a.sale("beer", 5));
		assertEquals("��ȡ��beer",a.sale("beer", 5));
		assertEquals("�ܱ�Ǹ��û��beer",a.sale("beer", 5));
		assertEquals("��ȡ��orange",a.sale("orange", 5));
		assertEquals("��ȡ��orange",a.sale("orange", 5));
		assertEquals("��ȡ��orange",a.sale("orange", 5));
		assertEquals("�ܱ�Ǹ��û��orange",a.sale("orange", 5));
		assertEquals("����ָ��! ",a.sale("abc", 5));
	}
	
	@Test
	public void test2() {
		assertEquals("����ָ��! ",a.sale("beer", 10));
		assertEquals("����ָ��! ",a.sale("beer", 10));
		assertEquals("����ָ��! ",a.sale("beer", 10));
		assertEquals("����ָ��! ",a.sale("beer", 10));
		assertEquals("����ָ��! ",a.sale("orange", 10));
		assertEquals("����ָ��! ",a.sale("orange", 10));
	}
}
