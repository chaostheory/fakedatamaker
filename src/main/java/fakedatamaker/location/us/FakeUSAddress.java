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

package fakedatamaker.location.us;

import org.apache.commons.lang3.StringUtils;

import fakedatamaker.location.FakeAddress;
import fakedatamaker.location.FakeAddressException;

public class FakeUSAddress extends FakeAddress {
	private USState usState = null;
	private USStreetType usStreetType = null;
	private boolean abbrStreetType = true;
	private boolean abbrState = true;

	/**
	 * 
	 * @param streetNumber
	 * @param streetName
	 * @param usStreetType
	 * @param city
	 * @param usState
	 * @param postalCode
	 * @throws FakeAddressException
	 */
	public FakeUSAddress(String streetNumber, String streetName,
			USStreetType usStreetType, String city, USState usState,
			String postalCode) throws FakeAddressException {
		this(streetNumber, streetName, usStreetType, StringUtils.EMPTY, city,
				usState, postalCode, true, true);
	}
	
	/**
	 * 
	 * @param streetNumber
	 * @param streetName
	 * @param usStreetType
	 * @param city
	 * @param usState
	 * @param postalCode
	 * @param abbrStreetType
	 * @param abbrState
	 * @throws FakeAddressException
	 */
	public FakeUSAddress(String streetNumber, String streetName,
			USStreetType usStreetType, String city,
			USState usState, String postalCode, boolean abbrStreetType,
			boolean abbrState) throws FakeAddressException {
		this(streetNumber, streetName, usStreetType, StringUtils.EMPTY, city,
				usState, postalCode, abbrStreetType, abbrState);
	}

	/**
	 * 
	 * @param streetNumber
	 * @param streetName
	 * @param usStreetType
	 * @param streetLineTwo
	 * @param city
	 * @param usState
	 * @param postalCode
	 * @param abbrStreetType
	 * @param abbrState
	 * @throws FakeAddressException
	 */
	public FakeUSAddress(String streetNumber, String streetName,
			USStreetType usStreetType, String streetLineTwo, String city,
			USState usState, String postalCode, boolean abbrStreetType,
			boolean abbrState) throws FakeAddressException {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.usStreetType = usStreetType;
		this.streetLineTwo = streetLineTwo;
		this.city = city;
		this.usState = usState;
		this.postalCode = postalCode;
		this.abbrStreetType = abbrStreetType;
		this.abbrState = abbrState;
	}

	/**
	 * 
	 * 
	 * @return A USState
	 */
	public USState getUsState() {
		return usState;
	}

	/**
	 * 
	 * 
	 * @param usState
	 */
	public void setUsState(USState usState) {
		this.usState = usState;
	}

	/**
	 * 
	 * @return
	 */
	public USStreetType getUsStreetType() {
		return usStreetType;
	}

	/**
	 * 
	 * @param usStreetType
	 */
	public void setUsStreetType(USStreetType usStreetType) {
		this.usStreetType = usStreetType;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isAbbrStreetType() {
		return abbrStreetType;
	}

	/**
	 * 
	 * @param abbrStreetType
	 */
	public void setAbbrStreetType(boolean abbrStreetType) {
		this.abbrStreetType = abbrStreetType;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isAbbrState() {
		return abbrState;
	}

	/**
	 * 
	 * @param abbrState
	 */
	public void setAbbrState(boolean abbrState) {
		this.abbrState = abbrState;
	}

	@Override
	public String toString() {
		String usStateVal = null;
		String usStreetTypeVal = null;

		if (abbrStreetType) {
			usStreetTypeVal = usStreetType.abbrValue();
		} else {
			usStreetTypeVal = usStreetType.value();
		}

		if (abbrState) {
			usStateVal = usState.abbrValue();
		} else {
			usStateVal = usState.value();
		}

		return String.format("%s %s %s, %s, %s %s", streetNumber, streetName,
				usStreetTypeVal, city, usStateVal, postalCode);
	}
}