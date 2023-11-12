package com.eluminous.backend.domain.thesis.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 논문 Dto
@Getter @Setter @AllArgsConstructor
public class ThesisDto {

    private int id; // 논문 id
    private String category; // 논문 카테고리
    private String title; // 논문 제목
    private String[] author; // 논문 저자
    private String abstr; // 논문 초록
    private String[] contents; // 목차 목록
    private String text; // 논문 본문
    private Reference[] references; // 참고문헌 목록

}



//class Content {
//    private int order; // 목차 순서, 번호
//    private String content; // 목차 내용
//}

//@JsonFormat(shape = JsonFormat.Shape.OBJECT)
//@AllArgsConstructor
//enum Category {
//    BATTERY("Battery"), // 배터리
//    SEMICONDUCTOR("SemiConductor"), // 반도체
//    BIO("Bio"), // 바이오
//    PROCESSDISIGN("ProcessDisign"), // 공정설계
//    NEWMATERIALS_ENERGY // 신소재/에너지
//
//    private String category;
//}