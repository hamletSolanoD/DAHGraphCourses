package com.DAH.graphEducation.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class usersController {

    
  @GetMapping(path = "")
  public String showAddForm(Model model) {
    model.addAttribute("sor", "asd");
    return "portal/operations/sor/new";
  }

    
}
