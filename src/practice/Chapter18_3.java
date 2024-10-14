package practice;

public class Chapter18_3 {
	public static void main(String[] args) {
		
		String mail = "\\d{3}-\\d{4}";
		String mail1 = "123-4567";
		String mail2 = "1234-567";
		System.out.println(mail1 + " " + mail1.matches(mail));//mail1がmailの条件に合致しているかどうか
		System.out.println(mail2 + " " + mail2.matches(mail));//mail2がmailの条件に合致しているかどうか
		
		String phone = "0[7-9]0-\\d{4}-\\d{4}";
		String phone1 = "080-8332-6893";
		String phone2 = "0742-55-8973";
		System.out.println(phone1 + " " + phone1.matches(phone));//phone1がphoneの条件に合致しているかどうか
		System.out.println(phone2 + " " + phone2.matches(phone));//phone2がphoneの条件に合致しているかどうか
		
		String time = "[0-2][0-3]:[0-5]\\d";
		String time1 = "23:59";
		String time2 = "23-59";
		System.out.println(time1 + " " + time1.matches(time));//time1がtimeの条件に合致しているかどうか
		System.out.println(time2 + " " + time2.matches(time));//time2がtimeの条件に合致しているかどうか
	}
}
