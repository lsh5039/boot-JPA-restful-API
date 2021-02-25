package com.project.jpa.dto;


import com.project.jpa.domain.Board;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@ToString
@Getter
@Setter
@NoArgsConstructor
public class RequestBoardSaveDto {



    @NotEmpty(message = "error : 제목을 입력하세요.")
    private String title;

    
    @NotEmpty(message = "error : 내용을 입력하세요.")
    private String content;



    public Board toEntity(){
        return Board.builder()
                .title(this.title)
                .content(this.content)
                .build();
    }

}
