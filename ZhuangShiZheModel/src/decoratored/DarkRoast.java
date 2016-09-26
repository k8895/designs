package decoratored;

import com.wjk.zsz.Beverage;

/**
 * ����������-��װ����
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
