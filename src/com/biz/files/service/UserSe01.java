package com.biz.files.service;

import java.util.*;

import com.biz.files.vo.*;

public class UserSe01 {
	List<UserVO> userList;
	
	public UserSe01() {
		userList = new ArrayList();
		
		
	}

	
	public void makeId() {
		for (int i = 0; i < 10; i++) {
			
			// 10개의 리스트에 담긴 vo는 항상
			// 새로 생성을 해줘야 한다.
			UserVO vo = new UserVO();
			int num = (int) (Math.random() * (200 - 100 + 1)) + 100;
			vo.setStrId(String.valueOf(num));
			userList.add(vo);
		}
//		TreeSet<UserVO> tree = new TreeSet(userList);
//		userList = new ArrayList(tree);
	}
	
	public void view() {
		for(UserVO vo : userList) {
			System.out.println(vo);
		}
	}

}
