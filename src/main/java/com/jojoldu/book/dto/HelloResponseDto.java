package com.jojoldu.book.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class HelloResponseDto {

    private String name;
    private int amount;

}
