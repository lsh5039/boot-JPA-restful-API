package com.project.jpa.controller;


import com.project.jpa.dto.RequestBoardSaveDto;
import com.project.jpa.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardService boardService;

    @PostMapping("/board/api")
    public Long BoardSave(@RequestBody RequestBoardSaveDto dto){
        


        return boardService.boardSave(dto);
    }


}
