import java.util.*;
public class FindOdd {
  public static int findIt(int[] a) {
    Hashtable<Integer, Integer> CountNumberFrequency = new Hashtable<Integer, Integer>();
    int odd = 0;
    for(int i = 0; i < a.length; i++) {
      if(CountNumberFrequency.containsKey(a[i])) {
        CountNumberFrequency.put(a[i], CountNumberFrequency.get(a[i]) + 1);
      }
      else {
        CountNumberFrequency.put(a[i], 1);
      }
    }
    for(Integer key:CountNumberFrequency.keySet()) {
      if(CountNumberFrequency.get(key) % 2 != 0) {
        odd = key;
        break;
      }
    }
    return odd;
  }
}
