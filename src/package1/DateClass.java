package package1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateClass {
public static void main(String[] args){
	String text = "2012-08-09";
	
	DateFormat format = new SimpleDateFormat("yyyy-dd-mm", Locale.ENGLISH);
	Date date=null;
	try {
		date = format.parse(text);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(date);
	
}
}
