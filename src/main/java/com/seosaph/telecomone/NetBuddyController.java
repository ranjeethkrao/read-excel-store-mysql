package com.seosaph.telecomone;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetBuddyController {
	
	@Autowired
	NetBuddyRepo netBuddyRepository;

	@GetMapping("api/readExcel")
	public String processExcel() {

		try {

			InputStream ExcelFileToRead = new FileInputStream("/Users/rao/Downloads/NetBuddy.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
			List<NetBuddy> buddies = new ArrayList<NetBuddy>();
			for (int i = 0; i < wb.getNumberOfSheets(); i++) {
				XSSFSheet sheet = wb.getSheetAt(i);
				for (int k = 1; k < sheet.getLastRowNum(); k++) {
					XSSFRow row = sheet.getRow(k);
					int j=0;
					NetBuddy buddy = new NetBuddy();
					buddy.setSheetName(sheet.getSheetName());
					buddy.setCmeName(row.getCell(j++).getStringCellValue());
					j++;
//					buddy.setFieldTsgNo(Long.parseLong(row.getCell(j++).getStringCellValue()));
					buddy.setSrNo(row.getCell(j++).getStringCellValue());
					buddy.setStatus(row.getCell(j++).getStringCellValue());
					buddy.setCustomerCategory(row.getCell(j++).getStringCellValue());
					buddy.setComplaintCategory(row.getCell(j++).getStringCellValue());
					buddy.setNetworkType(row.getCell(j++).getStringCellValue());
					buddy.setCustomerName(row.getCell(j++).getStringCellValue());
					buddy.setMobileNumber((long) row.getCell(j++).getNumericCellValue());
					buddy.setDistrict(row.getCell(j++).getStringCellValue());
					buddy.setRemark(row.getCell(j++).getStringCellValue());
					buddy.setLatitude(Double.parseDouble(row.getCell(j++).getStringCellValue()));
					buddy.setLongitude(Double.parseDouble(row.getCell(j++).getStringCellValue()));
//					buddy.setComplaintDate(row.getCell(j++).getDateCellValue());
					j++;
					buddy.setAssignedToCmeDate(new SimpleDateFormat("dd/MM/yyyy").parse(row.getCell(j++).getStringCellValue()));
//					buddy.setAssignedToFieldDate(new SimpleDateFormat("dd/MM/yyyy").parse(row.getCell(j++).getStringCellValue()));
					j++;
//					buddy.setCompliantClosedDate(new SimpleDateFormat("dd/MM/yyyy").parse(row.getCell(j++).getStringCellValue()));
					
					buddies.add(buddy);
				}

			}
			
			netBuddyRepository.save(buddies);
			
		} catch (Exception e) {
			System.err.println("Error");
			e.printStackTrace();
		}
		return "data extracted successfully";
	}

}