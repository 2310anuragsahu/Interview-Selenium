package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.ListenerTest.class)
public class TestCases {

	// Test to pass as to verify listeners .
	@Test
	public void Login() {
		System.out.println("This method is to Pass the test");
		Assert.assertTrue(true);
	}

	// Forcefully failed this test as to verify listener.
	@Test
	public void TestToFail() {
		System.out.println("This method to test fail");
		Assert.assertTrue(false);
	}
}
