package org.example.projektmadspild.Controller;

import org.example.projektmadspild.Model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EventController {


    @GetMapping("/Event")
    public String showEventForm() {
        return "Event"; // event.html
    }

    @PostMapping("/Event")
    public String submitEvent(@RequestParam String name, @RequestParam String email, @RequestParam String eventType, Event event, Model model) {
        Event newEvent = new Event(eventType, name, email);
        model.addAttribute("message", "tak for din tilmelding, " + name + "!");
        return "Event";
    }
}
