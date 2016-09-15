package com.wjk.goods;

//灯--接收者
public class Light {
	
	public Light(String str) {
		System.out.println(str+" Light");
	}

	public void on(){
		System.out.println("light on");
	}
	
	public void off(){
		System.out.println("light off");
	}
	
}
