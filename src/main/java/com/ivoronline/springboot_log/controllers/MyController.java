package com.ivoronline.springboot_log.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  Logger log = LoggerFactory.getLogger(MyController.class);

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    log.info("Hello from Controller");
    return "Hello from Controller";
  }

}
