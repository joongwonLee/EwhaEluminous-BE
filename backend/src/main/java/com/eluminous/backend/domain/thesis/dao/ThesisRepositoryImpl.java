package com.eluminous.backend.domain.thesis.dao;

import com.eluminous.backend.domain.thesis.dto.ThesisDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThesisRepositoryImpl implements ThesisRepository {

    List<ThesisDto> thesisList;

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
