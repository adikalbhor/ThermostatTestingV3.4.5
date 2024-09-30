package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path ="./testData//Opencart_LoginData.xlsx";
		
		ExcelUtility excelut=new ExcelUtility(path);
		
		int totalnumrow=excelut.getRowCount("Sheet1");
		int totalnumcol=excelut.getCellCount("Sheet1", 1);
		
		String logindata[][]=new String[totalnumrow][totalnumcol];
		
		for(int i=1;i<totalnumrow;i++)
		{
			for(int j=0;j<totalnumcol;j++)
			{
				 logindata[i-1][j]=excelut.getCellData("Sheet1", i,j);
			}
		}
		return logindata;
		
		
		
		
	}
}
