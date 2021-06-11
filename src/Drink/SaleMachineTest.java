package Drink;

import static org.junit.Assert.*;

import org.junit.Test;

public class SaleMachineTest {
	SaleMachine a = new SaleMachine();
	@Test
	public void test1() {
		assertEquals("请取走beer",a.sale("beer", 5));
		assertEquals("请取走orange",a.sale("orange", 5));
		assertEquals("错误指令! ",a.sale("beer", 10));
		assertEquals("错误指令! ",a.sale("orange", 10));
		assertEquals("请取走beer",a.sale("beer", 5));
		assertEquals("请取走beer",a.sale("beer", 5));
		assertEquals("请取走beer",a.sale("beer", 5));
		assertEquals("很抱歉，没有beer",a.sale("beer", 5));
		assertEquals("请取走orange",a.sale("orange", 5));
		assertEquals("请取走orange",a.sale("orange", 5));
		assertEquals("请取走orange",a.sale("orange", 5));
		assertEquals("很抱歉，没有orange",a.sale("orange", 5));
		assertEquals("错误指令! ",a.sale("abc", 5));
	}
	
	@Test
	public void test2() {
		assertEquals("错误指令! ",a.sale("beer", 10));
		assertEquals("错误指令! ",a.sale("beer", 10));
		assertEquals("错误指令! ",a.sale("beer", 10));
		assertEquals("错误指令! ",a.sale("beer", 10));
		assertEquals("错误指令! ",a.sale("orange", 10));
		assertEquals("错误指令! ",a.sale("orange", 10));
	}
}
