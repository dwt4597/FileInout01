package com.biz.files.service;

import java.io.*;
import java.util.*;

public class UserSe05 {
	List<String> strList;
	String strFileName;
	String name = "src/우리말이름.txt";;
	FileReader fr;
	BufferedReader buffer;

	public UserSe05() {

	}

	public UserSe05(String strFileName) {
		this.strFileName = strFileName;
		strList = new ArrayList();

	}

	public void readFile() {
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
			while (true) {
				
				String lines = buffer.readLine();
			
				// 먼저 EOF를 검사하고
				if (lines == null) {
					break;
				}	
				String[] liness = lines.split(":");
				// 통과되면 나머지 수행
				//for(String s : liness) {
					strList.add(liness[0]);
				//}
				
			}
			System.out.println(strList);
			
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
