package br.com.watch.utils;

import java.util.Calendar;

public class ClockUtils {

	public static Calendar getCalendar(int hour, int minutes) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minutes);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	public static double getClockAngle(Calendar calendar) {
		final int hour = calendar.get(Calendar.HOUR_OF_DAY);
		final int minutes = calendar.get(Calendar.MINUTE);

		double hourAngle = 0.5D * (hour * 60 + minutes);
		double minutesAngle = 6 * minutes;
		double absAangle = Math.abs(hourAngle - minutesAngle);
		return Math.min(absAangle, 360 - absAangle);
	}

}
