package org.exam.study.Controller;

import lombok.RequiredArgsConstructor;
import org.exam.study.DTO.StudyDTO;
import org.exam.study.Service.StudyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class StudyController {
    //view(Model And View)와 service를 연계
    private final StudyService studyService;


    //목록보기
    @GetMapping(value = {"/","/study/list"})
    public String list() {
        return "study/list";
    }

    //삽입
    @GetMapping("/study/insert")
    public String insert() {
        //Controller -> html 이동
        return "study/insert";
    }

    @PostMapping("/study/insert")
    //(name 개수,......)->DTO나 Entity에 변수명을 참고해서, html에 name
    //개별변수 name= 변수명을 동일하게=> 그룹으로 받을 때 DTO
    //name에 이름과 변수명이 다르면 @RequestParam(name의 이름)
    public String insertProc(StudyDTO studyDTO) {
        //html->Controller
        //html에 name으로 선언된 변수가 있으면
        return "redirect:/study/list";
    }

    @GetMapping("/study/delete/{id}")
    public String deleteProc() {
        return "redirect:/study/list";
    }

}
