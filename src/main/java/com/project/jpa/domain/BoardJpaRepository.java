package com.project.jpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BoardJpaRepository extends JpaRepository<Board, Long>{

}
