package com.example.schedule;

import java.util.HashMap;
import java.util.Map;

public interface ScheduleRepository {
    // 저장소는 일정 정보 저장, 일정 조회 처리가 필요합니다.
    void save(Schedule schedule);
    Schedule[] findByuId(Long uId);
    Schedule findById(Long id);
}
