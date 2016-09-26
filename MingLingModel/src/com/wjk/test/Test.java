package com.wjk.test;

import com.wjk.command.LightOffCommand;
import com.wjk.command.LightOnCommand;
import com.wjk.command.StereoOffCommand;
import com.wjk.command.StereoOnWithCDCommand;
import com.wjk.goods.Light;
import com.wjk.goods.Stereo;

public class Test {
	public static void main(String[] args) {
		//遥控器
		RemoteControl control=new RemoteControl();
		
		//将所有装置创建在合适的位置
		Light livingRoomLight=new Light("Living Room");
		Light kitchenLight=new Light("Kitchen");
		Stereo stereo=new Stereo("Living Room");
		
		//创建所有装置的开与关命令
		LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn=new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff=new LightOffCommand(kitchenLight);
		StereoOnWithCDCommand stereoOnWithCD=new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff=new StereoOffCommand(stereo);
		
		//命令加载到控制器
		control.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		control.setCommand(1, kitchenLightOn, kitchenLightOff);
		control.setCommand(2, stereoOnWithCD, stereoOff);
		
		System.out.println(control);
		
		//按开关
		control.onButtonWasPressed(0);
		control.offButtonWasPressed(0);
		control.undoButtonWasPressed();
		
		control.onButtonWasPressed(1);
		control.offButtonWasPressed(1);
		
		control.onButtonWasPressed(2);
		control.offButtonWasPressed(2);
		
	}
}
















