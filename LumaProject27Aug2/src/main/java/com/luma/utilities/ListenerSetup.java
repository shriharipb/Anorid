package com.luma.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.luma.testBase.TestBase;

public class ListenerSetup  extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test Case execution started ");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Case execution completed ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test Case execution failed ");
		UtilClass.takeSS(result.getName()+System.currentTimeMillis());
		logger.info("Take Screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Case execution skipped ");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	

}
