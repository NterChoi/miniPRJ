package com.warmup.miniproject.service;

import com.warmup.miniproject.domain.Member;
import com.warmup.miniproject.dto.request.MemberInsertRequest;
import com.warmup.miniproject.dto.response.MemberResponse;
import com.warmup.miniproject.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void saveMember(MemberInsertRequest request) {
        memberRepository.save(new Member(request));
    }

    @Transactional(readOnly = true)
    public List<MemberResponse> getMembers() {
        return memberRepository.findAll().stream()
                .map(MemberResponse::new)
                .collect(Collectors.toList());
    }
}
