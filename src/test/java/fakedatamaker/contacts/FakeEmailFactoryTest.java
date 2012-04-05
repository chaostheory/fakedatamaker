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
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fakedatamaker.contact.online.FakeEmailFactory;

public class FakeEmailFactoryTest {
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private Pattern pattern = Pattern.compile(EMAIL_PATTERN); 
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShouldMakeEmail() {
		String result = FakeEmailFactory.makeEmail();
		System.out.println(result);
		Matcher matcher = pattern.matcher(result);
		assertTrue(matcher.matches());
	}
	
	@Test
	public void testShouldMakeEmailWithName() {
		String result;
		try {
			result = FakeEmailFactory.makeEmail("Brian", "Lee");
			System.out.println(result);
			Matcher matcher = pattern.matcher(result);
			assertTrue(matcher.matches());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		
	}
	
	@Test
	public void testShouldMakeEmailWithDomain() {
		try {
			String result = FakeEmailFactory.makeEmail("blahblah.com");
			System.out.println(result);
			Matcher matcher = pattern.matcher(result);
			assertTrue(matcher.matches());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
