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

package fakedatamaker.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;

public class RandomFileUtil {
	/**
	 * 
	 * @param filePath
	 * @param encoding
	 * @return
	 */
	public static String getRandomFileLine(String filePath, String encoding) {
		String result = null;

		try {
			File file = new File(filePath);
			List<String> cityLines = FileUtils.readLines(file, encoding);
			int numberOfCities = cityLines.size();
			Random r = new Random();
			int cityLineNum = r.nextInt(numberOfCities);

			result = cityLines.get(cityLineNum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
}
