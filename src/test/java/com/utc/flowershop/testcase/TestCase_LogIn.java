package com.utc.flowershop.testcase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utc.flowershop.appmodules.LogIn_Action;
import com.utc.flowershop.pageobject.LogIn_Page;
import com.utc.flowershop.pageobject.TestBase;
import com.utc.flowershop.utility.Constant;
import com.utc.flowershop.utility.ExcelUtils;
import com.utc.flowershop.utility.Log;
import com.utc.flowershop.utility.Utility;

public class TestCase_LogIn {
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("LogIn");
		ExcelUtils.setExcelFile(Constant.pathTestData + Constant.fileTestData, "LogIn");
		Log.info("Excel sheet opened");
		String browserName = ExcelUtils.getCellData(1, 5);
		driver = Utility.openBrowser(browserName);
		Log.info("New driver instantiated");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Implicit wait applied on the driver for 10 seconds");
		driver.manage().window().maximize();
		Log.info("Browser full screen");
		driver.get(Constant.url);
		Log.info("Web application launched successfully");
		new TestBase(driver);

	}

	@Test(priority = 1)
	public void signIn_TC001() throws Exception {
		try {
			LogIn_Action.testCase001();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				LogIn_Page.test_pass(1);
			} else {
				LogIn_Page.test_failed(1, "Không hiển thị thông báo khi nhập quá độ dài Tên ĐN");
			}
		} catch (Exception e) {
			LogIn_Page.test_failed(1,"Error Exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void signIn_TC002() throws Exception {
		try {
			LogIn_Action.testCase002();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				LogIn_Page.test_pass(2);
			} else {
				LogIn_Page.test_failed(2, "Không hiển thị thông báo khi nhập Tên ĐN = 30 ký tự chưa có trong CSDL");
			}
		} catch (Exception e) {
			LogIn_Page.test_failed(2, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void signIn_TC003() throws Exception {
		try {
			LogIn_Action.testCase003();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				LogIn_Page.test_pass(3);
			} else {
				LogIn_Page.test_failed(3, "Không hiển thị thông báo khi nhập Tên ĐN < 30 ký tự chưa có trong CSDL");
			}
		} catch (

		Exception e) {
			LogIn_Page.test_failed(3, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void signIn_TC004() throws Exception {
		try {
			LogIn_Action.testCase004();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				LogIn_Page.test_pass(4);
			} else {
				LogIn_Page.test_failed(4, "Không hiển thị thông báo khi không Tên ĐN");
			}
		} catch (

		Exception e) {
			LogIn_Page.test_failed(4, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void signIn_TC005() throws Exception {
		try {
			LogIn_Action.testCase005();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				LogIn_Page.test_pass(5);
			} else {
				LogIn_Page.test_failed(5, "Không hiển thị thông báo khi nhập Mật khẩu > 30 ký tự ");
			}
		} catch (

		Exception e) {
			LogIn_Page.test_failed(5, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void signIn_TC006() throws Exception {
		try {
			LogIn_Action.testCase006();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				LogIn_Page.test_pass(6);
			} else {
				LogIn_Page.test_failed(6,
						"Không hiển thị thông báo khi nhập Tên ĐN = 30 ký tự có trong CSDL, không nhập Mật khẩu ");
			}
		} catch (

		Exception e) {
			LogIn_Page.test_failed(6, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void signIn_TC007() throws Exception {
		try {
			LogIn_Action.testCase007();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				LogIn_Page.test_pass(7);
			} else {
				LogIn_Page.test_failed(7,
						"Không hiển thị thông báo khi nhập Tên ĐN < 30 ký tự có trong CSDL, không nhập Mật khẩu ");
			}
		} catch (

		Exception e) {
			LogIn_Page.test_failed(7, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void signIn_TC008() throws Exception {
		try {
			LogIn_Action.testCase008();
			if (!LogIn_Page.message().isDisplayed()) {
				Log.info("Check display link thong tin tai khoan form SignIn ");
				LogIn_Page.test_pass(8);
			} else {
				LogIn_Page.test_failed(8,
						"Đăng nhập không thành công khi tên tai khoan khong co trong CSDL || Đăng ký giới hạn độ dài Tên ĐN , Pass");
			}
		} catch (Exception e) {
			LogIn_Page.test_failed(8, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void signIn_TC009() throws Exception {
		try {
			LogIn_Action.testCase009();
			if (!LogIn_Page.message().isDisplayed()) {
				Log.info("Check display link thong tin tai khoan form SignIn ");
				LogIn_Page.test_pass(9);
			} else {
				LogIn_Page.test_failed(9,
						"Đăng nhập không thành công khi tên tai khoan khong co trong CSDL || Đăng ký giới hạn độ dài Tên ĐN , Pass");
			}
		} catch (Exception e) {
			LogIn_Page.test_failed(9, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void signIn_TC010() throws Exception {
		try {
			LogIn_Action.testCase010();
			if (!LogIn_Page.message().isDisplayed()) {
				Log.info("Check display link thong tin tai khoan form SignIn ");
				LogIn_Page.test_pass(10);
			} else {
				LogIn_Page.test_failed(10,
						"Đăng nhập không thành công khi tên tai khoan khong co trong CSDL || Đăng ký giới hạn độ dài Tên ĐN , Pass");
			}
		} catch (Exception e) {
			LogIn_Page.test_failed(10, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	public void signIn_TC011() throws Exception {
		try {
			LogIn_Action.testCase011();
			Thread.sleep(5000);
			if (LogIn_Page.link_thongTinTK().isDisplayed()) {
				Log.info("Check display link thong tin tai khoan form SignIn ");
				LogIn_Page.test_pass(11);
			} else {
				LogIn_Page.test_failed(11,
						"Đăng nhập không thành công khi tên tai	 khoan khong co trong CSDL || Đăng ký giới hạn độ dài Tên ĐN , Pass");
			}
		} catch (Exception e) {
			LogIn_Page.test_failed(11, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 12)
	public void signIn_TC012() throws Exception {
		try {
			if (LogIn_Page.link_dangKy().isDisplayed()) {
				LogIn_Page.link_dangKy().click();
				Log.info("Click Link Dang Ky");
				String titleDangKy = driver.getTitle();
				Log.info("Get title Dang ky");
				if (titleDangKy.equals("dangky")) {
					LogIn_Page.test_pass(12);
					Log.info("Check successfull link Dang ky");
				} else {
					LogIn_Page.test_failed(12, "Không chuyển sang giao diên đăng ký");
					Log.error("Check not successfull link Dang ky");
				}
			}
		} catch (Exception e) {
			LogIn_Page.test_failed(12, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 13)
	public void signIn_TC013() throws Exception {
		try {
			if (LogIn_Page.link_foundPass().isDisplayed()) {
				LogIn_Page.link_foundPass().click();
				Log.info("Click Link quen mat khau");
				String titleTimPass = driver.getTitle();
				Log.info("Get title quyen mat khau");
				if (titleTimPass.equals("timmatkhau")) {
					LogIn_Page.test_pass(13);
					Log.info("Check successfull link quen pass");

				} else {
					LogIn_Page.test_failed(13, "Không chuyển sang giao diên quên mật khẩu");
					Log.error("Check not successfull link quen pass");
				}
			}
		} catch (Exception e) {
			LogIn_Page.test_failed(13, "Error exception");
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void afterMethod() {
		Log.endTestCase("LogIn");
		driver.quit();

	}
}
