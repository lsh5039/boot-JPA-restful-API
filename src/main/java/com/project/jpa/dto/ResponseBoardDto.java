package com.project.jpa.dto;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseBoardDto {

    private String title;
    private String content;

}
