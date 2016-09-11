package decorator;

import com.wjk.zsz.Beverage;
import com.wjk.zsz.CondimentDrcorator;

/**
 * 具体调料-装饰者
 * 
 * @author asus
 *
 */
public class Whip extends CondimentDrcorator {

	Beverage beverage;

	// 把饮料当作构造器参数，在由构造器将此饮料记录在实例变量中
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
