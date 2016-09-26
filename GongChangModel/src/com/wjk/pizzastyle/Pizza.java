package com.wjk.pizzastyle;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings=new ArrayList<String>();

	public void prepare(){
		System.out.println("׼����..."+name);
		System.out.println(dough+"--"+sauce);
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   "+toppings.get(i));
		}
	}
	
	public void bake(){
		System.out.println("�濾��...");
	}
	
	public void cut(){
		System.out.println("��Ƭ��...");
	}
	
	public void box(){
		System.out.println("�����...");
	}
	
	public String getName(){
		return name;
	}
	
}
