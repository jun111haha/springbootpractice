package com.jojoldu.book.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloResponseDtoTest {

    @Test
    public void 롬북_기능_테스트(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto();

        dto.setName(name);
        dto.setAmount(amount);

        assertThat(dto.getName().equals(name));
        assertThat(dto.getAmount() == amount);

    }

}