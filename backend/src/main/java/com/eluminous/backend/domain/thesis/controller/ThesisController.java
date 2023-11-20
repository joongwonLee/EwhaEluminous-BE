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

import java.util.ArrayList;
import java.util.List;


@RestController
@Slf4j
public class ThesisController {

//    @Autowired
//    private ThesisService thesisService;

    String title1 = "물 전기 분해에 의한 수소 생산 "

    private List<ThesisDto> thesisList = new ArrayList<>() {{
        add(new ThesisDto());
        add(new ThesisDto());
        add(new ThesisDto());
        add(new ThesisDto());
        add(new ThesisDto());
        add(new ThesisDto());
    }};

    @GetMapping({"/thesis"})
    public List<ThesisDto> showAllThesis() {
        String title = "에너지 신기술 및 동향";
        String[] author = new String[]{"최서정"};
        String[][] contents = new String[][]{{"목차1"}, {"목차2", "목차2-1", "목차2-2"}, {"목차3", "목차3-1", "목차3-2"}, {"목차4"}, {"목차5"}};
        String[][] text = new String[][]{{"mokcha1"}, {"", "mokcha2-1", "mokcha2-2"}, {"", "mokcha3-1", "mokcha3-2"}};
        String[][] references = new String[][]{{"참고문헌1", "참고문헌1링크"}, {"참고문헌2", "참고문헌2링크"}};
        ThesisDto testDto = new ThesisDto(1, "배터리", title, author, contents, text, references);
        String title2 = "바이오  신기술 및 동향";
        String[] var10000 = new String[]{"최서정2"};
        String[][] var14 = new String[][]{{"목차1"}, {"목차2", "목차2-1", "목차2-2"}, {"목차3", "목차3-1", "목차3-2"}, {"목차4"}, {"목차5"}};
        var14 = new String[][]{{"mokcha1"}, {"", "mokcha2-1", "mokcha2-2"}, {"", "mokcha3-1", "mokcha3-2"}};
        var14 = new String[][]{{"참고문헌1", "참고문헌1링크"}, {"참고문헌2", "참고문헌2링크"}};
        ThesisDto testDto2 = new ThesisDto(2, "바이오", title, author, contents, text, references);
        List<ThesisDto> lst = new ArrayList();
        lst.add(testDto);
        lst.add(testDto2);
        return lst;
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
