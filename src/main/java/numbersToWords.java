import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class numbersToWords {

  public static String translateNumber(Integer userNumber) {
    HashMap<Integer, String> hm = new HashMap<Integer, String>();
    hm.put(1, "one");
    hm.put(2, "two");
    hm.put(3, "three");
    hm.put(4, "four");
    hm.put(5, "five");
    hm.put(6, "six");
    hm.put(7, "seven");
    hm.put(8, "eight");
    hm.put(9, "nine");
    hm.put(10, "ten");



    return "one";
  }

}
