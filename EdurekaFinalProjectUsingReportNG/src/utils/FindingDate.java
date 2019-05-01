package utils;

import java.util.Date;

public class FindingDate {

	FindingDate()
	{
		
	}
	//get the date time stamp
		public static String getDateTimeStamp()
		{
			Date oDate;
			String[] sDatePart;
			String sDateStamp;
			oDate = new Date();
			System.out.println(oDate.toString());
			//day month date hrs:min:secs IST Year format
			
			sDatePart = oDate.toString().split(" ");
			sDateStamp = sDatePart[5] + "_" + sDatePart[1] + "_"+
			             sDatePart[2] + "_"+ sDatePart[3];
			
			sDateStamp = sDateStamp.replace(":","_");
			System.out.println(sDateStamp);
			return sDateStamp;
		}
}
