package se.ryan.medlem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class MedlemController {
    private List<MedlemType> medlemmar = new ArrayList<>();
    
    @GetMapping("/hemsida")
    public String hemsida(){
        return "hemsida"; // Visar hemsida.html
    }
    @GetMapping("/adda")
    public String addaMedlem(Model model){
        model.addAttribute("nyMedlem", new MedlemType());
        return "addamedlem"; // Visar addamedlem.html
    }
    @PostMapping("/adda")
    public String sparaMedlem(@ModelAttribute MedlemType nyMedlem) {
        medlemmar.add(nyMedlem);
        return "redirect:/medlem"; // Omdirigerar till /medlem efter sparande
    }
    @GetMapping("/medlem")
    public String medlem(Model model) {
        model.addAttribute("medlemmar", medlemmar);
        return "medlemmar"; // Visar medlemmar.html
    }
    @PostMapping("/radera/{index}")
    public String raderaMedlem(@PathVariable int index) {
        if (index >= 0 && index < medlemmar.size()) {
            medlemmar.remove(index);
        }
        return "redirect:/medlem"; // Omdirigerar tillbaka till /medlem efter radering
    }
}
