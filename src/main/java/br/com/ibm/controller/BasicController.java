package br.com.ibm.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ibm.model.service.AppService;

@Controller
public class BasicController {

	private static int counter = 0;
	private static final String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BasicController.class);

	@Autowired
	private AppService appService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String request1(ModelMap model) {

		model.addAttribute("message", "Server response 1");
		model.addAttribute("counter", ++counter);
		logger.debug("[request1] counter : {}", counter);

		logger.info(appService.doSomething());

		return VIEW_INDEX;
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String request2(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", "Server response 2 mapping to /" + name);
		model.addAttribute("counter", ++counter);
		logger.debug("[request2] counter : {}", counter);

		logger.info(appService.doSomething());

		return VIEW_INDEX;
	}

}
