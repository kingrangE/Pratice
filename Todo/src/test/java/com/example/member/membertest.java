package com.example.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class membertest {

    @Test
    @DisplayName("member 등록 및 조회 검사")
    void test(){
        MemberRepository memberRepository = new MemoryMemberRepository();
        //given
        Member member = new Member(1L,"길원");
        //when
        //저장
        memberRepository.save(member);
        //조회
        Member findMember = memberRepository.findById(member.getId());
        //검사
        Assertions.assertThat(findMember).isEqualTo(member);
    }
}
