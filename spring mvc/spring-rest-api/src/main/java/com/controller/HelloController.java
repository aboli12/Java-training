package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController    // @Controller + @ResponseBody 
public class HelloController {

	@RequestMapping(value = "plain",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlainText() {
		return "<h2>Welcome to Spring boot with rest api in plain text format</h2>";
	}
	@RequestMapping(value = "html",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String sayPlainHtml() {
		return "<h2>Welcome to Spring boot with rest api in html format</h2>";
	}
	@RequestMapping(value = "xml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)
	public String sayPlainXML() {
		return "<h2>Welcome to Spring boot with rest api in xml format</h2>";
	}
}