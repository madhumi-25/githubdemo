package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import Keyword.ObjIden;
import Testdata.ExcelData;
import Testdata.Excel_Data;

public class DriverScrp 
{
	@Test
	public void script()
	{
		Excel_Data da=new Excel_Data();
		Excel_Data dak=new Excel_Data();
		ObjIden idm=new ObjIden();
		try
		{
			da.Excel("C:\\Users\\BLTuser.BLT1216\\Desktop\\testdata.xlsx");
			dak.Excel("C:\\Users\\BLTuser.BLT1216\\Desktop\\keyword.xlsx");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<=da.rowco();i++)
		{
			String SearchString=da.getCellVa(i, 0);
			
			for(int j=1;j<=dak.rowco();j++)
			{
				String keyword1=dak.getCellVa(j, 2);
				if(keyword1.equalsIgnoreCase("OpenBrow"))
				{
					idm.OpenBrow();
				}
				else if(keyword1.equalsIgnoreCase("SetUrl"))
				{
					idm.SetUrl();
				}
				else if(keyword1.equalsIgnoreCase("Search"))
				{
					idm.Search(SearchString);
				}
				else if(keyword1.equalsIgnoreCase("closeBrow"))
				{
					idm.closeBrow();
				}
			}
		}
	}
}