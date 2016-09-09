package com.wjk.celue;

public class Price {
	// ����һ������Ĳ��Զ���
	private MemberStrategy strategy;

	/**
	 * ���캯��������һ������Ĳ��Զ���
	 * 
	 * @param strategy
	 *            ����Ĳ��Զ���
	 */
	public Price(MemberStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * ����ͼ��ļ۸�
	 * 
	 * @param booksPrice
	 *            ͼ���ԭ��
	 * @return ��������ۺ�ļ۸�
	 */
	public double quote(double booksPrice) {
		return this.strategy.calcPrice(booksPrice);
	}
	
	
    public static void main(String[] args) {
        //ѡ�񲢴�����Ҫʹ�õĲ��Զ���
        MemberStrategy strategy = new AdvancedMemberStrategy();
        //��������
        Price price = new Price(strategy);
        //����۸�
        double quote = price.quote(300);
        System.out.println("ͼ������ռ۸�Ϊ��" + quote);
    }

	
}












