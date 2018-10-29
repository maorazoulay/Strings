class Main {
  public static String reverse(String s){
    String ans = "";
    for(int i = s.length()-1; i >= 0; i--){
      ans += s.charAt(i);
    }
    return ans;
  }

  public static void main(String[] args) {
    String test = "sseccus";
    System.out.println(reverse(test)); 
  }
}