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

import fakedatamaker.contact.address.us.FakeUSAddress;
import fakedatamaker.contact.address.us.USState;
import fakedatamaker.contact.address.us.USStreetType;
import fakedatamaker.util.RandomFileUtil;

public class FakeUSAddressFactory {
	private static final Random RANDOM = new Random();
	private static final RandomData randomData = new RandomDataImpl();

	/**
	 * 
	 * @return
	 * @throws FakeAddressException
	 */
	public static FakeUSAddress makeAddress() throws FakeAddressException {
		return makeAddress(true, true);
	}

	/**
	 * 
	 * 
	 * @param abbrStreetType
	 * @param abbrState
	 * 
	 * @return A FakeUSAddress instance.
	 * @throws FakeAddressException
	 */
	public static FakeUSAddress makeAddress(boolean abbrStreetType,
			boolean abbrState) throws FakeAddressException {
		return new FakeUSAddress(makeStreetNumber(), makeStreetName(),
				USStreetType.randomStreetType(), makeCity(),
				USState.randomState(), makePostalCode(), abbrStreetType,
				abbrState);
	}

	/**
	 * Generates a full street line. e.g 123 Main Street
	 * 
	 * @return A String
	 */
	public static String makeFullStreet() {
		return String.format("%s %s", makeStreetNumber(), makeStreetName(),
				true);
	}

	/**
	 * 
	 * 
	 * @param minStNumSize
	 * @param maxStNumSize
	 * @param abbreviate
	 *            True to abbreviate the last portion of the street name.
	 * @return
	 */
	public static String makeFullStreet(int minStNumSize, int maxStNumSize,
			boolean abbreviate) {
		return String.format("%s %s",
				makeStreetNumber(minStNumSize, maxStNumSize),
				makeFullStreetName(abbreviate));
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

	public static String makeFullStreetName() {
		return makeFullStreetName(true);
	}

	/**
	 * Generates a street name. e.g. Main Street
	 * 
	 * @param abbreviate
	 *            True to abbreviate the last portion of the street name.
	 * @return A String
	 */
	public static String makeFullStreetName(Boolean abbreviate) {
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

	public static String makeStreetName() {
		return RandomFileUtil.getRandomFileLine(
				"resources/us_street_names.txt", "UTF-8");
	}

	/**
	 * 
	 * @return
	 */
	public static String makeCity() {
		return RandomFileUtil.getRandomFileLine("resources/us_cities.txt",
				"UTF-8");
	}

	/**
	 * Returns a random US state.
	 * 
	 * @return A String
	 */
	public static String makeState() {
		return USState.randomState().value();
	}

	/**
	 * Returns a random abbreviated US state.
	 * 
	 * @return A String
	 */
	public static String makeStateAbbr() {
		return USState.randomState().abbrValue();
	}

	/**
	 * 
	 * @return
	 */
	public static String makePostalCode() {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < 5; i++) {
			result.append(RANDOM.nextInt(10));
		}

		return result.toString();
	}

	/**
	 * 
	 * @return
	 */
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

		try {
			System.out.println(FakeUSAddressFactory.makeAddress());
		} catch (FakeAddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
