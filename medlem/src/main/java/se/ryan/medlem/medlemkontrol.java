package se.ryan.medlem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class medlemkontrol {
    private List<MedlemType> medlemmar = new ArrayList<>();
    
    @GetMapping("/medlem")
    public String index(Model model) {
        model.addAttribute("medlemmar", medlemmar);
        model.addAttribute("nyMedlem", new MedlemType());
        return "medlem/index"; // Returnerar namn på Thymeleaf-mallen
    }
    @PostMapping("/medlem")
    public String addMedlem(@ModelAttribute MedlemType nyMedlem) {
        medlemmar.add(nyMedlem);
        return "redirect:/medlem"; 
        // Omdirigerar tillbaka till /medlem efter tillägg
    }
}
