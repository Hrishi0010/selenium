package com.shopperStck.GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class jvUitility {

	public int rndomNumber() {
		Random r = new Random();
		int number = r.nextInt(2000);
//		System.out.println(number);
		return number;
	}

	public String systemDate() {
		String dte = LocalDate.now().toString().replaceAll("[^0-9]", "");
//		System.out.println(dte);
		return dte;

	}

//public static void main(String[] args) {	
	public String systemDte_time() {
		String dteTime = LocalDateTime.now().toString().replaceAll("[^0-9]", "");
		return dteTime;
//		System.out.println(dteTime);
	}
}
