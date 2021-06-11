package hotel;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;
import hotel.IData;
import hotel.InHotel;

public class InHotelMockTest {

	//����һ��Mockery����
    private Mockery context=new Mockery();
    private IData iData=null;
    private InHotel ih=null;
	
	//�ù��������Mockeryʵ��������һ��ģ���iData����
    @Before
    public void setUp() throws Exception{
   	 iData=context.mock(IData.class);
   	 ih=new InHotel(iData);
   	 //����in_Out_Room����һ��
   	 context.checking(new Expectations(){{
   		allowing(iData).in_Out_Room(601, "ZX");
   		will(onConsecutiveCalls(returnValue("ZX�ɹ���ס601���䣡"),returnValue("�÷����Ѿ�������ס")));
   		 }});
     }
    @Test
	public void testIn() {
          //����
		assertEquals("ZX�ɹ���ס601���䣡",ih.in(601, "ZX"));
		assertEquals("�÷����Ѿ�������ס",ih.in(601, "ZX"));
	}
}
