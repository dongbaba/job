package com.wetuo.javabase;

/*public class SingletonDemo {
	private static SingletonDemo instance = new SingletonDemo();
	private SingletonDemo() {}
	
	public static SingletonDemo getInstance() {
		return instance;
	}//充血模式
	
}
*/
//方法二
public class SingletonDemo {
	private static SingletonDemo instance = null;
	private SingletonDemo() {}
	
	public static synchronized SingletonDemo getInstance() {//保证只new一次
		if(null==instance)
			return new SingletonDemo();
		else 
			return instance;
	}//饥饿模式
	
}
