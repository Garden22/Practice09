package com.javaex.ex03;

import java.util.Scanner;
import java.util.ArrayList;

public class GoodsApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList<Goods> gList = new ArrayList<Goods>();
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while (true) {
    		String name = sc.nextLine().replace("\n", "");
    		if (name.charAt(0) == 'q') {
    			System.out.println("[입력완료]");
    			System.out.println("==============================");
    			break;
    			
    		} else {
    			String[] info = name.split(",");
    			gList.add(new Goods(info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2])));
    		}
    	}
    	
    	for (Goods g: gList) {
    		System.out.println(g.toString());
    	}
    	System.out.println("모든 상품의 개수는 " + Goods.total + "개입니다.");
    	
    	sc.close();
    }
}
