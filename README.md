# Pratice
This repository contains a practice project

## Todo

<details>
    <summary>Please refer to the toggle or blog below for more information.
    </summary>

## 개요
제가 실습을 통해 학습할 내용은 다음과 같습니다.<br/>
1. 인터페이스와 구현체를 분리한 설계
2. 객체 지향의 5원칙 ([SOLID](https://dev-won-log.tistory.com/4)) 지키기
3. 순수 자바 언어로 제작
4. 자바 언어로 제작된 Application을 Spring으로 전환
5. 단위 테스트

## 설계
저는 다음과 같이 설계하였습니다. <br/>

### 분류
1. 회원(Member)
2. 일정(Todo)

### 회원 
1. Member는 다음과 같은 프로퍼티를 갖습니다. 
    - 고유한 ID
    - 회원 닉네임

2. Member Service에서는 다음과 같은 서비스를 제공합니다.
    - 회원 가입 서비스
    - 회원 조회 서비스

3. Member의 정보를 저장할 수 있는 Repository가 필요합니다.
    - 필요한 기능
        - 회원 정보 저장
        - 회원 정보 조회(1D)

### 일정
1. 일정은 다음과 같은 프로퍼티를 갖습니다.
    - 회원 ID 
    - 일정 이름
    - 일정 완료 여부

3. 일정 서비스에서는 다음과 같은 서비스를 제공합니다.
    - 일정 추가 서비스
    - 일정 조회 서비스
        - 완료된 일정만 조회
        - 완료되지 않은 일정만 조회
    - 일정 완료 처리 서비스


2. 일정의 정보를 저장할 수 있는 Repository가 필요합니다.
    - 필요한 기능
        - 일정 정보 저장
        - 일정 조회 (회원 ID 기반)

</details>

[Todo 실습 블로그 글](https://dev-won-log.tistory.com/19)

