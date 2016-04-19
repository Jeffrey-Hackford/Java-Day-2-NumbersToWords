import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class NumbersToWords {

  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put ("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      Integer inputtedNumber = Integer.parseInt(request.queryParams("number"));
      NumbersToWords myNumber = new NumbersToWords();
      String results = myNumber.translateNumber(inputtedNumber);

      model.put("results", results);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

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

    if (userNumber.equals(1)) {
      String result = "one";
      return result;
    }
      return "two";

  }

}
