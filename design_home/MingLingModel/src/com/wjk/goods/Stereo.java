package com.wjk.goods;

//接收者
public class Stereo {

	public Stereo(String str) {
		System.out.println(str+" Stereo");
	}
	
	public void on(){
		System.out.println("Stereo on");
	}
	
	public void off(){
		System.out.println("Stereo off");
	}
	
	public void setCD(){
		System.out.println("Stereo setCD"); 
	}
	
	public void setVolume(){
		System.out.println("Stereo setVolume");
	}
	
}
