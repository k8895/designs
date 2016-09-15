package com.wjk.command;

import com.wjk.goods.Stereo;

public class StereoOffCommand implements Command{

	public Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo=stereo;
	}
	
	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
