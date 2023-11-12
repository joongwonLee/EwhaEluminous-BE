package com.eluminous.backend.domain.thesis.service;

import com.eluminous.backend.domain.thesis.dto.ThesisDto;

import java.util.List;

public interface ThesisService {

    List<ThesisDto> selectAll() throws Exception;
    List<ThesisDto> selectByCategory(String category) throws Exception;
    List<ThesisDto> selectByTitle(String title) throws Exception;
}
