package com.eluminous.backend.domain.thesis.dao;

import com.eluminous.backend.domain.thesis.dto.ThesisDto;

import java.io.IOException;
import java.util.List;

public interface ThesisRepository {

    List<ThesisDto> selectAll() throws Exception;
    List<ThesisDto> selectByCategory(String category) throws Exception;
    List<ThesisDto> selectByTitle(String title) throws IOException;
}
