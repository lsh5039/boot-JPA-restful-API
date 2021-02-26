package com.project.jpa.dto;


import com.project.jpa.domain.Board;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class ResponseBoardListDto {
    private Long boardPk;
    private String title;
    private String content;
    private LocalDate mDt;

    public ResponseBoardListDto(Board entity){
        this.boardPk = entity.getBoardPk();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.mDt = entity.getMDt();
    }
}
