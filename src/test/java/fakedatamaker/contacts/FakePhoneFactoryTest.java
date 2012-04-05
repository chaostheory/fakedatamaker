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
package fakedatamaker.contacts;

import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fakedatamaker.contact.phone.FakePhoneFactory;
import fakedatamaker.contact.phone.FakePhoneFactory.USPhoneFormats;
import fakedatamaker.contact.phone.type.FakeUSPhone;

public class FakePhoneFactoryTest {
	private Pattern dashOnlyPattern = Pattern
			.compile("[\\d]{3}\\-[\\d]{3}\\-[\\d]{4}");
	private Pattern parenthesesPattern = Pattern
			.compile("\\([\\d]{3}\\) [\\d]{3}\\-[\\d]{4}");
	private Matcher matcher;
	
	
	
	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testShouldMakeStringPhoneUSWithNoParams() {
		String result = FakePhoneFactory.makeStringPhoneUS();
		System.out.println(result);
		matcher = dashOnlyPattern.matcher(result);
		assertTrue(matcher.find());
	}

	@Test
	public void testMakeStringPhoneUSWithFormatParam() {
		String result = FakePhoneFactory.makeStringPhoneUS(USPhoneFormats.JUSTDASHES);
		System.out.println(result);
		matcher = dashOnlyPattern.matcher(result);
		assertTrue(matcher.find());
		
		result = FakePhoneFactory.makeStringPhoneUS(USPhoneFormats.WITHPARENTHESES);
		System.out.println(result);
		matcher = parenthesesPattern.matcher(result);
		assertTrue(matcher.find());
	}

	@Test
	public void testMakePhoneUSWithFormatParamWithNoParams() {
		FakeUSPhone result = FakePhoneFactory.makePhoneUS();
		System.out.println(result.getFullPhoneNumber());
		matcher = dashOnlyPattern.matcher(result.getFullPhoneNumber());
		assertTrue(matcher.find());
		
		assertTrue(String.valueOf(result.getAreaCode()).length() == 3);
		assertTrue(String.valueOf(result.getFirstLocal()).length() == 3);
		assertTrue(String.valueOf(result.getSecondLocal()).length() == 4);
	}
	
	@Test
	public void testMakePhoneUSWithFormatParamWithFormatParam() {
		FakeUSPhone result = FakePhoneFactory.makePhoneUS(USPhoneFormats.JUSTDASHES);
		System.out.println(result.getFullPhoneNumber());
		matcher = dashOnlyPattern.matcher(result.getFullPhoneNumber());
		assertTrue(matcher.find());
		
		assertTrue(String.valueOf(result.getAreaCode()).length() == 3);
		assertTrue(String.valueOf(result.getFirstLocal()).length() == 3);
		assertTrue(String.valueOf(result.getSecondLocal()).length() == 4);
		
		result = FakePhoneFactory.makePhoneUS(USPhoneFormats.WITHPARENTHESES);
		System.out.println(result.getFullPhoneNumber());
		matcher = parenthesesPattern.matcher(result.getFullPhoneNumber());
		assertTrue(matcher.find());
		
		assertTrue(String.valueOf(result.getAreaCode()).length() == 3);
		assertTrue(String.valueOf(result.getFirstLocal()).length() == 3);
		assertTrue(String.valueOf(result.getSecondLocal()).length() == 4);
	}
}
