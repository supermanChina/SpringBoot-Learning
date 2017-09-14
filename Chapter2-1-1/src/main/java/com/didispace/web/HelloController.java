package com.didispace.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@RestController
public class HelloController {
	Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public String index() {
    	
        return "Hello World";
    }

}