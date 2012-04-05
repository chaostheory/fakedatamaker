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

package fakedatamaker.contact.phone;

import java.util.Random;

import fakedatamaker.contact.phone.type.FakePhoneException;
import fakedatamaker.contact.phone.type.FakeUSPhone;

public class FakePhoneFactory {
	private static final Random RANDOM = new Random();
	
	public enum USPhoneFormats {
		WITHPARENTHESES, JUSTDASHES
	}
	
	/**
	 * 
	 * @return
	 */
	public static String makeStringPhoneUS() {
		return makeStringPhoneUS(USPhoneFormats.JUSTDASHES);
	}

	/**
	 * 
	 * @param numberFormat
	 * @return
	 */
	public static String makeStringPhoneUS(USPhoneFormats numberFormat) {
		Integer areaCode = RANDOM.nextInt(1000 - 199) + 199;
		Integer firstLocal = RANDOM.nextInt(1000 - 199) + 199;
		Integer secondLocal = RANDOM.nextInt(10000 - 1999) + 1999;
		
		if (numberFormat == USPhoneFormats.WITHPARENTHESES) {
			return String.format("(%s) %s-%s", areaCode, firstLocal, secondLocal);
		} else {
			return String.format("%s-%s-%s", areaCode, firstLocal, secondLocal);
		}
	}

	public static FakeUSPhone makePhoneUS(){
		return makePhoneUS(USPhoneFormats.JUSTDASHES);
	}
	
	/**
	 * 
	 * @param format
	 * @return
	 */
	public static FakeUSPhone makePhoneUS(USPhoneFormats format) {
		FakeUSPhone result = null;
		
		try {
			Integer areaCode = RANDOM.nextInt(1000 - 199) + 199;
			Integer firstLocal = RANDOM.nextInt(1000 - 199) + 199;
			Integer secondLocal = RANDOM.nextInt(10000 - 1999) + 1999;

			result = new FakeUSPhone(areaCode, firstLocal, secondLocal, format);
		} catch (FakePhoneException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}