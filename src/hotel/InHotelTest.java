package hotel;

import static org.junit.Assert.*;

import org.junit.Test;

public class InHotelTest {
	protected DP dp=new DP();
	protected IData id=dp;
	protected InHotel ih=new InHotel(id);
	@Test
	public void test1() {
		id.iniRooms();
		assertEquals("ZX成功入住904房间！",ih.in(904, "ZX"));
	}

}
