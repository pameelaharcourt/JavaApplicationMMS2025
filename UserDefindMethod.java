public class UserDefindMethod{
	public static String userName(String name) {
		
		return name;
	}
	public static int checkAge(int age) {
		if(age >= 18) {
			System.out.println(UserDefindMethod.userName("John Williams ") + "You are an adult");
		}
		else {
			System.out.println(UserDefindMethod.userName("John Williams ") + "You are an adult");
		}
		return age;
		
	}
	public static void main (String[] args) {
		System.out.println(UserDefindMethod.checkAge(25));
	}
}