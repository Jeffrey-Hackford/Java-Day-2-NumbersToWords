import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

  @Test
  public void inputSingleInterger_returnWord() {
    NumbersToWords testWord = new NumbersToWords();
    String expected = "one";
    assertEquals(expected, testWord.translateNumber(1));
  }
}
