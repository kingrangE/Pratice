package com.example.schedule;

public class ScheduleServiceImpl implements ScheduleService {

    ScheduleRepository scheduleRepository = new MemoryScheduleRepository();

    @Override
    public void addSchedule(Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    @Override
    public Schedule[] findScheduleByuId(Long uId) {
        return scheduleRepository.findByuId(uId);
    }

    @Override
    public void updateSchedule(Long id) {
        //getId로 스케쥴 객체를 가져옴
        Schedule existSchedule= scheduleRepository.findById(id);
        //schedule객체의 정보 중 처리 완료 여부(check)를 변경
        existSchedule.check = true;
    }
}
