package com.ly.sfdy.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ResponseEntity {
    private int errorCode;
    private String reason;
    private Object result;
}
