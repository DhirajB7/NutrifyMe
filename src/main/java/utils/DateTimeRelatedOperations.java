package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeRelatedOperations {
	
	public String getDateAndTime() {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		 Date date = new Date();
		 return formatter.format(date);	 
	}
	
}
