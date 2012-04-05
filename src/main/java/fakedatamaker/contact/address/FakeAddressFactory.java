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

package fakedatamaker.contact.address;

import java.util.Random;

import org.apache.commons.math3.random.RandomData;
import org.apache.commons.math3.random.RandomDataImpl;

import fakedatamaker.contact.address.type.FakeUSAddress;
import fakedatamaker.contact.address.type.USState;
import fakedatamaker.contact.address.type.USStreetType;
import fakedatamaker.util.RandomFileUtil;

public class FakeAddressFactory {
	private static final Random RANDOM = new Random();
	private static final RandomData randomData = new RandomDataImpl();

	/**
	 * 
	 * @return A FakeUSAddress instance.
	 */
	public static FakeUSAddress makeUSAddress() {
		return null;
	}

	/**
	 * Generates a full street line. e.g 123 Main Street
	 * 
	 * @return A String
	 */
	public static String makeFullStreetName() {
		return String.format("%s %s", makeStreetNumber(), makeStreetName());
	}

	/**
	 * 
	 * 
	 * @param minStNumSize
	 * @param maxStNumSize
	 * @return
	 */
	public static String makeFullStreetName(int minStNumSize, int maxStNumSize) {
		return String.format("%s %s",
				makeStreetNumber(minStNumSize, maxStNumSize), makeStreetName());
	}

	/**
	 * 
	 * @return
	 */
	public static String makeStreetNumber() {
		return makeStreetNumber(1, 6);
	}

	/**
	 * Returns a street number.
	 * 
	 * @param minSize
	 *            The minimum number of digits to generate.
	 * @param maxSize
	 *            The maximum number of digits to generate.
	 * @return A String of integers
	 */
	public static String makeStreetNumber(int minSize, int maxSize) {
		StringBuffer result = new StringBuffer();
		int numberOfDigits = randomData.nextInt(minSize, maxSize);

		// first digit can't be zero
		result.append(randomData.nextInt(1, 9));

		for (int i = 0; i < numberOfDigits - 1; i++) {
			result.append(randomData.nextInt(0, 9));
		}

		return result.toString();
	}

	public static String makeStreetName() {
		return makeStreetName(true);
	}

	/**
	 * Generates a street name. e.g. Main Street
	 * 
	 * @param abbreviate
	 *            True to abbreviate the last portion of the street name.
	 * @return A String
	 */
	public static String makeStreetName(boolean abbreviate) {
		String streetName = RandomFileUtil.getRandomFileLine(
				"resources/us_street_names.txt", "UTF-8");

		String streetType = null;

		USStreetType type = USStreetType.randomStreetType();

		if (abbreviate) {
			streetType = type.abbrValue();
		} else {
			streetType = type.value();
		}

		return String.format("%s %s", streetName, streetType);
	}

	/**
	 * 
	 * @return
	 */
	public static String makeCity() {
		return RandomFileUtil.getRandomFileLine("resources/us_cities.txt",
				"UTF-8");
	}

	public static String makeState() {
		return RandomFileUtil.getRandomFileLine("resources/us_states.txt",
				"UTF-8");
	}

	public static String makeStateAbbr() {
		return RandomFileUtil.getRandomFileLine("resources/us_states_abbr.txt",
				"UTF-8");
	}

	public static USState makeStateFull() {
		String result = RandomFileUtil.getRandomFileLine(
				"resources/us_states_full.txt", "UTF-8");
		String[] statesData = result.split(",");

		return new USState(statesData[1], statesData[0]);
	}

	public static String makePostalCode() {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < 5; i++) {
			result.append(RANDOM.nextInt(10));
		}

		return result.toString();
	}

	public static String makePostalCodeFull() {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < 5; i++) {
			result.append(RANDOM.nextInt(10));
		}

		result.append("-");

		for (int i = 0; i < 4; i++) {
			result.append(RANDOM.nextInt(10));
		}

		return result.toString();
	}

	public static void main(String[] args) {
		// USState state = FakeAddressFactory.makeStateFull();
		// System.out.println(state.getFullName());
		// System.out.println(state.getAbbreviation());

		System.out.println(FakeAddressFactory.makeCity());
	}
}
