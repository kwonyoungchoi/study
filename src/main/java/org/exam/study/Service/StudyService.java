package org.exam.study.Service;

import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.exam.study.DTO.StudyDTO;
import org.exam.study.entity.StudyEntity;
import org.exam.study.repository.StudyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional //일괄처리
public class StudyService {

    //서비스는 저장소(Repository)를 이용해서 처리하는게 주 목적(준비)
    private final StudyRepository studyRepository;
    private final ModelMapper modelMapper;

    //삽입
    public void insert(StudyDTO studyDTO) { //컨트롤러에서 전달받는 값
        StudyEntity studyEntity = modelMapper.map(studyDTO, StudyEntity.class);
        studyRepository.save(studyEntity);
    }
    //삭제
    public void delete(Long id) { // 삭제할 번호를 컨트롤러에서 전달받는다.
        studyRepository.deleteById(id);
    }

    //목록
    public List<StudyDTO> list() {
        List<StudyEntity> studyEntities = studyRepository.findAll();
        List<StudyDTO> studyDTOS = Arrays.asList(modelMapper.map(studyEntities, StudyDTO[].class));
        return studyDTOS;

    }

}
