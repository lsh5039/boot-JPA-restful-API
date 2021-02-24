package com.project.jpa.dto;


import com.project.jpa.domain.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestBoardSaveDto {

    private String title;
    private String content;



    public Board toEntity(){
        return Board.builder()
                .title(title)
                .content(content)
                .build();
    }

}
