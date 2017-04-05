package com.utc.flowershop.testcase;


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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
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

	@BeforeMethod
	public void beforeMethod() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Shop Carts");
		ExcelUtils.setExcelFile(Constant.pathTestData + Constant.fileTestData, "ShoppingCart");
		Log.info("Excel sheet opened");
		String browserName = ExcelUtils.getCellData(1, 6);
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

	// @Test(priority = 1)
	// public void shopCarts_TC001() throws Exception {
	// try {
	// ShoppingCart_Action.testCase001();
	// String message = ShoppingCart_Page.messNotSignIn().getText();
	// if(message.equals("Bạn Phải Là Thành Viên Mới Được Sử Dụng Chức Năng Mua
	// Hàng")&& ShoppingCart_Page.linkDangKyTK().isDisplayed()){
	// ShoppingCart_Page.test_pass(1);
	// }else{
	// ShoppingCart_Page.test_failed(1, "Lỗi thông báo khi đặt mua không thành
	// công");
	// }
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(1, "Error Exception");
	// e.printStackTrace();
	// }
	//
	// }
	// @Test(priority = 2)
	// public void shopCarts_TC002() throws Exception {
	// try {
	// ShoppingCart_Action.testCase002();
	// String message = ShoppingCart_Page.messNotSignIn().getText();
	// if(message.equals("Bạn Phải Là Thành Viên Mới Được Sử Dụng Chức Năng Mua
	// Hàng")&& ShoppingCart_Page.linkDangKyTK().isDisplayed()){
	// ShoppingCart_Page.test_pass(2);
	// }else{
	// ShoppingCart_Page.test_failed(2, "Lỗi thông báo khi đặt mua không thành
	// công");
	// }
	//
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(2, "Error Exception");
	// e.printStackTrace();
	// }
	//
	// }
	// @Test(priority = 3)
	// public void shopCarts_TC003() throws Exception {
	// try {
	// ShoppingCart_Action.testCase003();
	// String message = ShoppingCart_Page.messNotSignIn().getText();
	// if(message.equals("Bạn Phải Là Thành Viên Mới Được Sử Dụng Chức Năng Mua
	// Hàng")&& ShoppingCart_Page.linkDangKyTK().isDisplayed()){
	// ShoppingCart_Page.test_pass(3);
	// }else{
	// ShoppingCart_Page.test_failed(3, "Lỗi thông báo khi đặt mua không thành
	// công");
	// }
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(3, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 4)
	// public void shopCarts_TC004() throws Exception {
	// try {
	// ShoppingCart_Action.testCase004();
	// String message = ShoppingCart_Page.messNotSignIn().getText();
	// if(message.equals("Bạn Phải Là Thành Viên Mới Được Sử Dụng Chức Năng Mua
	// Hàng")&& ShoppingCart_Page.linkDangKyTK().isDisplayed()){
	// ShoppingCart_Page.test_pass(4);
	// }else{
	// ShoppingCart_Page.test_failed(4, "Lỗi thông báo khi đặt mua không thành
	// công");
	// }
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(4, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	//
	// @Test(priority = 5)
	// public void shopCarts_TC005() throws Exception {
	// try {
	// ShoppingCart_Action.testCase005();
	// ShoppingCart_Page.test_pass(5);
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(5, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 6)
	// public void shopCarts_TC006() throws Exception {
	// try {
	// ShoppingCart_Action.testCase006();
	// ShoppingCart_Page.test_pass(6);
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(6, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 7)
	// public void shopCarts_TC007() throws Exception {
	// try {
	// ShoppingCart_Action.testCase007();
	// ShoppingCart_Page.test_pass(7);
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(7, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 8)
	// public void shopCarts_TC008() throws Exception {
	// try {
	// ShoppingCart_Action.testCase008();
	// ShoppingCart_Page.test_pass(8);
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(8, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 9)
	// public void shopCarts_TC009() throws Exception {
	// try {
	// ShoppingCart_Action.testCase009();
	// String sluong = ExcelUtils.getCellData(9, 2);
	// Log.info("sluong" + sluong);
	// ShoppingCart_Page.link_CapNhat().click();
	// if(sluong.equals(ShoppingCart_Action.getSoLuong())){
	// ShoppingCart_Page.test_pass(9);
	// }else{
	// ShoppingCart_Page.test_failed(9, "Khi nhap so luong la so thuc khong
	// thong bao loi");
	// }
	//
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(9, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 10)
	// public void shopCarts_TC010() throws Exception {
	// try {
	// ShoppingCart_Action.testCase010();
	// String sluong = ExcelUtils.getCellData(10, 2);
	// ShoppingCart_Page.link_CapNhat().click();
	// if(sluong.equals(ShoppingCart_Action.getSoLuong())){
	// ShoppingCart_Page.test_pass(10);
	// }else{
	// ShoppingCart_Page.test_failed(10, "Khi nhap so luong la chu khong thong
	// bao loi");
	// }
	//
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(10, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 11)
	// public void shopCarts_TC011() throws Exception {
	// try {
	// ShoppingCart_Action.testCase011();
	// String sluong = ExcelUtils.getCellData(11, 2);
	// ShoppingCart_Page.link_CapNhat().click();
	// if(sluong.equals(ShoppingCart_Action.getSoLuong())){
	// ShoppingCart_Page.test_pass(11);
	// }else{
	// ShoppingCart_Page.test_failed(11, "Để trống số lượng khong thong bao
	// loi");
	// }
	//
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(11, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 12)
	// public void shopCarts_TC012() throws Exception {
	// try {
	// ShoppingCart_Action.testCase012();
	// ShoppingCart_Page.test_pass(12);
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(12, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 13)
	// public void shopCarts_TC013() throws Exception {
	// try {
	// ShoppingCart_Action.testCase013();
	// String soluong = ExcelUtils.getCellData(13, 2);
	// if (soluong.equals(ShoppingCart_Action.getSoLuong())) {
	// ShoppingCart_Page.test_pass(13);
	// } else {
	// ShoppingCart_Page.test_failed(13, "Nhập số lượng 3 chữ số cập nhật không
	// thành công");
	// }
	//
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(13, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 14)
	// public void shopCarts_TC014() throws Exception {
	// try {
	// ShoppingCart_Action.testCase014();
	// WebElement element = driver.findElement(
	// By.xpath("html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/form/table/tbody"));
	// List<WebElement> rows = element.findElements(By.tagName("tr"));
	// String chuoi = rows.get(rows.size() - 2).getText();
	// if(ShoppingCart_Action.layTongTien(chuoi)==0){
	// ShoppingCart_Page.test_pass(14);
	// }else{
	// ShoppingCart_Page.test_failed(14, "Xóa không thành công ");
	// }
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(14, "Error Exception");
	// e.printStackTrace();
	// }
	// }
	// @Test(priority = 15)
	// public void shopCarts_TC015() throws Exception {
	// try {
	// ShoppingCart_Action.testCase015();
	// String title = driver.getTitle();
	// if(title.equals("dathang")){
	// ShoppingCart_Page.link_Them().click();
	// Log.info("Click them");
	// String title2 = driver.getTitle();
	// if(title2.equals("sanpham")){
	// ShoppingCart_Page.test_pass(15);
	// }else{
	// ShoppingCart_Page.test_failed(15, "Không chuyển sang giao diện sản phẩm
	// khi click thêm sp ");
	// }
	// }else{
	// ShoppingCart_Page.test_failed(15, "Không chuyển sang giao diện giỏ hàng
	// khi click ");
	// }
	// } catch (Exception e) {
	// ShoppingCart_Page.test_failed(15, "Error Exception");
	// e.printStackTrace();
	// }
	// }
//	@Test(priority = 17)
//	public void shopCarts_TC017() throws Exception {
//		try {
//			ShoppingCart_Action.testCase017();
//			if (!ShoppingCart_Page.form_TTNguoiTT().isDisplayed() && ShoppingCart_Page.form_GiaoHang().isDisplayed()) {
//				ShoppingCart_Page.test_pass(17);
//				Log.info("Check gio hang");
//			} else {
//				Log.error("failed gio hang");
//				ShoppingCart_Page.test_failed(17, "Trong giỏ hàng không có sp vẫn click được vào thanh toan ");
//			}
//			
//			
//			
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(17, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//	@Test(priority = 18)
//	public void shopCarts_TC018() throws Exception {
//		try {
//			ShoppingCart_Action.testCase018();
//			String hoTen = ShoppingCart_Page.check_TTNguoiTT(2).getText();
//			Log.info("Ho ten :"+ hoTen);
//			String email = ShoppingCart_Page.check_TTNguoiTT(3).getText();
//			Log.info("Email :"+ email);
//			int sdt = Integer.parseInt(ShoppingCart_Page.check_TTNguoiTT(4).getText());
//			Log.info("SDT :"+ sdt);
//			String diaChi = ShoppingCart_Page.check_TTNguoiTT(5).getText();
//			Log.info("DiaChi :"+ diaChi);
//			if (ShoppingCart_Page.form_TTNguoiTT().isDisplayed() && ShoppingCart_Page.form_GiaoHang().isDisplayed()) {
//				ConnectDatatabase.connectToDB();
//				ConnectDatatabase.read_TTNguoiGiaoHang(hoTen, email, sdt, diaChi);
//				Log.info("Check connect");
//				ShoppingCart_Page.test_pass(18);
//			} else {
//				ShoppingCart_Page.test_failed(18, "Form thanh toán không tìm thấy ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(18, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//	@Test(priority = 19)
//	public void shopCarts_TC019() throws Exception {
//		try {
//			ShoppingCart_Action.testCase019();
//			String mess = ShoppingCart_Page.messThanhToan_ngay().getText();
//			if(mess.equals("vui lòng nhập ngày giao hàng!")){
//				ShoppingCart_Page.test_pass(19);
//			} else {
//				ShoppingCart_Page.test_failed(19, "Để trống ngày giao hang không báo lỗi ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(19, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//	@Test(priority = 20)
//	public void shopCarts_TC020() throws Exception {
//		try {
//			ShoppingCart_Action.testCase020();
//			String mess = ShoppingCart_Page.mess_TToan_Pass().getText();
//			if(!mess.equals("Bạn Đã Đặt Hàng Thành Công !")){
//				ShoppingCart_Page.test_pass(20);
//			} else {
//				ShoppingCart_Page.test_failed(20, "Nhập ngày giao hàng là chữ không báo lỗi ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(20, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//	@Test(priority = 21)
//	public void shopCarts_TC021() throws Exception {
//		try {
//			ShoppingCart_Action.testCase021();
//			String mess = ShoppingCart_Page.mess_TToan_Pass().getText();
//			if(!mess.equals("Bạn Đã Đặt Hàng Thành Công !")){
//				ShoppingCart_Page.test_pass(21);
//			} else {
//				ShoppingCart_Page.test_failed(21, "Nhập ngày giao hàng là số không đúng định dạng không báo lỗi ");
//			}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(21, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//	@Test(priority = 22)
//	public void shopCarts_TC022() throws Exception {
//		try {
//			ShoppingCart_Action.testCase022();
//			 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			 String ngay = ExcelUtils.getCellData(22, 3);
//			 Date ngay_excel = sdf.parse(ngay);
//		     Date date = new Date();
//			    if (ngay_excel.before(date)) {
//			        	ShoppingCart_Page.buttonThanhToan().click();
//			        	if(!ShoppingCart_Page.mess_TToan_Pass().isDisplayed()){
//			        		ShoppingCart_Page.test_pass(22);
//						} else {
//							ShoppingCart_Page.test_failed(22, "Nhập ngày nhỏ hơn ngày hiện tại vẫn thanh toán thành công");
//						}
//				} else {
//					ShoppingCart_Page.test_failed(22, "Nhập ngày vào textbox ko nhỏ hơn ngày hiện tại");
//				}
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(22, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//	@Test(priority = 23)
//	public void shopCarts_TC023() throws Exception {
//		try {
//			ShoppingCart_Action.testCase023();
//        	if(!ShoppingCart_Page.mess_TToan_Pass().isDisplayed()){
//        		ShoppingCart_Page.test_pass(23);
//        		Log.info("check");
//			} else {
//				ShoppingCart_Page.test_failed(23, "Không nhập địa chỉ giao hàng vẫn click thanh toán pass");
//			}
//	
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(23, "Error Exception");
//			e.printStackTrace();
//		}
//	}
//	@Test(priority = 24)
//	public void shopCarts_TC024() throws Exception {
//		try {
//			ShoppingCart_Action.testCase024();
//        	if(!ShoppingCart_Page.mess_TToan_Pass().isDisplayed()){
//        		ShoppingCart_Page.test_pass(24);
//        		Log.info("check");
//			} else {
//				ShoppingCart_Page.test_failed(24, "nhập địa chỉ giao hàng > 300 ký tự vẫn click thanh toán pass");
//			}
//	
//		} catch (Exception e) {
//			ShoppingCart_Page.test_failed(24, "Error Exception");
//			e.printStackTrace();
//		}
//	}
	@Test(priority = 25)
	public void shopCarts_TC025() throws Exception {
		try {
			ShoppingCart_Action.testCase025();
			 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			 String ngay = ExcelUtils.getCellData(25, 3);
			 Date ngay_excel = sdf.parse(ngay);
		     Date date = new Date();
			    if (sdf.format(ngay_excel).equals(sdf.format(date))) {
			        	ShoppingCart_Page.buttonThanhToan().click();
			        	if(ShoppingCart_Page.mess_TToan_Pass().isDisplayed()){
			        		ShoppingCart_Page.test_pass(25);
						} else {
							ShoppingCart_Page.test_failed(25, "Nhập ngày bằng ngày hiện tại click thanh toán không thành công");
						}
				} else {
					ShoppingCart_Page.test_failed(25, "Nhập ngày vào textbox không bằng ngày hiện tại");
				}
		} catch (Exception e) {
			ShoppingCart_Page.test_failed(25, "Error Exception");
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void afterMethod() {
		Log.endTestCase("Shop Carts");
		driver.quit();

	}
}
