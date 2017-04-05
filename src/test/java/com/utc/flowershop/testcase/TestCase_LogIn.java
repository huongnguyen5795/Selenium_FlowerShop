package com.utc.flowershop.testcase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utc.flowershop.appmodules.LogIn_Action;
import com.utc.flowershop.pageobject.LogIn_Page;
import com.utc.flowershop.pageobject.TestBase;
import com.utc.flowershop.utility.Constant;
import com.utc.flowershop.utility.ExcelUtils;
import com.utc.flowershop.utility.Log;
import com.utc.flowershop.utility.Utility;

public class TestCase_LogIn {
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("LogIn");
		extent = new ExtentReports("D:/Nam4ky2/NCKH/Code/selenium/DoAn_Selenium/Reports/TestReport_SignIn.html", true);
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
			test = extent.startTest("SignIn_TC001");
			LogIn_Action.testCase001();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				test.log(LogStatus.PASS, "Hiển thị thông báo khi nhập Tên Đăng Nhập > 30 ký tự ");
				LogIn_Page.test_pass(1);
			} else {
				test.log(LogStatus.FAIL, "Không hiển thị thông báo khi nhập Tên Đăng Nhập > 30 ký tự ");
				LogIn_Page.test_failed(1, "Không hiển thị thông báo khi nhập  Tên ĐN > 30 ký tự");

			}
			extent.endTest(test);
	    	extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(1, "Error Exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void signIn_TC002() throws Exception {
		try {
			test = extent.startTest("SignIn_TC002");
			LogIn_Action.testCase002();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				test.log(LogStatus.PASS, "Hiển thị thông báo khi nhập Tên ĐN = 30 ký tự chưa có trong CSDL ");
				LogIn_Page.test_pass(2);
			} else {
				test.log(LogStatus.FAIL, "Không Hiển thị thông báo khi nhập Tên ĐN = 30 ký tự chưa có trong CSDL ");
				LogIn_Page.test_failed(2, "Không hiển thị thông báo khi nhập Tên ĐN = 30 ký tự chưa có trong CSDL");
			}
			extent.endTest(test);
	    	extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(2, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void signIn_TC003() throws Exception {
		try {
			test = extent.startTest("SignIn_TC003");
			LogIn_Action.testCase003();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				test.log(LogStatus.PASS, "Hiển thị thông báo khi nhập Tên ĐN < 30 ký tự chưa có trong CSDL");
				LogIn_Page.test_pass(3);
			} else {
				test.log(LogStatus.FAIL, "Không hiển thị thông báo khi nhập Tên ĐN < 30 ký tự chưa có trong CSDL");
				LogIn_Page.test_failed(3, "Không hiển thị thông báo khi nhập Tên ĐN < 30 ký tự chưa có trong CSDL");
			}
			extent.endTest(test);
	    	extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(3, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void signIn_TC004() throws Exception {
		try {
			test = extent.startTest("SignIn_TC004");
			LogIn_Action.testCase004();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				test.log(LogStatus.PASS, "Hiển thị thông báo khi không Tên ĐN");
				LogIn_Page.test_pass(4);
			} else {
				test.log(LogStatus.FAIL, "Không hiển thị thông báo khi không Tên ĐN");
				LogIn_Page.test_failed(4, "Không hiển thị thông báo khi không Tên ĐN");
			}
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(4, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void signIn_TC005() throws Exception {
		try {
			test = extent.startTest("SignIn_TC005");
			LogIn_Action.testCase005();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				test.log(LogStatus.PASS, "Hiển thị thông báo khi nhập Mật khẩu > 30 ký tự");
				LogIn_Page.test_pass(5);
			} else {
				test.log(LogStatus.FAIL, "Không hiển thị thông báo khi nhập Mật khẩu > 30 ký tự");
				LogIn_Page.test_failed(5, "Không hiển thị thông báo khi nhập Mật khẩu > 30 ký tự ");
			}
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(5, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void signIn_TC006() throws Exception {
		try {
			test = extent.startTest("SignIn_TC006");
			LogIn_Action.testCase006();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				test.log(LogStatus.FAIL, "Không hiển thị thông báo khi nhập Mật khẩu > 30 ký tự");
				LogIn_Page.test_pass(6);
			} else {
				test.log(LogStatus.FAIL, "Không hiển thị thông báo khi nhập Mật khẩu > 30 ký tự");
				LogIn_Page.test_failed(6,
						"Không hiển thị thông báo khi nhập Tên ĐN = 30 ký tự có trong CSDL, không nhập Mật khẩu ");
			}
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(6, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void signIn_TC007() throws Exception {
		try {
			test = extent.startTest("SignIn_TC007");
			LogIn_Action.testCase007();
			if (LogIn_Page.message().getText().equals("Sai Tên Đăng Nhập Hoặc Mật Khẩu")) {
				Log.info("Check display message form SignIn ");
				test.log(LogStatus.PASS,
						"Hiển thị thông báo khi nhập Tên ĐN < 30 ký tự có trong CSDL, không nhập Mật khẩu");
				LogIn_Page.test_pass(7);
			} else {
				test.log(LogStatus.FAIL,
						"Không hiển thị thông báo khi nhập Tên ĐN < 30 ký tự có trong CSDL, không nhập Mật khẩu");
				LogIn_Page.test_failed(7,
						"Không hiển thị thông báo khi nhập Tên ĐN < 30 ký tự có trong CSDL, không nhập Mật khẩu ");
			}
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(7, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void signIn_TC008() throws Exception {
		try {
			test = extent.startTest("SignIn_TC008");
			LogIn_Action.testCase008();
			if (!LogIn_Page.message().isDisplayed()) {
				Log.info("Check display link thong tin tai khoan form SignIn ");
				test.log(LogStatus.PASS,
						"Đăng nhập không thành công khi tên tài khoản , mật khẩu = 30 ký tự có trong CSDL");
				LogIn_Page.test_pass(8);
			} else {
				test.log(LogStatus.FAIL,
						"Đăng nhập không thành công khi tên tài khoản , mật khẩu = 30 ký tự có trong CSDL");
				LogIn_Page.test_failed(8,
						"Đăng nhập không thành công khi tên tài khoản , mật khẩu = 30 ký tự có trong CSDL ");
			}
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(8, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void signIn_TC009() throws Exception {
		try {
			test = extent.startTest("SignIn_TC009");
			LogIn_Action.testCase009();
			if (!LogIn_Page.message().isDisplayed()) {
				Log.info("Check display link thong tin tai khoan form SignIn ");
				test.log(LogStatus.PASS,
						"Đăng nhập thành công khi tên tài khoản < 30 ký tự có trong CSDL , mật khẩu = 30 ký tự có trong CSDL");
				LogIn_Page.test_pass(9);
			} else {
				test.log(LogStatus.FAIL,
						"Đăng nhập không thành công khi tên tài khoản < 30 ký tự có trong CSDL , mật khẩu = 30 ký tự có trong CSDL");
				LogIn_Page.test_failed(9,
						"Đăng nhập không thành công khi tên tài khoản < 30 ký tự có trong CSDL , mật khẩu = 30 ký tự có trong CSDL");
			}
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(9, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void signIn_TC010() throws Exception {
		try {
			test = extent.startTest("SignIn_TC010");
			LogIn_Action.testCase010();
			if (!LogIn_Page.message().isDisplayed()) {
				Log.info("Check display link thong tin tai khoan form SignIn ");
				test.log(LogStatus.PASS,
						"Đăng nhập thành công khi tên tài khoản < 30 ký tự có trong CSDL , mật khẩu = 30 ký tự có trong CSDL");
				LogIn_Page.test_pass(10);
			} else {
				test.log(LogStatus.FAIL,
						"Đăng nhập không thành công khi tên tài khoản < 30 ký tự có trong CSDL , mật khẩu = 30 ký tự có trong CSDL");
				LogIn_Page.test_failed(10,
						"Đăng nhập không thành công khi tên tài khoản = 30 ký tự có trong CSDL , mật khẩu < 30 ký tự có trong CSDL");
			}
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(10, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	public void signIn_TC011() throws Exception {
		try {
			test = extent.startTest("SignIn_TC011");
			LogIn_Action.testCase011();
			Thread.sleep(5000);
			if (LogIn_Page.link_thongTinTK().isDisplayed()) {
				Log.info("Check display link thong tin tai khoan form SignIn ");
				test.log(LogStatus.PASS, "Đăng nhập thành công khi tên tài khoản, mật khấu < 30 ký tự có trong CSDL ");

				LogIn_Page.test_pass(11);
			} else {
				test.log(LogStatus.FAIL,
						"Đăng nhập không thành công khi tên tài khoản, mật khấu < 30 ký tự có trong CSDL ");
				LogIn_Page.test_failed(11,
						"Đăng nhập không thành công khi tên tài khoản, mật khấu < 30 ký tự có trong CSDL ");
			}
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(11, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 12)
	public void signIn_TC012() throws Exception {
		try {
			test = extent.startTest("SignIn_TC012");
			if (LogIn_Page.link_dangKy().isDisplayed()) {
				LogIn_Page.link_dangKy().click();
				Log.info("Click Link Dang Ky");
				String titleDangKy = driver.getTitle();
				Log.info("Get title Dang ky");
				if (titleDangKy.equals("dangky")) {
					test.log(LogStatus.PASS, "Chuyển sang giao diên đăng ký");
					LogIn_Page.test_pass(12);
					Log.info("Check successfull link Dang ky");
				} else {
					test.log(LogStatus.FAIL, "Không chuyển sang giao diên đăng ký");
					LogIn_Page.test_failed(12, "Không chuyển sang giao diên đăng ký");
					Log.error("Check not successfull link Dang ky");
				}
			}
			extent.endTest(test);
			extent.flush();
		} catch (Exception e) {
			LogIn_Page.test_failed(12, "Error exception");
			e.printStackTrace();
		}
	}

	@Test(priority = 13)
	public void signIn_TC013() throws Exception {
		try {
			test = extent.startTest("SignIn_TC013");
			if (LogIn_Page.link_foundPass().isDisplayed()) {
				LogIn_Page.link_foundPass().click();
				Log.info("Click Link quen mat khau");
				String titleTimPass = driver.getTitle();
				Log.info("Get title quyen mat khau");
				if (titleTimPass.equals("timmatkhau")) {
					test.log(LogStatus.PASS, "Chuyển sang giao diên quên mật khẩu");
					LogIn_Page.test_pass(13);
					Log.info("Check successfull link quen pass");

				} else {
					test.log(LogStatus.FAIL, "Không chuyển sang giao diên quên mật khẩu");
					LogIn_Page.test_failed(13, "Không chuyển sang giao diên quên mật khẩu");
					Log.error("Check not successfull link quen pass");
				}
			}
			extent.endTest(test);
			extent.flush();
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
