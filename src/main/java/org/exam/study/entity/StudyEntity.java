package org.exam.study.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.lang.invoke.LambdaConversionException;
import java.security.PrivateKey;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
//자동날짜(3)
@EntityListeners(value = {AuditingEntityListener.class})
@Table(name="evaluation")
public class StudyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 50, nullable =false)
    private String userId;              //작성자
    @Column(length = 20, nullable =false)
    private String lectureName;         //강의명
    @Column(length = 20, nullable =false)
    private String professorName;       //강의교수
    @Column(length = 10, nullable =false)
    private String semesterDivide;      //수강학기
    @Column(length = 10, nullable =false)
    private String lectureDivide;       //강의구분
    @Column(length = 50, nullable =false)
    private String evaluationTitle;     //평가제목
    @Column(length = 255, nullable =false)
    private String evaluationContent;   //평가내용
    @Column(length = 2, nullable =false)
    private String totalScore;          //종합점수
    @Column(length = 2, nullable =false)
    private String creditScore;         //성적점수
    @Column(length = 2, nullable =false)
    private String comfortableScore;    //시설(환경)점수
    @Column(length = 2, nullable =false)
    private String lectureScore;        //강의점수
    private long likeCount;             //추천수

    //자동날짜(2)
    @LastModifiedDate
    private LocalDateTime modDate;      //수정날짜
    @CreatedDate
    private LocalDateTime regDate;      //생성날짜



}
