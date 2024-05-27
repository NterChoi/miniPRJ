package com.warmup.miniproject.controller;

import com.warmup.miniproject.dto.request.TeamInsertRequest;
import com.warmup.miniproject.dto.response.TeamResponse;
import com.warmup.miniproject.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class TeamController {

    private final TeamService teamService;

    @PostMapping("/team")
    public void saveTeam(@RequestBody TeamInsertRequest request) {

        teamService.saveTeam(request);
    }

    @GetMapping("/team")
    public List<TeamResponse> getTeams() {
        return teamService.getTeams();
    }
}
