package decoratored;

import com.wjk.zsz.Beverage;

/**
 * 具体饮料类-被装饰者
 * 
 * @author asus
 *
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		return 1.51;
	}

}
