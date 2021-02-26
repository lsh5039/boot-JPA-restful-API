package com.project.jpa.controller;


import com.project.jpa.dto.RequestBoardSaveDto;
import com.project.jpa.service.BoardService;
import lombok.RequiredArgsConstructor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardService boardService;


    private static final Logger logger = LogManager.getLogger(BoardApiController.class);

    @PostMapping("/board/api")
    public String BoardSave(@RequestBody @Valid RequestBoardSaveDto dto, BindingResult bindingResult) {

        logger.info("::bindingReuslt::::");
        logger.info(bindingResult.getAllErrors());


        String msg = "";
        if (bindingResult.hasErrors()) {
            List<ObjectError> list =  bindingResult.getAllErrors();
                for(ObjectError e : list) {
                    msg += e.getDefaultMessage()+"\n";
                }
                logger.info("msg ::"+msg);

                return msg;
            };

        return String.valueOf(boardService.boardSave(dto));
    }


}
