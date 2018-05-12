package generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Autoconstant
{
	public static String readData(String sheet , int m , int n) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Workbook wb = WorkbookFactory.create(new File(PATH));
		Sheet sh = wb.getSheet(sheet);
		Row r = sh.getRow(m);
		Cell c = r.getCell(n);
		String str = c.toString();
		return str;
	}
}
