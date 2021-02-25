package com.project.jpa.controller;


import com.project.jpa.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;


    @GetMapping("/")
    public String goIndex(){

        return "index";
    }

    @GetMapping("/board")
    public String goBoard(Model model){
        model.addAttribute("htmlTitle", "글 쓰기");
        return "board-reg";
    }

}
