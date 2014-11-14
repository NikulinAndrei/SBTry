package sbtry.greeting;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

  @RequestMapping("/web")
  public String greeting(
      @RequestParam(value="name", required=false, defaultValue="World")
      String name, Model model) {
    model.addAttribute("name", name);
    return "greeting/greeting";
  }
}