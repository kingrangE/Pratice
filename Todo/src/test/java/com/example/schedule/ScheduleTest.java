package com.example.schedule;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ScheduleTest {
    @Test
    @DisplayName("일정 추가 및 조회")
    public void addSchedule() {
        //given

        ScheduleService scheduleService = new ScheduleServiceImpl();
        Schedule schedule_1= new Schedule(1L,11L,"1L의 일정 1",false);
        Schedule schedule_2= new Schedule(1L,12L,"1L의 일정 2",false);
        Schedule schedule_3= new Schedule(2L,21L,"2L의 일정 1",false);
        Schedule schedule_4= new Schedule(2L,22L,"2L의 일정 2",false);
        Schedule schedule_5= new Schedule(1L,13L,"1L의 일정 3",false);
        Schedule schedule_6= new Schedule(1L,14L,"1L의 일정 4",false);
        Schedule schedule_7= new Schedule(2L,23L,"3L의 일정 3",false);
        Schedule schedule_8= new Schedule(1L,15L,"1L의 일정 5",false);
        //when
        scheduleService.addSchedule(schedule_1);
        scheduleService.addSchedule(schedule_2);
        scheduleService.addSchedule(schedule_3);
        scheduleService.addSchedule(schedule_4);
        scheduleService.addSchedule(schedule_5);
        scheduleService.addSchedule(schedule_6);
        scheduleService.addSchedule(schedule_7);
        scheduleService.addSchedule(schedule_8);
        //then
        Schedule[] schedules = scheduleService.findScheduleByuId(1L);
        for (Schedule schedule : schedules) {
            System.out.println("schedule name : " + schedule.scheduleName);
        }
        //일정 완료 처리
        //when : 12L의 일정을 완료처리하겠습니다.
        scheduleService.updateSchedule(12L);
        //then
        schedules = scheduleService.findScheduleByuId(1L);
        for (Schedule schedule : schedules) {
            System.out.println("schedule check : " + schedule.check);
        }
    }
}
