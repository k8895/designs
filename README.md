
状态模式：允许对象在内部状态改变时改变他的行为，对象看起来好像修改了他的类  
         将状态封装成独立的类，并将动作委托到代表当前对象的状态，行为会随着内部状态改变而改变  
         通过状态类中的动作(重写方法)来实现状态类的切换。
	
	类图和策略模式一样
	策略模式需要客户指定context所要组合的对象
	状态模式随着程序进行，当前状态在对象集合中切换改变，来改变context的状态，客户对状态对象不了解
