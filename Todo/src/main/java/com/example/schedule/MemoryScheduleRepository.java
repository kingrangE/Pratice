package com.example.schedule;

import java.util.HashMap;
import java.util.Map;

public class MemoryScheduleRepository implements ScheduleRepository {
    Map<Long,Schedule> schedules= new HashMap<>(); //일정 개별 정보 저장
    Map<Long,Schedule[]> userSchedules= new HashMap<>(); // 유저의 모든 일정 정보 저장
    @Override
    public void save(Schedule schedule) {
        schedules.put(schedule.getId(), schedule); // 개별 일정 저장
        // 개별 일정 저장된 것을 uId에 맞게 다시 저장
        // 유저 일정이 저장되어 있는 것이 있으면 추가하여 다시 저장
        // 없으면 리스트로 새로 만들어 저장
        try {
            //존재하면
            //일정 객체 담는 리스트 생성 ( 크기는 이미 저장된 리스트 길이 + 1 )
            Schedule[] existList = userSchedules.get(schedule.getuId());
            Schedule[] scheduleList = new Schedule[existList.length + 1];
            System.arraycopy(existList, 0, scheduleList, 0, existList.length);
            scheduleList[scheduleList.length-1] = schedule;
            userSchedules.put(schedule.getuId(), scheduleList);
        }catch (Exception e){
            //uId가 등록되지 않았다면, get에서 에러가 발생합니다.
            //그땐 이 부분으로 오게 합니다.
            Schedule[] scheduleList = {schedule};
            userSchedules.put(schedule.getuId(),scheduleList);
        }

    }

    @Override
    public Schedule[] findByuId(Long uId) {
        return userSchedules.get(uId);
    }

    @Override
    public Schedule findById(Long id) {
        return schedules.get(id);
    }

}
