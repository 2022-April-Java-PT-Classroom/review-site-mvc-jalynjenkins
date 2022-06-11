package org.wecancodeit.reviewsitemvcjalynjenkins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ShoeController {

    @Resource
    private ShoeRepository shoeRepo;

    @RequestMapping("/shoes")
    public String findAllShoes(Model model) {
        model.addAttribute("shoesModel", shoeRepo.findAll());
        return "shoesTemplate";
    }

    @RequestMapping("/shoe")
    public String findOneShoe(@RequestParam(value ="id") Long id, Model model){
        model.addAttribute("shoeModel", shoeRepo.findOne(id));
        return "shoeTemplate";


    }
}
