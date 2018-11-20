package org.mag;

import java.util.concurrent.atomic.AtomicLong;

import org.mag.model.Greet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeter {
	
	AtomicLong count= new AtomicLong();
	
	@RequestMapping("/greet")
	public Greet greeting(@RequestParam(value="name", defaultValue="World")String name) {
		return new Greet(count.incrementAndGet(),"Hello "+name);
	}

}
