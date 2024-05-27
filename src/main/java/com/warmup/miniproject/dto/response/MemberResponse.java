package com.warmup.miniproject.dto.response;

import com.warmup.miniproject.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
@Getter
@AllArgsConstructor
public class MemberResponse {

    private String name;
    private String teamName;
    private String role;
    private LocalDate birthday;
    private LocalDate workStartDate;

    public MemberResponse(Member member) {
        this.name = member.getName();
        this.teamName = member.getTeam().getName();
        this.role = member.isManager() ? "MANAGER" : "MEMBER";
        this.birthday = member.getBirthday();
        this.workStartDate = member.getWorkStartDate();
    }
}
