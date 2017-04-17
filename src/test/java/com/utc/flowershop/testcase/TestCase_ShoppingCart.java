package com.utc.flowershop.testcase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentTestInterruptedException;
import com.relevantcodes.extentreports.LogStatus;
import com.utc.flowershop.appmodules.ShoppingCart_Action;

import com.utc.flowershop.pageobject.ShoppingCart_Page;
import com.utc.flowershop.pageobject.TestBase;
import com.utc.flowershop.utility.ConnectDatatabase;
import com.utc.flowershop.utility.Constant;
import com.utc.flowershop.utility.ExcelUtils;
import com.utc.flowershop.utility.Log;
import com.utc.flowershop.utility.Utility;

public class TestCase_ShoppingCart {
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest test;
	public ExtentTestInterruptedException testexception;

	@BeforeSuite
	public void BeforeSuite() {
		String workingDir = System.getProperty("C:/Users/NguyenHuong/git/Selenium_FlowerShop/src/test/resources");
		extent = new ExtentReports("C:/Users/NguyenHuong/git/Selenium_FlowerShop/Reports/TestReports_ShoppingCart.html",
				true);
		extent.loadConfig(new File(workingDir + "/extent-config.xml"));
		extent.addSystemInfo("Environment", "QA");
	}

	@BeforeMethod
	public void beforeMethod() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Shop Carts");
		ExcelUtils.setExcelFile(Constant.pathTestData + Constant.fileTestData, "ShoppingCart");
		Log.info("Excel sheet opened");
		driver = Utility.init();
		Log.info("sucess");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Implicit wait applied on the driver for 10 seconds");
		driver.manage().window().maximize();
		Log.info("Browser full screen");
		driver.get(Constant.url);
		Log.info("Web application launched successfully");
		new TestBase(driver);

	}

//	@Test(priority = 1)
//	public void shopCarts_TC001() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC001");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase001();
//			String message = ShoppingCart_Page.messNotSignIn().getText();
//			if (message.equals("Bạn Phải Là Thành Viên Mới Được Sử Dụng Chức Năng Mua Hàng")
//					&& ShoppingCart_Page.linkDangKyTK().isDisplayed()) {
//				test.log(LogStatus.PASS, "Hien thi thong bao khi click dat mua vào mot san pham tu trang chu ma ");
//				ShoppingCart_Page.test_pass(1);
//			} else {
//				test.log(LogStatus.FAIL,
//						"Khong hien thi thong bao khi click dat mua vào mot san pham tu trang chu ma chua dang nhap");
//				ShoppingCart_Page.test_failed(1,
//						"Không hiển thị thông báo khi Click Đặt mua vào một sản phẩm từ Trang chủ khi chưa đăng nhập ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(1, "Error Exception");
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test(priority = 2)
//	public void shopCarts_TC002() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC002");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase002();
//			String message = ShoppingCart_Page.messNotSignIn().getText();
//			if (message.equals("Bạn Phải Là Thành Viên Mới Được Sử Dụng Chức Năng Mua Hàng")
//					&& ShoppingCart_Page.linkDangKyTK().isDisplayed()) {
//				test.log(LogStatus.PASS,
//						"Hien thi thong bao khi click dat mua vào mot san pham tu danh sach san pham ma chua dang nhap");
//				ShoppingCart_Page.test_pass(2);
//			} else {
//				test.log(LogStatus.FAIL,
//						"Khong hien thi thong bao khi click dat mua vào mot san pham tu danh sach san pham ma chua dang nhap");
//				ShoppingCart_Page.test_failed(2, "Lỗi thông báo khi đặt mua không thành công");
//			}
//
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(2, "Error Exception");
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test(priority = 3)
//	public void shopCarts_TC003() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC003");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase003();
//			String message = ShoppingCart_Page.messNotSignIn().getText();
//			if (message.equals("Bạn Phải Là Thành Viên Mới Được Sử Dụng Chức Năng Mua Hàng")
//					&& ShoppingCart_Page.linkDangKyTK().isDisplayed()) {
//				test.log(LogStatus.PASS,
//						"Hien thi thong bao khi click dat mua vào mot san pham tu loai hoa trong danh muc ma chua dang nhap");
//				ShoppingCart_Page.test_pass(3);
//			} else {
//				test.log(LogStatus.FAIL,
//						"Khong hien thi thong bao khi click dat mua vào mot san pham tu loai hoa trong danh muc ma chua dang nhap");
//				ShoppingCart_Page.test_failed(3, "Lỗi thông báo khi đặt mua không thành công");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(3, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 4)
//	public void shopCarts_TC004() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC004");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase004();
//			String message = ShoppingCart_Page.messNotSignIn().getText();
//			if (message.equals("Bạn Phải Là Thành Viên Mới Được Sử Dụng Chức Năng Mua Hàng")
//					&& ShoppingCart_Page.linkDangKyTK().isDisplayed()) {
//				test.log(LogStatus.PASS,
//						"Hien thi thong bao khi click dat mua vào mot san pham tu loai gia trong muc gia sp ma chua dang nhap");
//				ShoppingCart_Page.test_pass(4);
//			} else {
//				test.log(LogStatus.FAIL,
//						"Khong hien thi thong bao khi click dat mua vào mot san pham tu loai gia trong muc gia sp ma chua dang nhap");
//				ShoppingCart_Page.test_failed(4, "Lỗi thông báo khi đặt mua không thành công");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(4, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 5)
//	public void shopCarts_TC005() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC005");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase005();
//			test.log(LogStatus.PASS, "Dat mua thanh cong vao mot san pham tu trang chu khi da dang nhap");
//			ShoppingCart_Page.test_pass(5);
//		} catch (Exception e) {
//			test.log(LogStatus.FAIL, "Dat mua khong thanh cong vao mot san pham tu trang chu khi da dang nhap");
//			ShoppingCart_Page.test_failed(5, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 6)
//	public void shopCarts_TC006() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC006");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase006();
//			test.log(LogStatus.PASS, "Dat mua thanh cong vao mot san pham tu danh sach san pham khi da dang nhap ");
//			ShoppingCart_Page.test_pass(6);
//		} catch (Exception e) {
//			test.log(LogStatus.FAIL,
//					"Dat mua khong thanh cong vao mot san pham tu danh sach san pham khi da dang nhap");
//			ShoppingCart_Page.test_failed(6, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 7)
//	public void shopCarts_TC007() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC007");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase007();
//			test.log(LogStatus.PASS,
//					"Dat mua thanh cong vao mot san pham tu mot loai hoa trong danh muckhi da dang nhap");
//			ShoppingCart_Page.test_pass(7);
//		} catch (Exception e) {
//			test.log(LogStatus.FAIL,
//					"Dat mua khong thanh cong vao mot san pham tu mot loai hoa trong danh muc khi da dang nhap");
//			ShoppingCart_Page.test_failed(7, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 8)
//	public void shopCarts_TC008() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC008");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase008();
//			test.log(LogStatus.PASS,
//					"Dat mua thanh cong vao mot san pham tu mot loai gia trong gia san pham khi da dang nhap ");
//			ShoppingCart_Page.test_pass(8);
//		} catch (Exception e) {
//			test.log(LogStatus.FAIL,
//					"Dat mua khong thanh cong vao mot san pham tu mot loai gia trong gia san pham khi da dang nhap");
//			ShoppingCart_Page.test_failed(8, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 9)
//	public void shopCarts_TC009() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC009");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase009();
//			String sluong = ExcelUtils.getCellData(9, 2);
//			Log.info("sluong" + sluong);
//			ShoppingCart_Page.link_CapNhat().click();
//			if (sluong.equals(ShoppingCart_Action.getSoLuong())) {
//				test.log(LogStatus.PASS, "Hien thi thong bao khi nhap so luong la so thuc ");
//				ShoppingCart_Page.test_pass(9);
//			} else {
//				test.log(LogStatus.FAIL, "Khong Hien thi thong bao khi nhap so luong la so thuc");
//				ShoppingCart_Page.test_failed(9, "Khi nhap so luong la so thuc khong thong bao loi");
//			}
//
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(9, "Error Exception");
//			e.printStackTrace();
//		}
//	}

	@Test(priority = 10)
	public void shopCarts_TC010() throws Exception {
		try {
			test = extent.startTest("ShoppingCart_TC010");
			test.assignAuthor("HuongNguyen");
			test.assignCategory("Environment", "QA");
			ShoppingCart_Action.testCase010();
			String sluong = ExcelUtils.getCellData(10, 2);
			ShoppingCart_Page.link_CapNhat().click();
			if (sluong.equals(ShoppingCart_Action.getSoLuong())) {
				test.log(LogStatus.PASS, "Hien thi thong bao khi nhap so luong la chu , ky tu dac biet");
				ShoppingCart_Page.test_pass(10);
			} else {
				test.log(LogStatus.FAIL, "Khong hien thi thong bao khi nhap sao luong la chu , ky tu dac biet");
				ShoppingCart_Page.test_failed(10, "Khi nhap so luong la chu khong thong bao loi");
			}

		} catch (Exception e) {
			ShoppingCart_Page.test_failed(10, "Error Exception");
			e.printStackTrace();
		}
	}

//	@Test(priority = 11)
//	public void shopCarts_TC011() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC011");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase011();
//			String sluong = ExcelUtils.getCellData(11, 2);
//			ShoppingCart_Page.link_CapNhat().click();
//			if (sluong.equals(ShoppingCart_Action.getSoLuong())) {
//				test.log(LogStatus.PASS, "Hien thi thong bao khi de trong so luong ");
//				ShoppingCart_Page.test_pass(11);
//			} else {
//				test.log(LogStatus.FAIL, "Khong Hien thi thong bao khi de trong so luong");
//				ShoppingCart_Page.test_failed(11, "Để trống số lượng khong thong bao loi");
//			}
//
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(11, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 12)
//	public void shopCarts_TC012() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC012");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase012();
//			test.log(LogStatus.PASS, "Mua hang thanh cong khi nhap so luong la so nguyen");
//			ShoppingCart_Page.test_pass(12);
//		} catch (Exception e) {
//			test.log(LogStatus.FAIL, "Mua hang khong thanh cong khi nhap so luong la so nguyen");
//			ShoppingCart_Page.test_failed(12, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 13)
//	public void shopCarts_TC013() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC013");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase013();
//			String soluong = ExcelUtils.getCellData(13, 2);
//			if (soluong.equals(ShoppingCart_Action.getSoLuong())) {
//				test.log(LogStatus.PASS, "Mua hang thanh cong khi nhap so luong la so nguyen co ba chua so tro len ");
//				ShoppingCart_Page.test_pass(13);
//			} else {
//				test.log(LogStatus.FAIL, "Mua hang thanh cong khi nhap so luong la so nguyen co ba chu so tro len");
//				ShoppingCart_Page.test_failed(13, "Nhập số lượng 3 chữ số cập nhật không thành công");
//			}
//
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(13, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 14)
//	public void shopCarts_TC014() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC014");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase014();
//			WebElement element = driver.findElement(By.xpath(
//					"html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/form/table/tbody"));
//			List<WebElement> rows = element.findElements(By.tagName("tr"));
//			String chuoi = rows.get(rows.size() - 2).getText();
//			if (ShoppingCart_Action.layTongTien(chuoi) == 0) {
//				test.log(LogStatus.PASS, "Kiem tra link xoa thanh cong");
//				ShoppingCart_Page.test_pass(14);
//			} else {
//				test.log(LogStatus.FAIL, "Kiem tra link xoa khong thanh cong");
//				ShoppingCart_Page.test_failed(14, "Xóa không thành công ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(14, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 15)
//	public void shopCarts_TC015() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC015");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase015();
//			String title = driver.getTitle();
//			if (title.equals("dathang")) {
//				ShoppingCart_Page.link_Them().click();
//				Log.info("Click them");
//				String title2 = driver.getTitle();
//				if (title2.equals("sanpham")) {
//					test.log(LogStatus.PASS, "Kiem tra link them hang thanh cong");
//					ShoppingCart_Page.test_pass(15);
//				} else {
//					test.log(LogStatus.FAIL, "Kiem tra link them hang khong thanh cong");
//					ShoppingCart_Page.test_failed(15, "Không chuyển sang giao diện sản phẩm khi click thêm sp ");
//				}
//			} else {
//				ShoppingCart_Page.test_failed(15, "Không chuyển sang giao diện giỏ hàng khi click ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(15, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 16)
//	public void shopCarts_TC016() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC016");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase016();
//			test.log(LogStatus.PASS, "Kiem tra link cap nhat hang thanh cong");
//			ShoppingCart_Page.test_pass(16);
//
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(16, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 17)
//	public void shopCarts_TC017() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC017");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase017();
//			if (!ShoppingCart_Page.form_TTNguoiTT().isDisplayed() && ShoppingCart_Page.form_GiaoHang().isDisplayed()) {
//				test.log(LogStatus.PASS, "Trong gio hang khong co san pham van click duoc vao thanh toan");
//				ShoppingCart_Page.test_pass(17);
//				Log.info("Check gio hang");
//			} else {
//				test.log(LogStatus.FAIL, "Trong gio hang khong co san pham van click duoc vao thanh toan");
//				Log.error("failed gio hang");
//				ShoppingCart_Page.test_failed(17, "Trong giỏ hàng không có sp vẫn click được vào thanh toan ");
//			}
//
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(17, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 18)
//	public void shopCarts_TC018() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC018");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase018();
//			String hoTen = ShoppingCart_Page.check_TTNguoiTT(2).getText();
//			Log.info("Ho ten :" + hoTen);
//			String email = ShoppingCart_Page.check_TTNguoiTT(3).getText();
//			Log.info("Email :" + email);
//			int sdt = Integer.parseInt(ShoppingCart_Page.check_TTNguoiTT(4).getText());
//			Log.info("SDT :" + sdt);
//			String diaChi = ShoppingCart_Page.check_TTNguoiTT(5).getText();
//			Log.info("DiaChi :" + diaChi);
//			if (ShoppingCart_Page.form_TTNguoiTT().isDisplayed() && ShoppingCart_Page.form_GiaoHang().isDisplayed()) {
//				ConnectDatatabase.connectToDB();
//				ConnectDatatabase.read_TTNguoiGiaoHang(hoTen, email, sdt, diaChi);
//				Log.info("Check connect");
//				test.log(LogStatus.PASS, "Click link thanh toan thanh cong");
//				ShoppingCart_Page.test_pass(18);
//			} else {
//				test.log(LogStatus.FAIL, "Click link thanh toan khong thanh cong");
//				ShoppingCart_Page.test_failed(18, "Form thanh toán không tìm thấy ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(18, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 19)
//	public void shopCarts_TC019() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC019");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase019();
//			String mess = ShoppingCart_Page.messThanhToan_ngay().getText();
//			if (mess.equals("vui lòng nhập ngày giao hàng!")) {
//				test.log(LogStatus.PASS, "De trong ngay giao hang thong bao loi ");
//				ShoppingCart_Page.test_pass(19);
//			} else {
//				test.log(LogStatus.FAIL, "De trong ngay giao hang khong thong bao loi");
//				ShoppingCart_Page.test_failed(19, "Để trống ngày giao hang không báo lỗi ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(19, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 20)
//	public void shopCarts_TC020() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC020");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase020();
//			String mess = ShoppingCart_Page.mess_TToan_Pass().getText();
//			if (!mess.equals("Bạn Đã Đặt Hàng Thành Công !")) {
//				test.log(LogStatus.PASS, "Nhap ngay giao hang la chu thong bao loi ");
//				ShoppingCart_Page.test_pass(20);
//			} else {
//				test.log(LogStatus.FAIL, "Nhap ngay giao hang la chu khong thong bao loi");
//				ShoppingCart_Page.test_failed(20, "Nhập ngày giao hàng là chữ không báo lỗi ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(20, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 21)
//	public void shopCarts_TC021() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC022");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase021();
//			String mess = ShoppingCart_Page.mess_TToan_Pass().getText();
//			if (!mess.equals("Bạn Đã Đặt Hàng Thành Công !")) {
//				test.log(LogStatus.PASS, "Nhap ngay giao hang khong dung dinh dang ngay khong thong bao loi ");
//				ShoppingCart_Page.test_pass(21);
//			} else {
//				test.log(LogStatus.FAIL, "Nhap ngay giao hang khong dung dinh dang ngay khong thong bao loi");
//				ShoppingCart_Page.test_failed(21, "Nhập ngày giao hàng là số không đúng định dạng không báo lỗi ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(21, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 22)
//	public void shopCarts_TC022() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC022");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase022();
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			String ngay = ExcelUtils.getCellData(22, 3);
//			Date ngay_excel = sdf.parse(ngay);
//			Date date = new Date();
//			if (ngay_excel.before(date)) {
//				ShoppingCart_Page.buttonThanhToan().click();
//				if (!ShoppingCart_Page.mess_TToan_Pass().isDisplayed()) {
//					test.log(LogStatus.PASS, "Nhap ngay giao hang nho hon ngay hien tai khong thong bao loi ");
//					ShoppingCart_Page.test_pass(22);
//				} else {
//					test.log(LogStatus.FAIL, "Nhap ngay giao hang nho hon ngay hien tai khong thong bao loi");
//					ShoppingCart_Page.test_failed(22, "Nhập ngày nhỏ hơn ngày hiện tại vẫn thanh toán thành công");
//				}
//			} else {
//				ShoppingCart_Page.test_failed(22, "Nhập ngày vào textbox ko nhỏ hơn ngày hiện tại");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(22, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 23)
//	public void shopCarts_TC023() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC023");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase023();
//			if (!ShoppingCart_Page.mess_TToan_Pass().isDisplayed()) {
//				test.log(LogStatus.PASS, "Hien thi thong bao loi khi khong nhap dia chi giao hang");
//				ShoppingCart_Page.test_pass(23);
//				Log.info("check");
//			} else {
//				test.log(LogStatus.FAIL, "Khong thong bao loi khi khong nhap dia chi giao hang");
//				ShoppingCart_Page.test_failed(23, "Không nhập địa chỉ giao hàng vẫn click thanh toán pass");
//			}
//
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(23, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 24)
//	public void shopCarts_TC024() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC024");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase024();
//			if (!ShoppingCart_Page.mess_TToan_Pass().isDisplayed()) {
//				test.log(LogStatus.PASS, "Hien thi thong bao loi khi nhap dia chi giao hang > 300 ky tu");
//				ShoppingCart_Page.test_pass(24);
//				Log.info("check");
//			} else {
//				test.log(LogStatus.FAIL, "Khong thong bao loi khi nhap dia chi giao hang > 300 ky tu");
//				ShoppingCart_Page.test_failed(24, "nhập địa chỉ giao hàng > 300 ký tự vẫn click thanh toán pass");
//			}
//
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(24, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 25)
//	public void shopCarts_TC025() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC025");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase025();
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			String ngay = ExcelUtils.getCellData(25, 3);
//			Date ngay_excel = sdf.parse(ngay);
//			Date date = new Date();
//			if (sdf.format(ngay_excel).equals(sdf.format(date))) {
//				ShoppingCart_Page.buttonThanhToan().click();
//				if (ShoppingCart_Page.mess_TToan_Pass().isDisplayed()) {
//					test.log(LogStatus.PASS, "Nhap ngay bang ngay hien tai,dia chi giao hang = 300 ky tu  click thanh toan  thanh cong");
//					ShoppingCart_Page.test_pass(25);
//				} else {
//					test.log(LogStatus.FAIL, "Nhap ngay bang ngay hien tai ,dia chi giao hang = 300 ky tu click thanh toan khong thanh cong");
//					ShoppingCart_Page.test_failed(25, "Nhập ngày bằng ngày hiện tại, dia chi giao hang = 300 ky tu click thanh toán không thành công");
//				}
//			} else {
//				ShoppingCart_Page.test_failed(25, "Nhập ngày vào textbox không bằng ngày hiện tại");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(25, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 26)
//	public void shopCarts_TC026() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC026");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase026();
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			String ngay = ExcelUtils.getCellData(26, 3);
//			Date ngay_excel = sdf.parse(ngay);
//			Date date = new Date();
//			if (ngay_excel.after(date)) {
//				ShoppingCart_Page.buttonThanhToan().click();
//				if (ShoppingCart_Page.mess_TToan_Pass().isDisplayed()) {
//					test.log(LogStatus.PASS, "Nhap ngay lon hon ngay hien tai ,dia chi giao hang = 300 ky tu click thanh toan thanh cong ");
//					ShoppingCart_Page.test_pass(26);
//				} else {
//					test.log(LogStatus.FAIL, "Nhap ngay lon hon ngay hien tai ,dia chi giao hang = 300 ky tu click thanh toan khong thanh cong");
//					ShoppingCart_Page.test_failed(26,
//							"Nhập ngày lớn hơn ngày hiện tại click thanh toán không thành công");
//				}
//			} else {
//				ShoppingCart_Page.test_failed(26, "Nhập ngày vào textbox không lớn hơn ngày hiện tại");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(26, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 27)
//	public void shopCarts_TC027() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC027");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase027();
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			String ngay = ExcelUtils.getCellData(27, 3);
//			Date ngay_excel = sdf.parse(ngay);
//			Date date = new Date();
//			if (sdf.format(ngay_excel).equals(sdf.format(date))) {
//				ShoppingCart_Page.buttonThanhToan().click();
//				if (ShoppingCart_Page.mess_TToan_Pass().isDisplayed()) {
//					test.log(LogStatus.PASS, "Nhap ngay bang ngay hien tai ,dia chi giao hang < 300 ky tu click thanh toan thanh cong");
//					ShoppingCart_Page.test_pass(27);
//				} else {
//					test.log(LogStatus.FAIL, "Nhap ngay bang ngay hien tai ,dia chi giao hang < 300 ky tu click thanh toan khong thanh cong");
//					ShoppingCart_Page.test_failed(27,
//							"Nhập ngày bằng ngày hiện tại, Địa chỉ < 300 ký tự click thanh toán không thành công");
//				}
//			} else {
//				ShoppingCart_Page.test_failed(27, "Nhập ngày vào textbox bằng lớn hơn ngày hiện tại");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(27, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 28)
//	public void shopCarts_TC028() throws Exception {
//		try {
//			test = extent.startTest("ShoppingCart_TC028");
//			test.assignAuthor("HuongNguyen");
//			test.assignCategory("Environment", "QA");
//			ShoppingCart_Action.testCase028();
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			String ngay = ExcelUtils.getCellData(28, 3);
//			Date ngay_excel = sdf.parse(ngay);
//			Date date = new Date();
//			if (ngay_excel.after(date)) {
//				ShoppingCart_Page.buttonThanhToan().click();
//				if (ShoppingCart_Page.mess_TToan_Pass().isDisplayed()) {
//					test.log(LogStatus.PASS, "Nhap ngay lon hon ngay hien tai ,dia chi giao hang < 300 ky tu click thanh toan thanh cong");
//					ShoppingCart_Page.test_pass(28);
//				} else {
//					test.log(LogStatus.FAIL, "Nhap ngay lon hon ngay hien tai ,dia chi giao hang < 300 ky tu click thanh toan khong thanh cong");
//					ShoppingCart_Page.test_failed(28,
//							"Nhập ngày lớn hơn ngày hiện tại , nơi giao hàng < 300 ký tự click thanh toán không thành công");
//				}
//			} else {
//				ShoppingCart_Page.test_failed(28, "Nhập ngày vào textbox không lớn hơn ngày hiện tại");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(28, "Error Exception");
//			e.printStackTrace();
//		}
//	}

	@AfterMethod
	public void afterMethod() {
		Log.endTestCase("Shop Carts");
		driver.quit();
		extent.endTest(test);
	}

	@AfterSuite
	public void AfterSuite() {
		extent.flush();
		extent.close();
	}

}
