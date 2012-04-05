/*
 *  Copyright 2012 Brian R Lee
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package fakedatamaker.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import fakedatamaker.datetime.type.DateRange;

public class FakeDateFactory {
	private static final Random RANDOM = new Random();

	/**
	 * 
	 * @param month1
	 * @param dayOfMonth1
	 * @param year1
	 * @return
	 */
	public static Date makeDate(Integer month1, Integer dayOfMonth1,
			Integer year1){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month1);
		cal.set(Calendar.DAY_OF_MONTH, dayOfMonth1);
		cal.set(Calendar.YEAR, year1);
		cal.set(Calendar.HOUR_OF_DAY, 8);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);

		Calendar cal2 = Calendar.getInstance();

		long dateInMS1 = cal.getTimeInMillis();
		long dateInMS2 = cal2.getTimeInMillis();

		long randomTS = (long) (RANDOM.nextDouble() * (dateInMS2 - dateInMS1))
				+ dateInMS1;

		return new Date(randomTS);
	}
	
	/**
	 * 
	 * @param month1
	 * @param dayInMonth1
	 * @param year1
	 * @param month2
	 * @param dayInMonth2
	 * @param year2
	 * @return
	 */
	public static Date makeDate(Integer month1, Integer dayOfMonth1,
			Integer year1, Integer month2, Integer dayOfMonth2, Integer year2) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month1);
		cal.set(Calendar.DAY_OF_MONTH, dayOfMonth1);
		cal.set(Calendar.YEAR, year1);
		cal.set(Calendar.HOUR_OF_DAY, 8);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);

		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.MONTH, month2);
		cal2.set(Calendar.DAY_OF_MONTH, dayOfMonth2);
		cal2.set(Calendar.YEAR, year2);
		cal2.set(Calendar.HOUR_OF_DAY, 8);
		cal2.set(Calendar.MINUTE, 0);
		cal2.set(Calendar.SECOND, 0);

		long dateInMS1 = cal.getTimeInMillis();
		long dateInMS2 = cal2.getTimeInMillis();

		long randomTS = (long) (RANDOM.nextDouble() * (dateInMS2 - dateInMS1))
				+ dateInMS1;

		return new Date(randomTS);
	}

	/**
	 * 
	 * @param minDate
	 * @param maxDate
	 * @return
	 * @throws Exception
	 */
	public static Date makeDate(Date minDate, Date maxDate) throws Exception {
		if (minDate == null) {
			throw new Exception("the minimum data cannot be null");
		}

		if (maxDate == null) {
			throw new Exception("the maximum data cannot be null");
		}

		long minDateMS = minDate.getTime();
		long maxDateMS = maxDate.getTime();

		long randomTS = (long) (RANDOM.nextDouble() * (maxDateMS - minDateMS))
				+ minDateMS;
		return new Date(randomTS);
	}

	/**
	 * 
	 * @param minDate
	 * @param maxDate
	 * @return
	 * @throws Exception
	 */
	public static DateRange makeDateRange(Date minDate, Date maxDate)
			throws Exception {
		if (minDate == null) {
			throw new Exception("the minimum data cannot be null");
		}

		if (maxDate == null) {
			throw new Exception("the maximum data cannot be null");
		}

		long minDateMS = minDate.getTime();
		long maxDateMS = maxDate.getTime();

		Random r = new Random();
		long randomTS = (long) (RANDOM.nextDouble() * (maxDateMS - minDateMS))
				+ minDateMS;
		Date firstDate = new Date(randomTS);

		minDateMS = firstDate.getTime();
		randomTS = (long) (RANDOM.nextDouble() * (maxDateMS - minDateMS))
				+ minDateMS;
		Date secondDate = new Date(randomTS);

		return new DateRange(firstDate, secondDate);
	}
}
