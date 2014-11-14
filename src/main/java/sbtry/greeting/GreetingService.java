package sbtry.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 13.11.2014
 */
@RestController
@RequestMapping("/greeting")
public class GreetingService {
  private static final Logger log = LoggerFactory.getLogger(GreetingService.class);
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/say")
  public Greeting greeting(
      @RequestParam(value="name", defaultValue="World")
      String name) {
    log.debug("Say greeting to {}", name);
    return new Greeting(counter.incrementAndGet(),
        String.format(template, name));
  }

  @RequestMapping(value = "/reset", method = RequestMethod.POST)
  public void reset() {
    log.debug("Resetting counter");
    counter.set(0L);
  }
}
