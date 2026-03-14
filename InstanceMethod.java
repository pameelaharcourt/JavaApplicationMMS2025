public class InstanceMethod{
	public static void main(String[] args) {
		InstanceMethod im = new InstanceMethod(); 
		
		System.out.println(im.name("Pameela Harcourt ") + "is saying");
		im.greetings();
		// im means InstanceMethod
	}
	
	public void greetings() {
		int i = 1;
		while (i <= 10) {
			System.out.printf("%d Good Moring Class%n",i);
			i++;
		}
	}
	public String name(String fullName) {
		return fullName;
	}
}