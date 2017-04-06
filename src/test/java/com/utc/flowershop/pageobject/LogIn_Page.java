package com.utc.flowershop.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.utc.flowershop.utility.ExcelUtils;
import com.utc.flowershop.utility.Log;
import com.utc.flowershop.utility.Utility;

public class LogIn_Page extends TestBase {
	private static WebElement element = null;

	public LogIn_Page(WebDriver driver) {
		super(driver);
	}
	public static void test_pass(int row) throws Exception {
		ExcelUtils.setCellData("Pass", row, 4);
		ExcelUtils.setCellData("", row, 6);
		Log.info("Test Case " + row + " Passed because of Verification");
	}

	public static void test_failed(int row, String message) throws Exception {
		Utility.takeScreenshot(driver, ExcelUtils.getCellData(row, 0));
		ExcelUtils.setCellData("Failed ", row, 4);
		ExcelUtils.setCellData("" + message, row, 6);
		ExcelUtils.setCellData("Failed : " + message, row, 6);
		Log.error("Test Case " + row + " Failed because of Verification" + message);
	}

	public static WebElement txt_UserName() throws Exception {
		try {
			element = driver.findElement(By.id("txttendangnhap"));
			Log.info("Username text box is found on the Login Page");
		} catch (Exception e) {
			Log.error("UserName text box is not found on the Login Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Password() throws Exception {
		try {
			element = driver.findElement(By.id("txtpass"));
			Log.info("Password text box is found on the Login_Page");
		} catch (Exception e) {
			Log.error("Password text box is found on the Login_Page" + e.getMessage());
			throw (e);
		}
		return element;
	}

	public static WebElement btn_LogIn() throws Exception {
		try {
			element = driver.findElement(By.xpath(
					"html/body/div[1]/div/div[3]/table/tbody/tr/td[2]/table[1]/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/input"));
			Log.info("Submit button is found on the Login_Page");
		} catch (Exception e) {
			Log.error("Submit button is found on the Login_Page" + e.getMessage());
			throw (e);
		}
		return element;
	}

	public static WebElement link_dangKy() throws Exception {
		try {
			element = driver.findElement(By.xpath(
					"html/body/div[1]/div/div[3]/table/tbody/tr/td[2]/table[1]/tbody/tr[2]/td/form/table/tbody/tr[6]/td/a[1]"));
			Log.info("Link Đăng Ký is found on the Login_Page");
		} catch (Exception e) {
			Log.error("Link Đăng Ký is found on the Login_Page" + e.getMessage());
			throw (e);
		}
		return element;
	}

	public static WebElement link_foundPass() throws Exception {
		try {
			element = driver.findElement(By.xpath(
					"html/body/div[1]/div/div[3]/table/tbody/tr/td[2]/table[1]/tbody/tr[2]/td/form/table/tbody/tr[6]/td/a[2]"));
			Log.info("Link quên Pass is found on the Login_Page");
		} catch (Exception e) {
			Log.error("Link quên Pass is found on the Login_Page" + e.getMessage());
			throw (e);
		}
		return element;
	}

	public static WebElement message() throws Exception {
		try {
			element = driver.findElement(By.xpath(
					"html/body/div[1]/div/div[3]/table/tbody/tr/td[2]/table[1]/tbody/tr[2]/td/form/table/tbody/tr[5]/td/span"));
			Log.info("Message is found on the Login_Page");
		} catch (Exception e) {
			Log.error("Message is found on the Login_Page" + e.getMessage());
			throw (e);
		}
		return element;
	}

	public static WebElement link_thongTinTK() throws Exception {
		try {
			element = driver.findElement(By.linkText("Thông Tin Tài Khoản"));
			Log.info("Link thong tin tai khoan is found on the Login_Page");
		} catch (Exception e) {
			Log.error("Link thong tin tai khoan is not found on the Login_Page" + e.getMessage());
			throw (e);
		}
		return element;
	}
	
	
}
