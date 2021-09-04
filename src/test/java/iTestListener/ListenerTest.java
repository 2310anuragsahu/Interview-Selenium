package iTestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	public void onFinish(ITestContext Result) {

	}

	public void onStart(ITestContext Result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

	// When Test case get failed, this method is called.
	public void onTestFailure(ITestResult Result) {
		System.out.println("The name of the Failed Test Case : " + Result.getName());
	}

	// When Test case get Skipped, this method is called.
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the Skipped Test Case:" + Result.getName());
	}

	// When Test case get Started, this method is called.
	public void onTestStart(ITestResult Result) {
		System.out.println("Now Testing Test Case : " + Result.getName());
	}

	// When Test case get passed, this method is called.
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Test Case Passed :" + Result.getName());
	}

}
