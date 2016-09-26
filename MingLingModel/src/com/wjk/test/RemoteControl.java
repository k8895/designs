package com.wjk.test;

import com.wjk.command.Command;
import com.wjk.command.NoCommand;

//遥控器--调用者
public class RemoteControl {

	public Command[] onCommands;
	public Command[] offCommands;
	//记录前一个命令
	public Command undoCommand;

	public RemoteControl() {
		// 实现7个开关命令
		onCommands = new Command[7];
		offCommands = new Command[7];

		// 不要每次都检查是否某个插槽都加载了命令，所以将每个插槽都预先
		// 指定个NoCommand对象，以便确定每个插槽永远都有对象
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		//初始并没有前一个命令
		undoCommand=noCommand;
	}

	// 参数：插槽位置，开的命令，关的命令
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommand=onCommands[slot];
	}

	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand=offCommands[slot];
	}

	public void undoButtonWasPressed(){
		undoCommand.undo();
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n----- Remote Control -----\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot" + i + "]"
					+ onCommands[i].getClass().getName() + "    "
					+ offCommands[i].getClass().getName() + "\n");
		}
		stringBuffer.append(undoCommand.getClass().getName());
		return stringBuffer.toString();
	}

}
