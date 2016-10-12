package com.llwwlql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.apache.http.client.ClientProtocolException;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws ClientProtocolException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws ClientProtocolException,
			IOException {
		// TODO Auto-generated method stub
		String[] User_id = { "Fox233", "Fox234", "Fox235" };
		CodeSubmit cs = new CodeSubmit("1166", "1");
		for (int i = 0; i < 1; i++) {
			Login login = new Login(User_id[i], "lduacm", "1166");
			String location;
			location = login.PostLogin();
			String fileName = "C:\\Appliciation\\D_Work\\Code\\Jave\\HDUoj\\1.txt";
			cs.setSource(fileName);
			cs.Submit(location);
			ProblemStatus ps = new ProblemStatus(cs.GetResult(login.getUser_id1()));
		}
	}
}
