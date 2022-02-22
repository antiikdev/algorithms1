package algos05.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import static algos05.Jono.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2022.02.22 09:00:17 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class JonoTest {



  // Generated by ComTest BEGIN
  /** testCountLongestLetterGroup18 */
  @Test
  public void testCountLongestLetterGroup18() {    // Jono: 18
    String s = "a"; 
    assertEquals("From: Jono line: 20", 1, countLongestLetterGroup(s)); 
    String s2 = "aaaabcd"; 
    assertEquals("From: Jono line: 22", 4, countLongestLetterGroup(s2)); 
    String s3 = "axboo"; 
    assertEquals("From: Jono line: 24", 2, countLongestLetterGroup(s3)); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testCountGroupsOfLetters51 */
  @Test
  public void testCountGroupsOfLetters51() {    // Jono: 51
    String p = "a"; 
    assertEquals("From: Jono line: 53", 1, countGroupsOfLetters(p)); 
    String s = "abba"; 
    assertEquals("From: Jono line: 55", 3, countGroupsOfLetters(s)); 
    String m = "aakkaacccpp"; 
    assertEquals("From: Jono line: 57", 5, countGroupsOfLetters(m)); 
  } // Generated by ComTest END
}