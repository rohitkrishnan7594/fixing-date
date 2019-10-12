package com.app.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class Tester {

	public static void main(String[] args) {
		
		try {
			String row;
			File f = new File("C:\\Users\\Public\\Documents\\AndroMoney.csv");
			BufferedReader csvReader = new BufferedReader(new FileReader(f));
			while ((row = csvReader.readLine()) != null) {
				String s[] = row.split(",", 0);
				StringBuffer sb = new StringBuffer(s[0]);
				sb.insert(4, "-");
				sb.insert(7, "-");
				System.out.println(sb);
			}
			csvReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
