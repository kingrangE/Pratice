package com.example.member;

public interface MemberService {
    void register(Member member);
    Member findById(Long id);
}
