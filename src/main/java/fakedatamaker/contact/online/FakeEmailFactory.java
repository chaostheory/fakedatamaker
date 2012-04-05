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

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class FakeEmailFactory {

	public static final String[] commonDomains = { "yahoo.com", "gmail.com",
			"aol.com", "aim.com", "msn.com", "comcast.net", "att.com",
			"verizon.net", "facebook.com" };

	private static Random generator = new Random();

	private static final String DOMAIN_REGEX = "/^([a-z0-9]([-a-z0-9]*[a-z0-9])?\\.)+((a[cdefgilmnoqrstuwxz]|aero|arpa)|(b[abdefghijmnorstvwyz]|biz)|(c[acdfghiklmnorsuvxyz]|cat|com|coop)|d[ejkmoz]|(e[ceghrstu]|edu)|f[ijkmor]|(g[abdefghilmnpqrstuwy]|gov)|h[kmnrtu]|(i[delmnoqrst]|info|int)|(j[emop]|jobs)|k[eghimnprwyz]|l[abcikrstuvy]|(m[acdghklmnopqrstuvwxyz]|mil|mobi|museum)|(n[acefgilopruz]|name|net)|(om|org)|(p[aefghklmnrstwy]|pro)|qa|r[eouw]|s[abcdeghijklmnortvyz]|(t[cdfghjklmnoprtvwz]|travel)|u[agkmsyz]|v[aceginu]|w[fs]|y[etu]|z[amw])$/i";
	private static Pattern pattern = Pattern.compile(DOMAIN_REGEX);

	/**
	 * Generates an email. More strict than the true email standard. No special
	 * characters such as the + (plus) sign.
	 */
	public static String makeEmail() {
		return String.format("%s@%s", RandomStringUtils.randomAlphabetic(8)
				.toLowerCase(), makeDomain());
	}

	/**
	 * Generates an email, with a given domain name.
	 * 
	 * @param domain
	 * @return
	 * @throws Exception
	 */
	public static String makeEmail(String domain) throws Exception {
		if (!isDomainValid(domain)) {
			throw new Exception("Your domain is invalid.");
		}

		return String.format("%s@%s", RandomStringUtils.randomAlphabetic(8),
				domain);
	}

	/**
	 * 
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 * @throws Exception
	 */
	public static String makeEmail(String firstName, String lastName) throws Exception {
		if (StringUtils.isEmpty(firstName)) {
			throw new Exception("Your firstName is empty.");
		}

		if (StringUtils.isEmpty(lastName)) {
			throw new Exception("Your lastName is empty.");
		}

		return String.format("%s.%s@%s", firstName, lastName, makeDomain());
	}

	/**
	 * 
	 * 
	 * @param firstName
	 * @param lastName
	 * @param domain
	 * @return
	 * @throws Exception
	 */
	public static String makeEmail(String firstName, String lastName,
			String domain) throws Exception {
		if (!isDomainValid(domain)) {
			throw new Exception("Your domain is invalid.");
		}

		if (StringUtils.isEmpty(firstName)) {
			throw new Exception("Your firstName is empty.");
		}

		if (StringUtils.isEmpty(lastName)) {
			throw new Exception("Your lastName is empty.");
		}

		return String.format("%s.%s@%s", firstName, lastName, domain);
	}

	/**
	 * 
	 * @param domain
	 * @return
	 */
	public static boolean isDomainValid(String domain) {
		Matcher matcher = pattern.matcher(domain);
		return matcher.matches();
	}

	/**
	 * 
	 * @return
	 */
	public static String makeDomain() {
		int rnd = generator.nextInt(commonDomains.length);
		return commonDomains[rnd];
	}
}