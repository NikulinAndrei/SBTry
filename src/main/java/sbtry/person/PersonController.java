package sbtry.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 14.11.2014
 */
@Controller
@RequestMapping("/person")
public class PersonController {

  private static final Logger log = LoggerFactory.getLogger(PersonController.class);

  @RequestMapping(value = "/new", method = RequestMethod.GET)
  public String newPerson(){
    return "person/new";
  }



}
