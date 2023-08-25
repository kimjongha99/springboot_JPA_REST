package com.bootex.boot_jsp.ex10.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class SimpleBbsDto {
    private int id;
    private String writer;
    private String title;
    private String content;
}
