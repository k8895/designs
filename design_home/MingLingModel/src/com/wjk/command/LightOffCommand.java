package com.wjk.command;

import com.wjk.goods.CeilingFan;
import com.wjk.goods.Light;

public class LightOffCommand implements Command{

	public Light light;
	
	public LightOffCommand(Light light) {
		this.light=light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
