package ch08;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OrderInfoTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String orderNum = "000"+scanner.nextInt();
		
		LocalDateTime now = LocalDateTime.now();
		String year = "" + now.getYear();
		String month = null;
		if (now.getMonthValue() < 10) {
			month = ""+0+now.getMonthValue();			
		}
		String day = null;
		if (now.getDayOfMonth() < 10) {
			day = ""+0+now.getDayOfMonth();			
		}
		String orderD = year+month+day;
		
		String hour = null;
		if (now.getHour() < 10) {
			hour = "" + 0 + now.getHour();
		};
		String min = null;
		if (now.getMinute() < 10) {
			min = "" + 0 + now.getMinute();
		} else {
			min = "" + now.getMinute();
		};
		String second = null;
		if (now.getSecond() < 10) {
			second = "" + 0 + now.getSecond();
		} else {
			second = "" + now.getSecond();
		};

		String orderT = hour + min + second;
		
		OrderInfo order3 = new OrderInfo(orderD+orderNum, "01023450001", "서울시 강남구 역삼동 111-333", orderD, orderT, "35000", orderNum);
		order3.showOrderInfo();
	}
}
