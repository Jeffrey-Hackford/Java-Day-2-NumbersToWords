import org.junit.*;
import static org.junit.Assert.*;

public class numbersToWordsTest {

  @Test
  public void inputSingleInterger_returnWord() {
    numbersToWords testWord = new numbersToWords();
    String expected = "one";
    assertEquals(expected, testWord.translateNumber(1));
  }
}
