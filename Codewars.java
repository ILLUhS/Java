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

// Number of People in the Bus

import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int s = stops.size();
    int h = 0;
    for(int i = 0; i < s; i++){
      h += (stops.get(i))[0] - (stops.get(i))[1];
    }
    return h;
  }
}