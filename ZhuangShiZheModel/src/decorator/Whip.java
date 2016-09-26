package decorator;

import com.wjk.zsz.Beverage;
import com.wjk.zsz.CondimentDrcorator;

/**
 * �������-װ����
 * 
 * @author asus
 *
 */
public class Whip extends CondimentDrcorator {

	Beverage beverage;

	// �����ϵ������������������ɹ������������ϼ�¼��ʵ��������
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
