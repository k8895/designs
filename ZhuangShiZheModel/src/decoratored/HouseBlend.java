package decoratored;

import com.wjk.zsz.Beverage;

/**
 * 具体饮料类-被装饰者
 * 
 * @author asus
 *
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
