package com.warmup.miniproject.service;

import com.warmup.miniproject.domain.Team;
import com.warmup.miniproject.dto.request.TeamInsertRequest;
import com.warmup.miniproject.dto.response.TeamResponse;
import com.warmup.miniproject.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    @Transactional
    public void saveTeam(TeamInsertRequest request) {
        teamRepository.save(new Team(request.getName()));
    }

    @Transactional(readOnly = true)
    public List<TeamResponse> getTeams() {
        return teamRepository.findAll().stream()
                .map(TeamResponse::new)
                .collect(Collectors.toList());
    }
}
