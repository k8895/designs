package com.wjk.command;

import com.wjk.goods.Stereo;

public class StereoOnWithCDCommand implements Command{

	public Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo=stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
