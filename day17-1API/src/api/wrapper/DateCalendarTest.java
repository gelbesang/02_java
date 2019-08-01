package api.wrapper;

import java.util.Calendar;
import java.util.Date;
public class DateCalendarTest {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
		System.out.println(new Date(2019 - 1900, 9, 01));
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(calendar.YEAR) + "년" + 
						   calendar.get(calendar.MONTH) + "월" + 
						   calendar.get(calendar.DAY_OF_MONTH) + "일");
		calendar.set(2019,9,01);
		System.out.println(calendar.get(calendar.YEAR) + " 년" +
						   calendar.get(calendar.DAY_OF_MONTH) + "월" + 
						   calendar.get(calendar.DAY_OF_MONTH) + "일");
		
	}

}
