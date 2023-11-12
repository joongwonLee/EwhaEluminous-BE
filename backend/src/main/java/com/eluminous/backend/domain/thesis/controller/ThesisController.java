package com.eluminous.backend.domain.thesis.controller;

import com.eluminous.backend.domain.thesis.dto.ThesisDto;
import com.eluminous.backend.domain.thesis.service.ThesisService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@Slf4j
public class ThesisController {

    @Autowired
    private ThesisService thesisService;


    @GetMapping("/thesis")
    public List<ThesisDto> showAllThesis() throws Exception {

        return thesisService.selectAll();
    }

    @GetMapping("/thesis/category/{category}")
    public List<ThesisDto> showThesisByCategory(@PathVariable("category") String category) throws Exception {

        log.info("{}", category);
        return thesisService.selectByCategory(category);
    }

    @GetMapping("/thesis/title/{title}")
    public List<ThesisDto> showThesisByTitle(@PathVariable("title") String title) throws Exception {

        return thesisService.selectByTitle(title);
    }
}
