package com.coforge.prog;

import java.util.Scanner;

public class MainName {
	
	static Namer namer = new Namer();
	static NameFactory nfactory = new NameFactory();
	static String sFirstName, sLastName,entryField;
	static Scanner obj = new Scanner(System.in);
	
	public static void main(String[] args) {
		entryField = obj.next();
		computeName();
	}
	
	private static void computeName() {
		namer = nfactory.getNamer(entryField);
		sFirstName = namer.getFirst();
		sLastName = namer.getLast();
	}

}
