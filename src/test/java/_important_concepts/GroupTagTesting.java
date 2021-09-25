package _important_concepts;	

import org.testng.annotations.Test;	

public class GroupTagTesting {	

	@Test(groups = { "bonding", "strong_ties" })	
	public void TC_001() {	
		System.out.println("TC_001");
	}	

	@Test(groups = { "bonding" })	
	public void TC_002() {	
		System.out.println("TC_002");
	}	

	@Test(groups = { "bonding", "strong_ties" })	
	public void TC_003() {	
		System.out.println("TC_003");
	}	

	@Test(groups = { "strong_ties" })	
	public void TC_004() {	
		System.out.println("TC_004");
	}	

	@Test(groups = { "bonding" })	
	public void TC_005() {	
		System.out.println("TC_005");
	}	

}	
