package com.warmup.miniproject.dto.request;

import lombok.Getter;

import java.time.LocalDate;
@Getter
public class MemberInsertRequest {

    private String name;
    private Boolean isManager;

    private LocalDate birthday;

    private LocalDate workStartDate;

    private Integer teamId;
}
