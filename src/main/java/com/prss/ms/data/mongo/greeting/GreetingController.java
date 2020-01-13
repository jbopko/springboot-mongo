package com.prss.ms.data.mongo.greeting;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * GET on the root path will respond with a greeting.
     * 
     * @param name	Substituted into the greeting template
     * @return
     */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
      return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}