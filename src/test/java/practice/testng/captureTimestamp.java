package practice.testng;

import java.util.Date;

public class captureTimestamp {
	public static void main(String args[]) {

		String time = new Date().toString().replace(" ", "_").replace(":","_");
		System.out.println(time);
	}

}