package com.wetuo.javabase;


/*
 * ����100��1~6֮����������ͳ��1~6ÿ�����ֳ��ֵ�Ƶ��
 * */
public class CountFrequency {
	public static void main(String[] args) {
		int[] random = new int[100];
		int[] n = new int[6];
		int a;
		for(int i=0;i<100;i++) {
			a = (int) (Math.random()*6+1);
			random[i] = a;
			System.out.println(a);
			n[random[i]-1]++;   //��������
		}//end for
		for(int i=0;i<6;i++) {
			System.out.println("���� "+(i+1)+" ���ֵĸ���= "+(n[i]/100.0)*100+"%");
		}
	}//endmain
}
