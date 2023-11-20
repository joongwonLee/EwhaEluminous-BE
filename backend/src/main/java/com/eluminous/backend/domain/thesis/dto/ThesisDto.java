package com.eluminous.backend.domain.thesis.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.ANY
)
public class ThesisDto {
    public int id;
    public String category;
    public String title;
    public String[] author;
    public String[][] contents;
    public String[][] text;
    public String[][] references;

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