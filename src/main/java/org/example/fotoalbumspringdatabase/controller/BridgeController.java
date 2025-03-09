package org.example.fotoalbumspringdatabase.controller;

import org.example.fotoalbumspringdatabase.model.Bridge;
import org.example.fotoalbumspringdatabase.repository.BridgeRepository;
import org.example.fotoalbumspringdatabase.repository.BridgeRepositoryDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BridgeController {
    @Autowired
    BridgeRepository bridgeRepository;

    @Autowired
    BridgeRepositoryDatabase bridgeRepositoryDatabase;

    @GetMapping("/bridge")
    public String showBridge(@RequestParam("name") String name, Model model) {
        System.out.println("showBridge " + name);
        Bridge bridge=bridgeRepositoryDatabase.getBridge(name);
        if(bridge!=null) {
            model.addAttribute("bridge", bridge);
        }
        System.out.println(bridge);
        return "bridge";
    }
}
