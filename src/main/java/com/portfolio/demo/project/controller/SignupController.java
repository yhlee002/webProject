package com.portfolio.demo.project.controller;

import com.portfolio.demo.project.entity.member.Member;
import com.portfolio.demo.project.repository.MemberRepository;
import com.portfolio.demo.project.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Slf4j
@Controller
@RequestMapping("/sign-up")
public class SignupController {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MemberService memberService;

    @ResponseBody
    @RequestMapping(value = "/emailCk", method = RequestMethod.POST)
    public String emailCkProc(@RequestParam String email) {
        log.info("들어온 이메일 : " + email);

        Member member = memberRepository.findByEmail(email);

        if (member != null) {
            log.info("[emailCkProc] member 정보 : " + member.toString());
            return member.getEmail();
        } else {
            log.info("[emailCkProc] member 정보 : " + null);
            return "none";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/nameCk", method = RequestMethod.POST)
    public String nameCkProc(@RequestParam String name) {
        Member member = memberRepository.findByName(name);

        if (member != null) {
            log.info("[nameCkProc] member 정보 : " + member.toString());
            return member.getName();
        } else {
            log.info("[nameCkProc] member 정보 : null");
            return "none";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/phoneCk", method = RequestMethod.POST)
    public Member authPhone(@RequestParam String phone) {
        Member member = memberService.findByPhone(phone);
        if (member != null) {
            log.info("[phoneCkProc] member 정보 : " + member.toString());
            return member;
        } else {
            log.info("[phoneCkProc] member 정보 : null");
            return null;
        }
    }

    @RequestMapping(value = "/phoneCkPage", method = RequestMethod.POST)
    public

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcomePage() {
        return "sign-up/welcome";
    }

    @RequestMapping(value = "/sign-up-processor", method = RequestMethod.POST)
    public String signUpProc(String email, String name, String password, String phone) {
        Member member = Member.builder()
                .memNo(null)
                .email(email)
                .name(name)
                .password(password)
                .phone(phone)
                .regDt(LocalDateTime.now())
                .build();

        memberService.saveMember(member);

        return "sign-up/sign-up-success";
    }
}
