package com.wjk.celue;

public class Price {
	// 持有一个具体的策略对象
	private MemberStrategy strategy;

	/**
	 * 构造函数，传入一个具体的策略对象
	 * 
	 * @param strategy
	 *            具体的策略对象
	 */
	public Price(MemberStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 计算图书的价格
	 * 
	 * @param booksPrice
	 *            图书的原价
	 * @return 计算出打折后的价格
	 */
	public double quote(double booksPrice) {
		return this.strategy.calcPrice(booksPrice);
	}
	
	
    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        MemberStrategy strategy = new AdvancedMemberStrategy();
        //创建环境
        Price price = new Price(strategy);
        //计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }

	
}












