package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    ArrayList<Friend> fArr = new ArrayList<>();
     	
    Friend f1 = new Friend();
    Friend f2 = new Friend();
    Friend f3 = new Friend();
    
    fArr.add(f1);
    fArr.add(f2);
    fArr.add(f3);
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("친구 3명 등록해주세요");
	
    
	for(int i=0;i<3;i++) {
		String str = sc.nextLine();
		
		String[] strArr = str.split(" ");
		fArr.get(i).setName(strArr[0]);
		fArr.get(i).setHp(strArr[1]);
		fArr.get(i).setSchool(strArr[2]);
		
	}
	
	
	for(Friend f : fArr) {
		f.showInfo();
	}
	
	
    	
    }

}
