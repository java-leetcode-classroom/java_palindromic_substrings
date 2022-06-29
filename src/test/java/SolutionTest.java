import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void countSubstringsExample1() {
    assertEquals(3, sol.countSubstrings("abc"));
  }
  @Test
  void countSubstringsExample2() {
    assertEquals(6, sol.countSubstrings("aaa"));
  }
}