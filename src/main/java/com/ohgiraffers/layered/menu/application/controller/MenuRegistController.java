package com.ohgiraffers.layered.menu.application.controller;

import com.ohgiraffers.layered.menu.application.dto.RegistMenuInfoDTO;
import com.ohgiraffers.layered.menu.application.service.RegistNewMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("menu")
public class MenuRegistController {

    private final RegistNewMenuService registNewMenuService;
    @Autowired
    public MenuRegistController(RegistNewMenuService registNewMenuService) {
        this.registNewMenuService = registNewMenuService;
    }

    @PostMapping("regist")
    public ModelAndView registNewMenu(ModelAndView mv, RegistMenuInfoDTO menuInfo) {

        registNewMenuService.registNewMenu(menuInfo);

        return mv;
    }
}
