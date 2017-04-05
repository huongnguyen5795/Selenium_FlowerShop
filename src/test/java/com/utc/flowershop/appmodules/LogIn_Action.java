package com.utc.flowershop.appmodules;

import com.utc.flowershop.pageobject.LogIn_Page;
import com.utc.flowershop.utility.ExcelUtils;
import com.utc.flowershop.utility.Log;

public class LogIn_Action {
	public static void testCase001() throws Exception {
		try {
			getData_LogIn(1);

		} catch (Exception e) {
			Log.error("Test Case 001 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase002() throws Exception {
		try {
			getData_LogIn(2);

		} catch (Exception e) {
			Log.error("Test Case 002 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase003() throws Exception {
		try {
			getData_LogIn(3);

		} catch (Exception e) {
			Log.error("Test Case 003 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase004() throws Exception {
		try {
			getData_LogIn(4);

		} catch (Exception e) {
			Log.error("Test Case 004 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase005() throws Exception {
		try {
			getData_LogIn(5);

		} catch (Exception e) {
			Log.error("Test Case 005 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase006() throws Exception {
		try {
			getData_LogIn(6);

		} catch (Exception e) {
			Log.error("Test Case 006 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase007() throws Exception {
		try {
			getData_LogIn(7);

		} catch (Exception e) {
			Log.error("Test Case 007 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase008() throws Exception {
		try {
			getData_LogIn(8);

		} catch (Exception e) {
			Log.error("Test Case 008 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase009() throws Exception {
		try {
			getData_LogIn(9);

		} catch (Exception e) {
			Log.error("Test Case 009 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase010() throws Exception {
		try {
			getData_LogIn(10);

		} catch (Exception e) {
			Log.error("Test Case 010 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase011() throws Exception {
		try {
			getData_LogIn(11);

		} catch (Exception e) {
			Log.error("Test Case 011 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void getData_LogIn(int row) throws Exception {
		String userName = ExcelUtils.getCellData(row, 2);
		Log.info("User name picked from Excel is " + userName);
		LogIn_Page.txt_UserName().sendKeys(userName);
		Log.info("User name entered in the Username text box");
		String passWord = ExcelUtils.getCellData(row, 3);
		Log.info("Pass word picked from Excel is " + passWord);
		LogIn_Page.txt_Password().sendKeys(passWord);
		Log.info("Pass word entered in the Password text box");
		LogIn_Page.btn_LogIn().click();
		Log.info("Click action performed on Submit button");

	}



}
