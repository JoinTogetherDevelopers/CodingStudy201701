package jmbae.Feb05;

import org.junit.Assert;

import java.util.HashMap;

/**
 * Created by jmbae on 04/02/2017.
 */
public class RepetitionSubstring {
	public static boolean checkString(String str, int K) {
		if(str.length() % K != 0)
			return false;
		HashMap<String,Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i+=K) {
			String key = str.substring(i,i+K);
			Integer value = map.getOrDefault(key, 0);
			map.put(key, value+1);
		}
		if(map.size() == 1)
			return true;
		if(map.size() > 2)
			return false;
		int value = map.entrySet().iterator().next().getValue();
		if(value == (str.length()/K -1) || value == 1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		String example1 = "bdac";
		Assert.assertTrue(checkString(example1, 2));

		String example2 = "abcbedabcabc";
		Assert.assertTrue(checkString(example2, 3));

		String example3 = "bcacc";
		Assert.assertFalse(checkString(example3, 3));

		String example4 = "bcacbcac";
		Assert.assertFalse(checkString(example4, 2));

		String example5 = "bcdbcdabcedcbcd";
		Assert.assertFalse(checkString(example5, 3));
	}
}
