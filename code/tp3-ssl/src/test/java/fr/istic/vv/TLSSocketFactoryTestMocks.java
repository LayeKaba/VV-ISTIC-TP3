package fr.istic.vv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static  org.mockito.Mockito.*;

import static  org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TLSSocketFactoryTestMocks {

	SSLSocket socket1;
	SSLSocket socket2;
	SSLSocket socket3;
	
	@BeforeEach
	public void setUp() {
		
	}
	
	@Test
	public void testUsePrepareSocket()
	{
		SSLSocket mock = mock(SSLSocket.class); 
		when(mock.getEnabledProtocols()).thenReturn(null);
		when(mock.getSupportedProtocols()).thenReturn(null);
		
		
		TLSSocketFactory factory = new TLSSocketFactory();
		factory.prepareSocket(mock);
		
		fail("Error !!!");
	}
	
	
	
	@Test
	public void testTypic() {
		String[] supportedProtocolList = {"SSLv2Hello", "SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2"};
		
		String[] enableProtocolList = {"SSLv3", "TLSv1"};
		
		String[] setEnableProtocolList = {"TLSv1.2", "TLSv1.1", "TLSv1", "SSLv3" };
		
		SSLSocket mock = mock(SSLSocket.class); 
		when(mock.getEnabledProtocols()).thenReturn(enableProtocolList);
		when(mock.getSupportedProtocols()).thenReturn(supportedProtocolList);
		
		assertTrue(Arrays.equals(setEnableProtocolList, new String[] {"TLSv1.2", "TLSv1.1", "TLSv1", "SSLv3" }));
		
	}
}
