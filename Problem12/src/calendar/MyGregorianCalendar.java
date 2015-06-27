/**
 * 
 */
package calendar;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author garciparedes
 *
 */
public class MyGregorianCalendar extends GregorianCalendar {

	/**
	 * 
	 */
	public MyGregorianCalendar() {
	}

	/**
	 * @param zone
	 */
	public MyGregorianCalendar(TimeZone zone) {
		super(zone);
	}

	/**
	 * @param aLocale
	 */
	public MyGregorianCalendar(Locale aLocale) {
		super(aLocale);
	}

	/**
	 * @param zone
	 * @param aLocale
	 */
	public MyGregorianCalendar(TimeZone zone, Locale aLocale) {
		super(zone, aLocale);
	}

	/**
	 * @param year
	 * @param month
	 * @param dayOfMonth
	 */
	public MyGregorianCalendar(int year, int month, int dayOfMonth) {
		super(year, month, dayOfMonth);
	}

	/**
	 * @param year
	 * @param month
	 * @param dayOfMonth
	 * @param hourOfDay
	 * @param minute
	 */
	public MyGregorianCalendar(int year, int month, int dayOfMonth,
			int hourOfDay, int minute) {
		super(year, month, dayOfMonth, hourOfDay, minute);
	}

	/**
	 * @param year
	 * @param month
	 * @param dayOfMonth
	 * @param hourOfDay
	 * @param minute
	 * @param second
	 */
	public MyGregorianCalendar(int year, int month, int dayOfMonth,
			int hourOfDay, int minute, int second) {
		super(year, month, dayOfMonth, hourOfDay, minute, second);
	}
	
	@Override
	public String toString() {
		return String.format("%d/%02d/%02d", get(YEAR), get(MONTH) + 1, get(DAY_OF_MONTH));
	}

}
