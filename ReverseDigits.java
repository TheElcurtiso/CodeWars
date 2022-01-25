import java.util.ArrayList;

public class Kata {
  public static int[] digitize(long n) {
    // Code here
    ArrayList<Long> ReverseDigits = new ArrayList<Long>();
    while(n >= 0) {
      ReverseDigits.add(n % 10);
      n /= 10;
      if(n == 0) {
        n = -1;
      }
    }
    int[] ReverseArr = new int[ReverseDigits.size()];
    for(int i = 0; i < ReverseDigits.size(); i++) {
      ReverseArr[i] = ReverseDigits.get(i).intValue();
    }

    return ReverseArr;
  }
}
