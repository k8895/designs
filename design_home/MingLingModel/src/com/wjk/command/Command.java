package com.wjk.command;

public interface Command {
	//执行
	public void execute();
	//撤销执行
	public void undo();
}
