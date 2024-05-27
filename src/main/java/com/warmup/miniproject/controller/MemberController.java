package com.warmup.miniproject.controller;

import com.warmup.miniproject.dto.request.MemberInsertRequest;
import com.warmup.miniproject.dto.response.MemberResponse;
import com.warmup.miniproject.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member")
    public void saveMember(@RequestBody MemberInsertRequest request) {
        memberService.saveMember(request);
    }

    @GetMapping("/member")
    public List<MemberResponse> getMembers() {
        return memberService.getMembers();
    }

}
