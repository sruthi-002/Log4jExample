package com.example.demo.Controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LogController {
private static final Logger logger = Logger.getLogger(LogController.class);
	@GetMapping("/")
	public String index() {
		
		logger.debug("loading index page..");
		logger.info("INFO level message!!");
		logger.warn("WARN level message!!");
		logger.error("ERROR level message !!");
		logger.fatal("FATAL level message");
		logger.trace("TRACE level message..");
		logger.debug("Exit of index().");
		return "index";
	}
}
