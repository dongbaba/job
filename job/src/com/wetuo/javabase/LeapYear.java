package com.wetuo.javabase;

/**
 * 控制塔输入一个年约份，判断对应的这个月有多少天 分析：1.要判断这一年是不是闰年 2.要判断这个月份
 * 判断闰年的规则是：四年一闰，百年不闰，四百年再闰
 * 闰年的2月是29天   非闰年的2月是28天
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
