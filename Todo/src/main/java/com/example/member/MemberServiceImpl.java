package com.example.member;

public class MemberServiceImpl implements MemberService {
    MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void register(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findById(Long id) {
        return memberRepository.findById(id);
    }
}
