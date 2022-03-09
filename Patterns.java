class Patterns{
	public static void main(String[] args) {
		
		for(int i = 0; i< 1000; i++) {
			if(i%2 == 0) {
				System.out.print("");
			}
			if(i%3 == 0) {
				System.out.print("..-....-../-.....--/-.-..-..-.--.-....-.--.");
			}
			if(i%3 == 0) {
				System.out.print("-.-..--./-.-----..-/");
			}
		}
	}
}