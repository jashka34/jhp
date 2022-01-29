package jashka.jhp.controller;

import jashka.jhp.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  /**
   * @param name some name
   * @return return Greeting to user
   */
  @GetMapping("/greeting")
  public final Greeting greeting(final @RequestParam(value = "name", defaultValue = "World") String name) {
    final String greet = "Hello, %s!";

    return new Greeting(String.format(greet, name));
  }
}
