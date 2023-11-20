package com.eluminous.backend.domain.thesis.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.ANY
)
public class ThesisDto {
    private int id;
    private String category;
    private String title;
    private String[] author;
    private String[][] contents;
    private String[][] text;
    private String[][] references;

    public ThesisDto(int id, String category, String title, String[] author, String[][] contents, String[][] text, String[][] references) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.author = author;
        this.contents = contents;
        this.text = text;
        this.references = references;
    }
}