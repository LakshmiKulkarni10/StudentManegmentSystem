package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Marks;

@Repository
public interface MarksRepository extends JpaRepository<Marks, Integer>{

}
