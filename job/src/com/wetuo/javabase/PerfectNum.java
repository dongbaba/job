package com.wetuo.javabase;
/*
 * ��������������������֮�͵����䱾��
 * */
public class PerfectNum {
	public static void main(String[] args) {
		for(int i=1;i<1000;i++) {
			int sum= 0;
			//ѭ�������ӣ����ۼ�
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			//�ж�����֮���Ƿ���ڱ��������������
			if(sum==i) {
				System.out.print(sum+" ");
			}
		}
	}
}
