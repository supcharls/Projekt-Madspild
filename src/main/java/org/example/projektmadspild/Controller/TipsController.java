package org.example.projektmadspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TipsController
{
    @GetMapping("/tips")
    public String visTips()
    {
        return "tips";
    }

}
