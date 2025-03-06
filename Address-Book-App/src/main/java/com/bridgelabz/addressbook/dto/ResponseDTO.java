package com.bridgelabz.addressbook.dto;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public @Data class ResponseDTO {

    private String message;
    private Object data;
}