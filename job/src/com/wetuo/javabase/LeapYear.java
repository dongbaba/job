package com.wetuo.javabase;

/**
 * ����������һ����Լ�ݣ��ж϶�Ӧ��������ж����� ������1.Ҫ�ж���һ���ǲ������� 2.Ҫ�ж�����·�
 * �ж�����Ĺ����ǣ�����һ�򣬰��겻���İ�������
 * �����2����29��   �������2����28��
 * */
public class LeapYear {
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int days = 0;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if((year%4 ==0&&year%100!=0)||(year%400==0)) {
				days = 29;
				
			} else {
				days = 28;
			}
			break;
				
		}
		System.out.println(year+"-"+month+" has "+days+" days");
	}
}
