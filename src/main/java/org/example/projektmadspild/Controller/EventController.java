/*package org.example.projektmadspild.Controller;

import org.example.projektmadspild.Model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EventController {

    @GetMapping("/about")
    public String about() {
        return "about"; // about.html
    }

    @GetMapping("/event")
    public String showEventForm() {
        return "event"; // event.html
    }

    @PostMapping("/event")
    public String submitEvent(@RequestParam String name, @RequestParam String email, @RequestParam String eventType, Event event, Model model) {
        Event newEvent = new Event(eventType, name, email);
        model.addAttribute("message", "tak for din tilmelding, " + name + "!");
        return "event";
    }
}
*/