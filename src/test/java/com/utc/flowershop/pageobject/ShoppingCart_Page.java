package com.utc.flowershop.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utc.flowershop.utility.ExcelUtils;
import com.utc.flowershop.utility.Log;
import com.utc.flowershop.utility.Utility;

public class ShoppingCart_Page extends TestBase {
	private static WebElement element = null;
	
	public ShoppingCart_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement messThanhToan_ngay() throws Exception {
		try {
			element = driver.findElement(By.xpath(".//*[@id='baoloi']"));
			Log.info(" Message ngay giao hang is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Message ngay giao hang is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static void test_pass(int row) throws Exception {
		ExcelUtils.setCellData("Pass", row, 5);
		ExcelUtils.setCellData("", row, 7);
		Log.info("Test Case " + row + " Passed because of Verification");
	}

	public static void test_failed(int row, String message) throws Exception {
		Utility.takeScreenshot(driver, ExcelUtils.getCellData(row, 0));
		ExcelUtils.setCellData("Failed ", row, 5);
		ExcelUtils.setCellData("Failed : " + message, row, 7);
		Log.error("Test Case " + row + " Failed because of Verification" + message);
	}
	
	public static WebElement mess_TToan_Pass() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/center/span/b"));
			Log.info(" Link thanh toan pass is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Link thanh toan pass is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_NgayGiaoHang() throws Exception {
		try {
			element = driver.findElement(By.id("ngaygiao"));
			Log.info(" TextBox ngay giao hang is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" TextBox ngay giao hang is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_DiaChi() throws Exception {
		try {
			element = driver.findElement(By.name("diachigiao"));
			Log.info(" TextBox Dia Chi Giao Hang is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" TextBox Dia Chi Giao Hang is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static WebElement buttonThanhToan() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div[3]/form/table/tbody/tr[4]/td/input[4]"));
			Log.info(" Button Thanh Toan is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Button Thanh Toan is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static WebElement check_TTNguoiTT(int row) throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div[2]/table/tbody/tr["+row+"]/td[2]"));
			Log.info(" Check Thong tin nguoi Thanh Toan table "+row+" is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Form Thong tin nguoi Thanh Toan table "+row+" is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement form_TTNguoiTT() throws Exception {
		try {
			element = driver.findElement(By.name("thanhgio"));
			Log.info(" Form Thong tin nguoi Thanh Toan is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Form Thong tin nguoi Thanh Toan is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static WebElement form_GiaoHang() throws Exception {
		try {
			element = driver.findElement(By.name("giaohang"));
			Log.info(" Form giao hang is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Form giao hang is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	public static WebElement link_ThanhToan() throws Exception {
		try {
			element = driver.findElement(By.linkText("Thanh Toán"));
			Log.info(" Link Thanh Toan is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Link Thanh Toan is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static WebElement link_GioHang() throws Exception {
		try {
			element = driver.findElement(By.linkText("Giỏ Hàng"));
			Log.info(" Link Gio hang is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Link Gio Hang is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static WebElement link_Them() throws Exception {
		try {
			element = driver.findElement(By.linkText("Thêm Sản Phẩm Vào Giỏ"));
			Log.info(" Link Them is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Link Them is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static WebElement link_Xoa_0() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/form/table/tbody/tr[2]/td[6]/a"));
			Log.info(" Link Xoa is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Link Xoa is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static WebElement link_CapNhat() throws Exception {
		try {
			element = driver.findElement(By.linkText("Cập Nhật Giỏ Hàng"));
			Log.info(" Link Cap nhat gio hang is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Link Cap nhat gio hang is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	

	public static WebElement txtSoLuong_0() throws Exception {
		try {
			element = driver.findElement(By.name("txtsl0"));
			Log.info(" Textbox so luong is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Textbox so luong is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
	
	public static WebElement linkĐatMua_Gia_NgayQuanTrong() throws Exception {
		try {
			element = driver.findElement(By.xpath(
					"html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/table/tbody/tr[2]/td/a[2]"));
			Log.info(" Gia Hoa Ngay Quan Trong  link is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Gia Hoa Ngay Quan Tron link is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}

	public static WebElement linkGia_Duoi100000đ() throws Exception {
		try {
			element = driver.findElement(By.linkText("Dưới 100.000đ"));
			Log.info(" Gia Duoi 100000đ  link is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Gia duoi 100000đ link is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}

	public static WebElement linkDatMua_JustForYou() throws Exception {
		try {
			element = driver.findElement(By.xpath(
					"html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/table/tbody/tr[2]/td/a[2]"));
			Log.info(" Dat mua  link is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Dat mua link is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}

	public static WebElement linkHoaTinhYeu() throws Exception {
		try {
			element = driver.findElement(By.linkText("Hoa Tình Yêu"));
			Log.info(" Hoa Tinh yeu link is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Hoa Tinh Yeu link is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}

	public static WebElement linkSanPham() throws Exception {
		try {
			element = driver.findElement(By.linkText("Sản Phẩm"));
			Log.info(" San Pham link is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" San Pham link is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}

	public static WebElement linkDatMua_NgayQuanTrong_SP() throws Exception {
		try {
			element = driver.findElement(By.xpath(
					"html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/table/tbody/tr[2]/td/a[2]"));
			Log.info(" Link Dat Mua Hoa Ngay quan trong 001 is found on the San Pham Moi");
		} catch (Exception e) {
			Log.error(" Link Dat Mua Hoa Ngay quan trong 001 is not found on the San Pham Moi");
			throw (e);
		}
		return element;
	}

	public static WebElement linkDatMua_NgayQuanTrong_TC() throws Exception {
		try {
			element = driver.findElement(By.xpath(
					"html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/table/tbody/tr[2]/td/a[2]"));
			Log.info(" Link Dat Mua Hoa Ngay Quan Trong is found on the San Pham Moi");
		} catch (Exception e) {
			Log.error(" Link Dat Mua Hoa Ngay Quan Trong is not found on the San Pham Moi");
			throw (e);
		}
		return element;
	}

	public static WebElement messNotSignIn() throws Exception {
		try {
			element = driver.findElement(
					By.xpath("html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr/td/center/span"));
			Log.info(" Message khi khong dang nhap is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Message khi khong dang nhap is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}

	public static WebElement linkDangKyTK() throws Exception {
		try {
			element = driver.findElement(By.linkText("Bấm Vào Đây Để Đăng Ký Tài Khoản"));
			Log.info(" Register link is found on the Flower Shop");
		} catch (Exception e) {
			Log.error(" Register link is not found on the Flower Shop");
			throw (e);
		}
		return element;
	}
}
