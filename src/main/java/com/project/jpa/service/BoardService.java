package com.project.jpa.service;


import com.project.jpa.domain.BoardJpaRepository;
import com.project.jpa.dto.RequestBoardSaveDto;
import com.project.jpa.dto.ResponseBoardListDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardJpaRepository boaredJpaRepository;

    @Transactional
    public Long boardSave(RequestBoardSaveDto dto){
        return boaredJpaRepository.save(dto.toEntity()).getBoardPk();
    }

    @Transactional
    public List<ResponseBoardListDto> getBoardList(){

        return boaredJpaRepository.findAllDesc()
                .stream()
                .map(ResponseBoardListDto::new)
                .collect(Collectors.toList());
    }



}
