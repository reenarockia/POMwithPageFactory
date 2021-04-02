package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public String[][] readDataFromXL(String fileName,String sheetNumber) throws IOException{
		System.out.println("In ReadExcel");
		XSSFWorkbook wb1=new XSSFWorkbook("./Data/"+fileName+".xlsx");
		XSSFSheet ws1=wb1.getSheet(sheetNumber);
		
		int numberOfRows=ws1.getLastRowNum();
		int numberOfCells=ws1.getRow(0).getLastCellNum();
		System.out.println("number of rows-"+numberOfRows);
		System.out.println("number of columns-"+numberOfCells);
		String[][] data=new String[numberOfRows][numberOfCells];
		
		for(int i=1;i<=numberOfRows;i++) {
			for(int j=0;j<numberOfCells;j++) {
				String extractedData=ws1.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=extractedData;
			}
		}
		wb1.close();
		return data;
		
	}


}
