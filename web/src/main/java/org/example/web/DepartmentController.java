package org.example.web;

import org.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DepartmentController
{
  @Autowired
  private DepartmentService departmentService;

  @RequestMapping("/")
  @ResponseBody
  public String home()
  {
    departmentService.getAll();

    return "<!DOCTYPE html>"
        + "<html>"
        + "  <head>"
        + "    <title>Declarative transactions with Spring</title>"
        + "    <style>"
        + "      body, html { background:#EEE; color:#333; font-family:Arial; font-size:12px; height:100%; margin:0; padding:0; width:100%; }"
        + "      #container { background:#FFF; margin:0 30px; min-height:100%; padding:40px; }"
        + "    </style>"
        + "  </head>"
        + "  <body>"
        + "    <div id='container'>"
        + "      <h1>Declarative transactions with Spring</h1>"
        + "    </div>"
        + "  </body>"
        + "</html>";
  }
}
