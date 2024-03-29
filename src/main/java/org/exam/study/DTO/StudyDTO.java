package org.exam.study.DTO;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="evaluation")
public class StudyDTO {

    @Id
    private String userId;              //작성자
    @NotEmpty(message = "생략이 불가능합니다.")
    private String lectureName;         //강의명
    @NotEmpty(message = "생략이 불가능합니다.")
    private String professorName;       //강의교수명
    private String lectureYear;         //수강년도
    private String semesterDivide;      //수강학기
    private String lectureDivide;       //강의구분
    @NotEmpty(message = "생략이 불가능합니다.")
    private String evaluationTitle;     //평가제목
    @NotEmpty(message = "생략이 불가능합니다.")
    private String evaluationContent;   //평가내용
    private String totalScore;          //종합점수
    private String creditScore;         //성적점수
    private String comfortableScore;    //시설(환경)점수
    private String lectureScore;        //강의점수
    private long likeCount;             //추천수

    private LocalDateTime modDate;      //수정날짜
    private LocalDateTime regDate;      //생성날짜

}
