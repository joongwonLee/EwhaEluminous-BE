//package com.eluminous.backend.domain.thesis.service;
//
//import com.eluminous.backend.domain.thesis.dao.ThesisRepository;
//import com.eluminous.backend.domain.thesis.dao.ThesisRepositoryImpl;
//import com.eluminous.backend.domain.thesis.dto.ThesisDto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ThesisServiceImpl implements ThesisService {
//
//    @Autowired
//    ThesisRepository thesisRepo = new ThesisRepositoryImpl();
//
//    @Override
//    public List<ThesisDto> selectAll() throws Exception {
//        return thesisRepo.selectAll();
//    }
//
//    @Override
//    public List<ThesisDto> selectByCategory(String category) throws Exception {
//        return thesisRepo.selectByCategory(category);
//    }
//
//    @Override
//    public List<ThesisDto> selectByTitle(String title) throws Exception {
//        return thesisRepo.selectByTitle(title);
//    }
//}
