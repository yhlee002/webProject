package com.portfolio.demo.project.vo;

import com.portfolio.demo.project.entity.member.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class MemberVO {
    private Long memNo;
    private String identifier;
    private String nickname;
    private String profileImage; // 프로필조회 api사용시 api에서 제공하는 profile_image를 담아 객체째로 세션에 담을 것.
    private String phone;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime regDt;
    private String role;
    private String provider;

    public MemberVO(Member member) {
        this.memNo = member.getMemNo();
        this.identifier = member.getIdentifier();
        this.nickname = member.getName();
        this.profileImage = member.getProfileImage();
        this.phone = member.getPhone();
        this.regDt = member.getRegDt();
        this.role = member.getRole();
        this.provider = member.getProvider();
    }
}
