package com.warmup.miniproject.dto.response;

import com.warmup.miniproject.domain.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TeamResponse {

    private String name;
    private String manager = null;
    private Integer memberCount;

    public TeamResponse(Team team) {
        this.name = team.getName();
//        this.manager = team.getManager();
        this.memberCount = team.getMembers().size();
    }
}
