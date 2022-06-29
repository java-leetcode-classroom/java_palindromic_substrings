public class Solution {
  public int countSubstrings(String s) {
    int sLen = s.length();
    int count = 0;
    for (int idx =0; idx < sLen; idx++) {
      count += countPalindromeSub(s, idx, idx);
      count += countPalindromeSub(s, idx, idx+1);
    }
    return count;
  }
  public int countPalindromeSub(String s, int startLeft, int startRight) {
    int sLen = s.length();
    int left = startLeft;
    int right = startRight;
    int count = 0;
    while(left >= 0 && right < sLen && s.charAt(left) == s.charAt(right) ) {
      count++;
      left--;
      right++;
    }
    return count;
  }
}
