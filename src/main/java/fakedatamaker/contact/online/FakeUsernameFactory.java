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

package fakedatamaker.contact.online;

import org.apache.commons.lang3.RandomStringUtils;

public class FakeUsernameFactory {

	public static String makeRandomAlphaNumericUsername() {
		return RandomStringUtils.randomAlphanumeric(8);
	}

	public static String makeRandomAlphaNumericUsername(int maxSize) {
		return RandomStringUtils.randomAlphanumeric(maxSize);
	}

	public static String makeRandomAlphaNumericPassword() {
		return RandomStringUtils.randomAlphanumeric(8);
	}

	public static String makeRandomAlphaNumericPassword(int maxSize) {
		return RandomStringUtils.randomAlphanumeric(maxSize);
	}
	
	public String makeTwitterUser(){
		//TODO
		return null;
	}
	
	public String makeFacebookPageId(){
		//TODO
		return null;
	}
	
	public String makeAIMUser(){
		//TODO
		return null;
	}
	
	public String makeGoogleUser(){
		//TODO
		return null;
	}
	
	public String makeYahooUser(){
		//TODO
		return null;
	}
	
	public String makeMicrosoftUser(){
		//TODO
		return null;
	}
}
