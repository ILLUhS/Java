// Sum of Digits / Digital Root

public class DRoot {
  public static int digital_root(int n) {
    String str = String.valueOf(n);
    int sum = 0;
    if(str.length() > 1) {
      for(int i = 0; i < str.length(); i++){
        sum += Character.getNumericValue(str.charAt(i));
      }
      sum = DRoot.digital_root(sum);
    }
    else sum = n;
    return sum;
  }
}