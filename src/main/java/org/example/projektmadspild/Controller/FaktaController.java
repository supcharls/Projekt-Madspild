package org.example.projektmadspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Fortæller Spring boot at denne klasse skal håndtere web anmodninger
public class FaktaController
{
    @GetMapping("/fakta") // Fanger "get-requests" til stien "/fakta"
    public String visFakta()
    {
        return "fakta"; // returnerer navnet på html filen - Spring leder altså efter "fakta.html" i vores template mappe
    }

}
