package org.exam.study.repository;

import org.exam.study.entity.StudyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudyRepository extends JpaRepository<StudyEntity, Long> {
    //제목, 내용, 강사명으로 검색을 추가
    
    //강의명으로 검색
    @Query("SELECT u FROM StudyEntity u WHERE u.lectureName like %:lecture%")
    Page<StudyEntity> searchLectureName(String lecture, Pageable pageable);

    //평가명으로 검색
    Page<StudyEntity> findByEvaluationTitleContaining(String evaluationtitle, Pageable pageable);

}
