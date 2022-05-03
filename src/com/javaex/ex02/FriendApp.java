package com.javaex.ex02;

import java.util.Scanner;
import java.util.ArrayList;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	
    	System.out.println("친구 3명 등록해 주세요.");
    	for (int i = 0; i < 3; i++) {
    		String name = sc.next();
    		String hp = sc.next();
    		String school = sc.next();
    		
    		fList.add(new Friend(name, hp, school));
    	}
    	
    	for (Friend f: fList) {
    		System.out.println(f.toString());
    	}
    	
    	sc.close();
    }
}
