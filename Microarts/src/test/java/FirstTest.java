import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.micro.services.AddInterface;
import com.micro.services.ServiceClass;


@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.micro.services.*")
public class FirstTest {
	
	@InjectMocks
	private ServiceClass service;
	
	@Mock
	private AddInterface addInterface;
	

	@Test
	public void firstTest() throws Exception {
		
		addInterface =	Mockito.mock(AddInterface.class);
	//	PowerMockito.spy(addInterface);
		PowerMockito.when(addInterface.add()).thenReturn(1);
		
		
		int c = service.FirstMethod();
		assertEquals(1, c);
		
	}
	
	
	
}
