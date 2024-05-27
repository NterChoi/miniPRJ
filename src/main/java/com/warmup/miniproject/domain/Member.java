package com.warmup.miniproject.domain;

import com.warmup.miniproject.dto.request.MemberInsertRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean isManager;

    @Column(nullable = false)
    private LocalDate workStartDate;

    @Column(nullable = false)
    private LocalDate birthday;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    public Member(MemberInsertRequest request) {
        this.name = request.getName();
        this.isManager = request.getIsManager();
        this.workStartDate = request.getWorkStartDate();
        this.birthday = request.getBirthday();
    }
}
