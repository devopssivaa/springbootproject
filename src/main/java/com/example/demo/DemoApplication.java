package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/")
	public String helloWorld() {
		return "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "    <head>\r\n"
				+ "        <style>\r\n"
				+ "            @media all {\r\n"
				+ "                body\r\n"
				+ "                {\r\n"
				+ "                    text-align:left;\r\n"
				+ "                }\r\n"
				+ "                p.paragrpahs\r\n"
				+ "                {\r\n"
				+ "                    text-align:center;\r\n"
				+ "                    font-family:Arial,Helvetica,sans-serif;\r\n"
				+ "                    font-size:32px;\r\n"
				+ "                    font-weight:bold;\r\n"
				+ "                    vertical-align: center;\r\n"
				+ "                }\r\n"
				+ "                .break_here\r\n"
				+ "                {\r\n"
				+ "                    page-break-before:always;\r\n"
				+ "                }\r\n"
				+ "            }\r\n"
				+ "        </style>\r\n"
				+ "    </head>\r\n"
				+ "\r\n"
				+ "    <body>\r\n"
				+ "        <p class=\"break_here\"><p class=\"paragrpahs\"><h1>Hello World! From STS 4!</h1></p><p class=\"break_here\">\r\n"
				+ "    </body>\r\n"
				+ "</html>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "";
	}


}
