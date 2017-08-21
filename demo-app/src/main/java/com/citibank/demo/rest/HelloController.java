package com.citibank.demo.rest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController //tell class to return json/xml 
public class HelloController {
	@RequestMapping("/")
public String hello()
{
	return "hi there";

}
}
