package com.MapMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class user {
	@RequestMapping(value="map", method = RequestMethod.GET)
	public ModelAndView map() {
		ModelAndView mView = new ModelAndView("user/map");
		return mView;
	}
}
