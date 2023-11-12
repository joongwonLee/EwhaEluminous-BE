package com.eluminous.backend.domain.thesis.dao;

import com.eluminous.backend.domain.thesis.dto.Reference;
import com.eluminous.backend.domain.thesis.dto.ThesisDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.sql.Array;
import java.sql.Ref;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ThesisRepositoryImpl implements ThesisRepository {

    List<ThesisDto> thesisList = Arrays.asList(
            new ThesisDto(1, "Battery", "임시 논문 제목 1", new String[]{"저서1", "저서2"},
                    "임시 초록입니다.", new String[]{"임시 목차 1", "임시 목차 2"}, "text.txt",
                    new Reference[]{
                            new Reference("참고문헌 1", "임시 url1"),
                            new Reference("참고문헌 2", "임시 url2")
            }),
            new ThesisDto(2, "SemiConductor", "임시 논문 제목 2", new String[]{"저서1", "저서2"},
                    "임시 초록입니다.", new String[]{"임시 목차 1", "임시 목차 2"}, "text.txt",
                    new Reference[]{
                            new Reference("참고문헌 1", "임시 url1"),
                            new Reference("참고문헌 2", "임시 url2")
            }),
            new ThesisDto(3, "Bio", "임시 논문 제목 2", new String[]{"저서1", "저서2"},
                    "임시 초록입니다.", new String[]{"임시 목차 1", "임시 목차 2"}, "text.txt",
                    new Reference[]{
                            new Reference("참고문헌 1", "임시 url1"),
                            new Reference("참고문헌 2", "임시 url2")
            }),
            new ThesisDto(4, "ProcessDisign", "임시 논문 제목 2", new String[]{"저서1", "저서2"},
                    "임시 초록입니다.", new String[]{"임시 목차 1", "임시 목차 2"}, "text.txt",
                    new Reference[]{
                            new Reference("참고문헌 1", "임시 url1"),
                            new Reference("참고문헌 2", "임시 url2")
            }),
            new ThesisDto(5, "NewMaterials", "임시 논문 제목 2", new String[]{"저서1", "저서2"},
                    "임시 초록입니다.", new String[]{"임시 목차 1", "임시 목차 2"}, "text.txt",
                    new Reference[]{
                            new Reference("참고문헌 1", "임시 url1"),
                            new Reference("참고문헌 2", "임시 url2")
            })

    );


    @Override
    public List<ThesisDto> selectAll() throws Exception {
        return thesisList;
    }


    @Override
    public List<ThesisDto> selectByCategory(String category) throws Exception {

        List<ThesisDto> resultList = new ArrayList<>();

        for(ThesisDto thesis: thesisList) {
            if(thesis.getCategory().equals(category)) {
                resultList.add(thesis);
            }
        }

        return resultList;
    }

    @Override
    public List<ThesisDto> selectByTitle(String title) throws IOException {

        List<ThesisDto> resultList = new ArrayList<>();

        for(ThesisDto thesis: thesisList) {
            if(thesis.getTitle().contains(title)) {
                resultList.add(thesis);
            }
        }

        return resultList;
    }
}
