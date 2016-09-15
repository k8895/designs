package com.wjk.command;

import com.wjk.goods.CeilingFan;

public class CeilingFanMediumCommand implements Command{

	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan=ceilingFan;
	}
	
	@Override
	public void execute() {
		//改变速度前，先记录当前速度
		prevSpeed=ceilingFan.getSpeed();
		//改变速度
		ceilingFan.medium();
	}

	@Override
	public void undo() {
		switch (prevSpeed) {
		case CeilingFan.HIGH:
			ceilingFan.high();
			break;
		case CeilingFan.MEDIUM:
			ceilingFan.medium();
			break;
		case CeilingFan.LOW:
			ceilingFan.low();
			break;
		case CeilingFan.OFF:
			ceilingFan.off();
			break;
		default:
			break;
		}
	}

}
