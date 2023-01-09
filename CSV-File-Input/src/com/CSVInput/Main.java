package com.CSVInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void myReader(String file) {
		
		try {
			Scanner sc = new Scanner(new File(file));
			
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
	
		myReader("C:\\Users\\VIJAY\\Desktop\\DemoCSV\\prospectCSV.csv");
		
	}
}
