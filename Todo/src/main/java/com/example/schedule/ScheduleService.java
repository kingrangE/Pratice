package com.example.schedule;

public interface ScheduleService {
    void addSchedule(Schedule schedule); // 일정 추가
    Schedule[] findScheduleByuId(Long uId); // 일정 조회
    void updateSchedule(Long id); // 일정 완료 처리
}
