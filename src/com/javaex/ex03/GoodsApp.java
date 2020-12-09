package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	ArrayList<Goods> gArr = new ArrayList<>();
    	
    	
       System.out.println("상품을 입력해주세요(종료 q)");
       
       Scanner sc = new Scanner(System.in);
       
       boolean run = true;
       
       while(run) {
       
    	   String str = sc.nextLine();
       
       
    	   if(str.equals("q")) {
	    	  System.out.println("[입력완료]");
	    	  System.out.println("=====================");
	    	  for(Goods goods : gArr) {
	    		  goods.showInfo();
	    		  
	    	  }
	    	 
	    	  int sumCount = 0;
	    	  for(int i =0;i<gArr.size();i++) {
	    		  int goodsCount = gArr.get(i).getCount();
	    		  sumCount+=goodsCount;
	    	  }
	    	  System.out.println("모든 상품의 갯수는 "+sumCount+"개입니다.");
	    	  
		      }
		      else {
		    	
		    	String[] strArr = str.split(",");
		    	
		    	
		    	gArr.add(new Goods(strArr[0], Integer.parseInt(strArr[1]) , Integer.parseInt(strArr[2])));
		  		
		  		
		      }
		      
		       }
		      
      
    }
    
 
    
    
}
