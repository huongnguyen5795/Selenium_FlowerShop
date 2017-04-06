package com.utc.flowershop.appmodules;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utc.flowershop.pageobject.LogIn_Page;
import com.utc.flowershop.pageobject.ShoppingCart_Page;
import com.utc.flowershop.pageobject.TestBase;
import com.utc.flowershop.utility.ExcelUtils;
import com.utc.flowershop.utility.Log;

public class ShoppingCart_Action extends TestBase {
	private static WebElement element = null;

	private static String tenHoa;
	private static int giaHoa;

	public ShoppingCart_Action(WebDriver driver) {
		super(driver);
	}

	public static void testCase001() {
		try {
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
		} catch (Exception e) {
			Log.error("Test Case 001 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase002() {
		try {
			ShoppingCart_Page.linkSanPham().click();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_SP().click();
		} catch (Exception e) {
			Log.error("Test Case 002 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase003() {
		try {
			ShoppingCart_Page.linkHoaTinhYeu().click();
			ShoppingCart_Page.linkDatMua_JustForYou().click();
		} catch (Exception e) {
			Log.error("Test Case 003 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase004() {
		try {
			ShoppingCart_Page.linkGia_Duoi100000đ().click();
			ShoppingCart_Page.linkĐatMua_Gia_NgayQuanTrong().click();
		} catch (Exception e) {
			Log.error("Test Case 004 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void logIn() {
		try {
			LogIn_Page.txt_UserName().sendKeys("HuongNguyen");
			LogIn_Page.txt_Password().sendKeys("05071995");
			LogIn_Page.btn_LogIn().click();
			Log.info("LogIn successful");
		} catch (Exception e) {
			Log.error("Error SignIn");
			e.printStackTrace();
		}
	}

	public static void testCase005() {
		try {
			logIn();
			tenHoa = layRaTenHoa(layNgayQuanTrong_Tc());
			giaHoa = layRaGiaHoa(layNgayQuanTrong_Tc());
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			getTable_ShoppingCart(1,5);
		} catch (Exception e) {
			Log.error("Test Case 005 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase006() {
		try {
			logIn();
			ShoppingCart_Page.linkSanPham().click();
			tenHoa = layRaTenHoa(layNgayQuanTrong_SP());
			giaHoa = layRaGiaHoa(layNgayQuanTrong_SP());
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_SP().click();
			getTable_ShoppingCart(1,6);
		} catch (Exception e) {
			Log.error("Test Case 006 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase007() {
		try {
			logIn();
			ShoppingCart_Page.linkHoaTinhYeu().click();
			tenHoa = layRaTenHoa(layJustForYou_Hoa());
			giaHoa = layRaGiaHoa(layJustForYou_Hoa());
			ShoppingCart_Page.linkDatMua_JustForYou().click();
			getTable_ShoppingCart(1,7);
		} catch (Exception e) {
			Log.error("Test Case 007 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase008() {
		try {
			logIn();
			ShoppingCart_Page.linkGia_Duoi100000đ().click();
			tenHoa = layRaTenHoa(layNgayQuanTrong_Gia());
			giaHoa = layRaGiaHoa(layNgayQuanTrong_Gia());
			ShoppingCart_Page.linkĐatMua_Gia_NgayQuanTrong().click();
			getTable_ShoppingCart(1,8);
		} catch (Exception e) {
			Log.error("Test Case 008 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase009() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.txtSoLuong_0().clear();
			ShoppingCart_Page.txtSoLuong_0().sendKeys(ExcelUtils.getCellData(9, 2));
		} catch (Exception e) {
			Log.error("Test Case 009 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase010() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.txtSoLuong_0().clear();
			ShoppingCart_Page.txtSoLuong_0().sendKeys(ExcelUtils.getCellData(10, 2));
		} catch (Exception e) {
			Log.error("Test Case 010 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase011() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.txtSoLuong_0().clear();
			ShoppingCart_Page.txtSoLuong_0().sendKeys(ExcelUtils.getCellData(11, 2));
		} catch (Exception e) {
			Log.error("Test Case 011 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase012() {
		try {
			logIn();
			tenHoa = layRaTenHoa(layNgayQuanTrong_Tc());
			giaHoa = layRaGiaHoa(layNgayQuanTrong_Tc());
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.txtSoLuong_0().clear();
			ShoppingCart_Page.txtSoLuong_0().sendKeys(ExcelUtils.getCellData(12, 2));
			ShoppingCart_Page.link_CapNhat().click();
			int soluong = Integer.parseInt(ExcelUtils.getCellData(12, 2));
			getTable_ShoppingCart(soluong,12);

		} catch (Exception e) {
			Log.error("Test Case 012 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase013() {
		try {
			logIn();
			tenHoa = layRaTenHoa(layNgayQuanTrong_Tc());
			giaHoa = layRaGiaHoa(layNgayQuanTrong_Tc());
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.txtSoLuong_0().clear();
			ShoppingCart_Page.txtSoLuong_0().sendKeys(ExcelUtils.getCellData(13, 2));
			ShoppingCart_Page.link_CapNhat().click();
			int soluong = Integer.parseInt(ExcelUtils.getCellData(13, 2));
			getTable_ShoppingCart(soluong,13);

		} catch (Exception e) {
			Log.error("Test Case 013 Failed because of Verification");
			e.printStackTrace();
		}
	}

	public static void testCase014() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_Xoa_0().click();

		} catch (Exception e) {
			Log.error("Test Case 014 Failed because of Verification");
			e.printStackTrace();
		}
	}
	
	public static void testCase015() {
		try {
			logIn();
			ShoppingCart_Page.link_GioHang().click();

		} catch (Exception e) {
			Log.error("Test Case 015 Failed because of Verification");
			e.printStackTrace();
		}
	}
	public static void testCase016() {
		try {
			logIn();
			ShoppingCart_Page.link_GioHang().click();

		} catch (Exception e) {
			Log.error("Test Case 016 Failed because of Verification");
			e.printStackTrace();
		}
	}
	
	public static void testCase017() {
		try {
			logIn();
			ShoppingCart_Page.link_GioHang().click();
			ShoppingCart_Page.link_ThanhToan().click();
		} catch (Exception e) {
			Log.error("Test Case 017 Failed because of Verification");
			e.printStackTrace();
		}
	}
	
	public static void testCase018() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
		} catch (Exception e) {
			Log.error("Test Case 018 Failed because of Verification");
			e.printStackTrace();
		}
	}
	public static void testCase019() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
			ShoppingCart_Page.txt_NgayGiaoHang().sendKeys("");
			ShoppingCart_Page.txt_DiaChi().sendKeys(ExcelUtils.getCellData(19, 4));
			ShoppingCart_Page.buttonThanhToan().click();
		} catch (Exception e) {
			Log.error("Test Case 019 Failed because of Verification");
			e.printStackTrace();
		}
	}
	public static void testCase020() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
			ShoppingCart_Page.txt_NgayGiaoHang().sendKeys(ExcelUtils.getCellData(20, 3));
			ShoppingCart_Page.txt_DiaChi().sendKeys(ExcelUtils.getCellData(20, 4));
			ShoppingCart_Page.buttonThanhToan().click();
		} catch (Exception e) {
			Log.error("Test Case 020 Failed because of Verification");
			e.printStackTrace();
		}
	}
	public static void testCase021() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
			ShoppingCart_Page.txt_NgayGiaoHang().sendKeys(ExcelUtils.getCellData(21, 3));
			ShoppingCart_Page.txt_DiaChi().sendKeys(ExcelUtils.getCellData(21, 4));
			ShoppingCart_Page.buttonThanhToan().click();
		} catch (Exception e) {
			Log.error("Test Case 021 Failed because of Verification");
			e.printStackTrace();
		}
	}
	
	public static void testCase022() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
			ShoppingCart_Page.txt_NgayGiaoHang().sendKeys(ExcelUtils.getCellData(22, 3));
			ShoppingCart_Page.txt_DiaChi().sendKeys(ExcelUtils.getCellData(22, 4));
		} catch (Exception e) {
			Log.error("Test Case 022 Failed because of Verification");
			e.printStackTrace();
		}
	}
	
	public static void testCase023() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
			ShoppingCart_Page.txt_DiaChi().clear();
			ShoppingCart_Page.txt_NgayGiaoHang().sendKeys(ExcelUtils.getCellData(23, 3));
			ShoppingCart_Page.txt_DiaChi().sendKeys(ExcelUtils.getCellData(23, 4));
			ShoppingCart_Page.buttonThanhToan().click();
		} catch (Exception e) {
			Log.error("Test Case 023 Failed because of Verification");
			e.printStackTrace();
		}
	}
	
	public static void testCase024() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
			ShoppingCart_Page.txt_DiaChi().clear();
			ShoppingCart_Page.txt_NgayGiaoHang().sendKeys(ExcelUtils.getCellData(24, 3));
			ShoppingCart_Page.txt_DiaChi().sendKeys(ExcelUtils.getCellData(24, 4));
			ShoppingCart_Page.buttonThanhToan().click();
		} catch (Exception e) {
			Log.error("Test Case 024 Failed because of Verification");
			e.printStackTrace();
		}
	}
	public static void testCase025() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
			ShoppingCart_Page.txt_DiaChi().clear();
			ShoppingCart_Page.txt_NgayGiaoHang().sendKeys(ExcelUtils.getCellData(25, 3));
			ShoppingCart_Page.txt_DiaChi().sendKeys(ExcelUtils.getCellData(25, 4));
		} catch (Exception e) {
			Log.error("Test Case 025 Failed because of Verification");
			e.printStackTrace();
		}
	}
	
	public static void testCase026() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
			ShoppingCart_Page.txt_DiaChi().clear();
			ShoppingCart_Page.txt_NgayGiaoHang().sendKeys(ExcelUtils.getCellData(26, 3));
			ShoppingCart_Page.txt_DiaChi().sendKeys(ExcelUtils.getCellData(26, 4));
		} catch (Exception e) {
			Log.error("Test Case 026 Failed because of Verification");
			e.printStackTrace();
		}
	}
	
	public static void testCase027() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
			ShoppingCart_Page.txt_DiaChi().clear();
			ShoppingCart_Page.txt_NgayGiaoHang().sendKeys(ExcelUtils.getCellData(27, 3));
			ShoppingCart_Page.txt_DiaChi().sendKeys(ExcelUtils.getCellData(27, 4));
		} catch (Exception e) {
			Log.error("Test Case 027 Failed because of Verification");
			e.printStackTrace();
		}
	}
	
	public static void testCase028() {
		try {
			logIn();
			ShoppingCart_Page.linkDatMua_NgayQuanTrong_TC().click();
			ShoppingCart_Page.link_ThanhToan().click();
			ShoppingCart_Page.txt_DiaChi().clear();
			ShoppingCart_Page.txt_NgayGiaoHang().sendKeys(ExcelUtils.getCellData(28, 3));
			ShoppingCart_Page.txt_DiaChi().sendKeys(ExcelUtils.getCellData(28, 4));
		} catch (Exception e) {
			Log.error("Test Case 028 Failed because of Verification");
			e.printStackTrace();
		}
	}
	
	public static String getSoLuong() throws Exception {
		String soLuong = "";
		element = driver.findElement(
				By.xpath("html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/form/table/tbody"));
		List<WebElement> rows = element.findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size() - 2; rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			soLuong = columns.get(2).findElement(By.tagName("input")).getAttribute("value");
		}
		return soLuong;
	}
	
	
	public static void getTable_ShoppingCart(int soLuong, int messRow) throws Exception {
		int demSTT = 0;
		int tong = 0;
		element = driver.findElement(
				By.xpath("html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/form/table/tbody"));
		List<WebElement> rows = element.findElements(By.tagName("tr"));
		String chuoi = rows.get(rows.size() - 2).getText();
		for (int rnum = 1; rnum < rows.size() - 2; rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			int stt = Integer.parseInt(columns.get(0).getText());
			String tenHang = columns.get(1).getText();
			String sl = columns.get(2).findElement(By.tagName("input")).getAttribute("value");
			int sLuong = Integer.parseInt(sl);
			int donGia = Integer.parseInt(columns.get(3).getText());
			int thanhTien = Integer.parseInt(columns.get(4).getText());
			tong += thanhTien;
			demSTT++;
			for (int cnum = 0; cnum < columns.size(); cnum++) {
				switch (cnum) {
				case 0:
					if (stt == demSTT) {
						Log.info("Check STT successfuly");
					} else {
						Log.error("Check STT not successfuly");
						ShoppingCart_Page.test_failed(13, "ERROR STT");
					}
					break;
				case 1:
					if (tenHang.equals(tenHoa)) {
						Log.info("Check ten hoa successfuly");
					} else {
						ShoppingCart_Page.test_failed(13, "ERROR Tên Hàng");
						Log.error("Check ten hoa  not successfuly");
					}
					break;

				case 2:
					if (soLuong == sLuong) {
						Log.info("Check soluong successfuly");
					} else {
						ShoppingCart_Page.test_failed(13, "ERROR Số Lượng");
						Log.error("Check so luong  not successfuly");
					}
					break;
				case 3:
					if (donGia == giaHoa) {
						Log.info("Check don gia  successfuly");
					} else {
						ShoppingCart_Page.test_failed(13, "ERROR Đơn Giá");
						Log.error("Check don gia  not successfuly");
						
					}
					break;
				case 4:
					int thanhtien = soLuong * giaHoa;
					if (thanhtien == thanhTien) {
						Log.info("Check thanh tien  successfuly " + thanhtien);
					} else {
						ShoppingCart_Page.test_failed(13, "ERROR Thành Tiền");
						Log.error("Check thanh tien  not successfuly");
						
					}
					break;
				default:
					break;
				}
			}
			if (tong == layTongTien(chuoi)) {
				
				Log.info("Kiem tra tong tien thanh cong" + tong);
			} else {
				ShoppingCart_Page.test_failed(13, "ERROR Tổng Tiền");
				Log.error("kiem tra tong tien khong thanh cong");
				
			}
		}
		
	}

	public static String layNgayQuanTrong_Tc() {
		element = driver.findElement(By.xpath(
				"html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td"));
		String string = element.getText();
		return string;
	}

	public static String layNgayQuanTrong_SP() {
		element = driver.findElement(By.xpath(
				"html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td"));
		String string = element.getText();
		return string;
	}

	public static String layJustForYou_Hoa() {
		element = driver.findElement(By.xpath(
				"html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td"));
		String string = element.getText();
		return string;
	}

	public static String layNgayQuanTrong_Gia() {
		element = driver.findElement(By.xpath(
				"html/body/div[1]/div/div[3]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td"));
		String string = element.getText();
		return string;
	}

	public static int layTongTien(String chuoi) {
		String[] split = chuoi.split(": ");
		String tong = split[1];
		String tongTien = tong.split(" ")[0].replace(".", "");
		return Integer.parseInt(tongTien);
	}

	public static String layRaTenHoa(String chuoi) {
		String[] split = chuoi.split(": ");
		String tenVaGia = split[1];
		String[] result = tenVaGia.split("\n");
		return result[0];
	}

	public static int layRaGiaHoa(String chuoi) {
		String[] split = chuoi.split(": ");
		String tenVaGia = split[1];
		String[] result = tenVaGia.split("\n");
		String gia = result[1].split(":")[1];
		String giaHoa = gia.split(" ")[0].replace(".", "");
		return Integer.parseInt(giaHoa);
	}

}
