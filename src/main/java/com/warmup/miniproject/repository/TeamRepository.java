package com.warmup.miniproject.repository;

import com.warmup.miniproject.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
