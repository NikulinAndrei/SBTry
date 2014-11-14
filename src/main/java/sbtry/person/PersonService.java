package sbtry.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 14.11.2014
 */
@RestController
@RequestMapping("/person")
public class PersonService {

  private static final Logger log = LoggerFactory.getLogger(PersonService.class);

  @RequestMapping(value = "/create",
      method = RequestMethod.POST)
  public void insert(@RequestBody @Valid Person person) {
    log.debug("Inserting new {}", person);
  }


}
