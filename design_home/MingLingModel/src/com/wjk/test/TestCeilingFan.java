package com.wjk.test;

import com.wjk.command.CeilingFanHighCommand;
import com.wjk.command.CeilingFanMediumCommand;
import com.wjk.command.CeilingFanOffCommand;
import com.wjk.goods.CeilingFan;

public class TestCeilingFan {

	public static void main(String[] args) {
		RemoteControl control=new RemoteControl();
		
		CeilingFan ceilingFan=new CeilingFan("Linving Room");
		CeilingFanHighCommand highCommand=new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand mediumCommand=new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand offCommand=new CeilingFanOffCommand(ceilingFan);
		
		control.setCommand(0, mediumCommand, offCommand);
		control.setCommand(1, highCommand, offCommand);
		
		control.onButtonWasPressed(0);
		control.offButtonWasPressed(0);
//		System.out.println(control);
		control.undoButtonWasPressed();
		
		control.onButtonWasPressed(1);
//		System.out.println(control);
		control.undoButtonWasPressed();
		
	}
	
}
