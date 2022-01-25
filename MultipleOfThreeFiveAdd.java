public class Solution {

  public int solution(int number) {
    int multipleOfThree = 3, multipleOfFive = 5, TotalThrees = 0, TotalFives = 0;
    while(number > multipleOfThree && number > 0) {
      if(!(multipleOfThree % 5 == 0))
      {
        TotalThrees += multipleOfThree;
      }
      if (number > multipleOfFive) {
        TotalFives += multipleOfFive;
        multipleOfFive += 5;
      }
      multipleOfThree += 3;
    }
    return TotalThrees + TotalFives;
  }
}
