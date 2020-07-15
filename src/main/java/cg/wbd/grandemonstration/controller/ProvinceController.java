package cg.wbd.grandemonstration.controller;

import cg.wbd.grandemonstration.model.Province;
import cg.wbd.grandemonstration.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("provinces")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> allProvinces() {
        return provinceService.findAll();
    }

    @GetMapping
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("province/list");
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createProvince() {
        ModelAndView modelAndView = new ModelAndView("province/create");
        return modelAndView;
    }

    @PostMapping("/create")
    public String updateProvince(Province province) {
        provinceService.save(province);
        return "redirect:/provinces";
    }
}
