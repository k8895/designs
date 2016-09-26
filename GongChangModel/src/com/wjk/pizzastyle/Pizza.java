package com.wjk.pizzastyle;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings=new ArrayList<String>();

	public void prepare(){
		System.out.println("准备中..."+name);
		System.out.println(dough+"--"+sauce);
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   "+toppings.get(i));
		}
	}
	
	public void bake(){
		System.out.println("烘烤中...");
	}
	
	public void cut(){
		System.out.println("切片中...");
	}
	
	public void box(){
		System.out.println("打包中...");
	}
	
	public String getName(){
		return name;
	}
	
}
