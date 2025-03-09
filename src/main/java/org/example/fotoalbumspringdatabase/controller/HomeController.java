package org.example.fotoalbumspringdatabase.controller;

import org.example.fotoalbumspringdatabase.repository.BridgeRepository;
import org.example.fotoalbumspringdatabase.repository.BridgeRepositoryDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @Autowired
  BridgeRepository bridgeRepository;

  @Autowired
  BridgeRepositoryDatabase bridgeRepositoryDatabase;

  @GetMapping("/")
  public String gethome(Model model) {
    System.out.println("gethome()");
    System.out.println(bridgeRepository.getAllBridges());
    model.addAttribute("bridgeList", bridgeRepositoryDatabase.getAllBridges());
    return "home";
  }
}
