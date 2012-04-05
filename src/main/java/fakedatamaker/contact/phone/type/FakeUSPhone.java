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

package fakedatamaker.contact.phone.type;

import fakedatamaker.contact.phone.FakePhoneFactory.USPhoneFormats;

public class FakeUSPhone {
	/**
	 * e.g. 407
	 */
	private Integer areaCode;

	/**
	 * first portion of a local number
	 */
	private Integer firstLocal;

	/**
	 * last portion of a local number
	 */
	private Integer secondLocal;

	/**
	 * e.g. 345-6789
	 */
	private String localNumbers;

	private USPhoneFormats numberFormat;

	/**
	 * 
	 * A US Phone number: [areaCode]-[firstLocal]-[secondLocal]
	 * 
	 * @param areaCode
	 * @param firstLocal
	 * @param secondLocal
	 * @throws FakePhoneException
	 */
	public FakeUSPhone(Integer areaCode, Integer firstLocal, Integer secondLocal) throws FakePhoneException {
		this(areaCode, firstLocal, secondLocal, USPhoneFormats.JUSTDASHES);
	}

	/**
	 * 
	 * A US Phone number: [areaCode]-[firstLocal]-[secondLocal]
	 * 
	 * @param areaCode
	 * @param firstLocal
	 * @param secondLocal
	 * @param numberFormat
	 * @throws FakePhoneException
	 */
	public FakeUSPhone(Integer areaCode, Integer firstLocal,
			Integer secondLocal, USPhoneFormats numberFormat) throws FakePhoneException{
		if (areaCode == null) {
			throw new FakePhoneException("The area code value was null.");
		}
		
		if (String.valueOf(areaCode).length() != 3) {
			throw new FakePhoneException("The area code value must be three digits in size.");
		}

		if (firstLocal == null) {
			throw new FakePhoneException("The firstLocal value was null.");
		}
		
		if (String.valueOf(firstLocal).length() != 3) {
			throw new FakePhoneException("The firstLocal value must be three digits in size.");
		}
		
		if (secondLocal == null) {
			throw new FakePhoneException("The secondLocal value was null.");
		}
		
		if (String.valueOf(secondLocal).length() != 4) {
			throw new FakePhoneException("The secondLocal value must be four digits in size.");
		}
		
		this.areaCode = areaCode;
		this.firstLocal = firstLocal;
		this.secondLocal = secondLocal;
		this.numberFormat = numberFormat;
	}

	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	public Integer getFirstLocal() {
		return firstLocal;
	}

	public void setFirstLocal(Integer firstLocal) {
		this.firstLocal = firstLocal;
	}

	public Integer getSecondLocal() {
		return secondLocal;
	}

	public void setSecondLocal(Integer secondLocal) {
		this.secondLocal = secondLocal;
	}

	public String getLocalNumbers() {
		return localNumbers;
	}

	public void setLocalNumbers(String localNumbers) {
		this.localNumbers = localNumbers;
	}

	public USPhoneFormats getNumberFormat() {
		return numberFormat;
	}

	public void setNumberFormat(USPhoneFormats numberFormat) {
		this.numberFormat = numberFormat;
	}
	
	public String getFullPhoneNumber(){
		if (numberFormat == USPhoneFormats.WITHPARENTHESES) {
			return String.format("(%s) %s-%s", areaCode, firstLocal, secondLocal);
		} else {
			return String.format("%s-%s-%s", areaCode, firstLocal, secondLocal);
		}
	}
}
