package decoratored;

import com.wjk.zsz.Beverage;

/**
 * 具体饮料类-被装饰者
 * 
 * @author asus
 *
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
