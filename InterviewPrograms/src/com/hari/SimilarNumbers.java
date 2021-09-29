package com.hari;

import java.util.HashSet;
import java.util.Set;

public class SimilarNumbers {
	static String strPerm = "";

	private static boolean bSimilar(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < a.length(); i++) {
			set.add(a.charAt(i));
		}
		for (int i = 0; i < b.length(); i++) {
			if (!set.contains(b.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static String getPermutn(String str, String ans) {
		if (str.length() == 0) {
			String res = ans + " ";
			if (res.charAt(0) != '0') {
				strPerm += res;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String res = str.substring(0, i) + str.substring(i + 1);
			getPermutn(res, ans + ch);
		}
		return strPerm;
	}

	public static void main(String[] args) {
		String a = "1100";
		String b = "1001";
		boolean bComp = bSimilar(a, b);
		if (bComp) {
			String permStr = getPermutn(a, "");
			System.out.println("Similar, total number of similar numbers to a = " + permStr);
		} else {
			String permStr = getPermutn(b, "");
			System.out.println("Not Similar , total number of similar numbers to b = " + permStr);
		}
	}
}