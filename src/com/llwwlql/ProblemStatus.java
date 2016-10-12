package com.llwwlql;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemStatus {

	public  ProblemStatus(String Str) {
		Pattern p = Pattern.compile("<tr\\s*align(.*?)</tr>",
				Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(Str);
		ArrayList<String> linklist = new ArrayList<String>();
		while (m.find()) {
			String link = m.group();
			linklist.add(link);
		}
		String[] status = new String[linklist.size()];
		String[] information = new String[9];
		status[0] = linklist.get(0);
		System.out.println(status[0]);
	}
}
