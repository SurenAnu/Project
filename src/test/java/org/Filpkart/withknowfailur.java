package org.Filpkart;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class withknowfailur implements IRetryAnalyzer {
	int min=0;
	int max =5;

	@Override
	public boolean retry(ITestResult result) {
	if (min<max) {
		min++;
		return true;
	} else {
		return false;
	}
	
	
	}
}
