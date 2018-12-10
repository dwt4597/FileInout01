package com.biz.files.service;

import java.io.*;
import java.util.*;

import com.biz.files.vo.*;

public class UserSe07 {
	List<UserVO> userList;
	String strFileName;
	String name = "src/우리말이름.txt";;
	FileReader fr;
	BufferedReader buffer;

	public UserSe07() {

	}

	public UserSe07(String strFileName) {
		this.strFileName = strFileName;
		userList = new ArrayList();
	}

	public int makeId() {
		int i = (int)(Math.random()*(200-100+1))+100;
		return i;
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
				UserVO vo = new UserVO();
				vo.setStrName(liness[0]);
				vo.setStrId(String.valueOf(makeId()));
				// 통과되면 나머지 수행
				// for(String s : liness) {
				userList.add(vo);
				System.out.println(vo);
				// }
			}
//			System.out.println(userList);

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
