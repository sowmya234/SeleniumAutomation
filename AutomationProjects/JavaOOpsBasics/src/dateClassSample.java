import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateClassSample {

	public static void main(String[] args) {
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm::ss");
		SimpleDateFormat sdf1=new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
		System.out.println(d.getHours());
		System.out.println(d.getDay());
		System.out.println(d.getMonth());
		System.out.println(d.toString());
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getWeeksInWeekYear());
		
		System.out.println(sdf.format(cal.getTime()));
		

	}

}
