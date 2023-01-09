package libraryfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NinjaExcelData {
	
	
	String Filepath =null;
	public FileInputStream InFile;
	public Workbook workbook;
	public Sheet sheet;
	public Row row;
	public Cell col;
	public FileOutputStream OutFile;
	
	CellStyle style;
	 


	public NinjaExcelData (String Filepath) {
		this.Filepath=Filepath;
	}

	public int getRowCount(String Sheetname) throws EncryptedDocumentException, IOException {
		
		InFile = new FileInputStream(Filepath);
		workbook= WorkbookFactory.create(InFile);
		sheet = workbook.getSheet(Sheetname);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
		InFile.close();
		return rowcount;
		 
	}
	
	public int getCellCount(String Sheetname, int rowNo) throws IOException {
		
		InFile = new FileInputStream(Filepath);
		workbook= WorkbookFactory.create(InFile);
		sheet = workbook.getSheet(Sheetname);
		row =sheet.getRow(rowNo);
		int cellcount = row.getLastCellNum();
		workbook.close();
		InFile.close();
		return cellcount;
		
	}
	
	public String getData(String Sheetname, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		InFile = new FileInputStream(Filepath);
		workbook= WorkbookFactory.create(InFile);
		sheet = workbook.getSheet(Sheetname);
		row =sheet.getRow(rowNo);
		col = row.getCell(cellNo);
		
		DataFormatter formater = new DataFormatter();
		String Data;
		try {
			Data=formater.formatCellValue(col);
		}
		catch(Exception e){
			Data=" ";
		}
		workbook.close();
		InFile.close();
		
		return Data;
		
	}
	
	
	public void setCellData(String Sheetname, int rowNo, int cellNo, String Data) throws EncryptedDocumentException, IOException {
		
		InFile = new FileInputStream(Filepath);
		workbook= WorkbookFactory.create(InFile);
		sheet = workbook.getSheet(Sheetname);
		row =sheet.getRow(rowNo);
		col = row.getCell(cellNo);
		col.setCellValue(Data);
		
		OutFile = new FileOutputStream(Filepath);
		workbook.write(OutFile);
		workbook.close();
		InFile.close();
		OutFile.close();
		
	}
	 
	
	public void fillgreencolor(String Sheetname, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		InFile = new FileInputStream(Filepath);
		workbook= WorkbookFactory.create(InFile);
		sheet = workbook.getSheet(Sheetname);
		row =sheet.getRow(rowNo);
		col = row.getCell(cellNo);
		
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		col.setCellStyle(style);
		
		workbook.write(OutFile);
		workbook.close();
		InFile.close();
		OutFile.close();
		
	}
	
public void fillredcolor(String Sheetname, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		InFile = new FileInputStream(Filepath);
		workbook= WorkbookFactory.create(InFile);
		sheet = workbook.getSheet(Sheetname);
		row =sheet.getRow(rowNo);
		col = row.getCell(cellNo);
		
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		col.setCellStyle(style);
		
		workbook.write(OutFile);
		workbook.close();
		InFile.close();
		OutFile.close();
		
	}


}
