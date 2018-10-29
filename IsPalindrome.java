class Main { 
	public static boolean isPalindrome(String s){
		String part1 = "";
		String part2 = "";
		for(int i = 0; i < s.length()/2; i++){
			part1 += s.charAt(i);
			part2 += s.charAt(s.length()-i-1);
		}
		return part1.equals(part2);
	} 
  public static void main(String[] args) {
		String s = "kayak";
		if(isPalindrome(s))
  		System.out.println("It is!");
		else	
			System.out.println("Nope!");
  }
}