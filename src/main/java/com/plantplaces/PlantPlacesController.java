package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//http://127.0.0.1:8080/start



/**
 * @author Administrator
 *
 */
@Controller
public class PlantPlacesController {

	
	@RequestMapping("/start")
	public String start() {
		return "start";
		
	}
	
	@RequestMapping("/")
	public String index() {
		return "start";
	}
}
