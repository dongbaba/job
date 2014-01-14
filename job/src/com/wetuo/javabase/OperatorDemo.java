package com.wetuo.javabase;

public class OperatorDemo {
	public int bitSet(int value, int position) {
		return value | (1 << (position - 1));  //��λ��
	}

	public int bitZero(int value, int position) {
		return value & (~(1 << (position - 1))); //λȡ��
	}

	public int bitReverse(int value, int position) {
		return value ^ (1 << (position - 1));  //λ��ת
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
		System.out.println("λ����ʵ��-----");
		int a = 13;
		System.out.print("����ǰ�����ǣ�"+a+" �������ǣ�");
		op.binaryOut(a);
		System.out.print("��λ�������");
		op.binaryOut(op.bitSet(a, 3));
		System.out.print("��λȡ�������");
		op.binaryOut(op.bitZero(a, 3));;
		System.out.print("��λȡ��������");
		op.binaryOut(op.bitReverse(a, 4));;
	}
}
