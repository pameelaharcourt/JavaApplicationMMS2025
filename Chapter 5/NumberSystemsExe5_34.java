public class NumberSystemsExe5_34{
	
	public static void main(String[] args) {
		
		System.out.println("Dec\tBinary\tOctal\tHex");
		
		for(int i = 1; i <= 256; i++){
			System.out.printf("%d\t%s\t%s%n",
			i,
			Integer.toBinaryString(i),
			Integer.toOctalString(i),
			Integer.toHexString(i));
			
		}
	}
}