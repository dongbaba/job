package com.wetuo.javabase;

/*public class SingletonDemo {
	private static SingletonDemo instance = new SingletonDemo();
	private SingletonDemo() {}
	
	public static SingletonDemo getInstance() {
		return instance;
	}//��Ѫģʽ
	
}
*/
//������
public class SingletonDemo {
	private static SingletonDemo instance = null;
	private SingletonDemo() {}
	
	public static synchronized SingletonDemo getInstance() {//��ֻ֤newһ��
		if(null==instance)
			return new SingletonDemo();
		else 
			return instance;
	}//����ģʽ
	
}
