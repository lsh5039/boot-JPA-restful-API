package com.project.jpa.service;


import com.project.jpa.domain.BoardJpaRepository;
import com.project.jpa.dto.RequestBoardSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardJpaRepository boaredJpaRepository;

    @Transactional
    public Long boardSave(RequestBoardSaveDto dto){
        return boaredJpaRepository.save(dto.toEntity()).getBoardPk();
    }


}
