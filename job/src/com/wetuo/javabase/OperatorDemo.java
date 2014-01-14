package com.wetuo.javabase;

public class OperatorDemo {
	public int bitSet(int value, int position) {
		return value | (1 << (position - 1));  //按位或
	}

	public int bitZero(int value, int position) {
		return value & (~(1 << (position - 1))); //位取零
	}

	public int bitReverse(int value, int position) {
		return value ^ (1 << (position - 1));  //位反转
	}

	public void binaryOut(int value) {
		for (int i = 31; i >= 0; i--) {
			System.out.print((value >> i) & 1);
			if (i % 8 == 0 && i != 0)
				System.out.print(",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		OperatorDemo op = new OperatorDemo();
		op.binaryOut(15);
		System.out.println("位操作实例-----");
		int a = 13;
		System.out.print("操作前数据是："+a+" 二进制是：");
		op.binaryOut(a);
		System.out.print("按位或操作后：");
		op.binaryOut(op.bitSet(a, 3));
		System.out.print("按位取零操作后：");
		op.binaryOut(op.bitZero(a, 3));;
		System.out.print("按位取反操作后：");
		op.binaryOut(op.bitReverse(a, 4));;
	}
}
