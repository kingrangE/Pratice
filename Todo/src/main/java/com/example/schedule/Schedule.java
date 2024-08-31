package com.example.schedule;

public class Schedule {
    Long uId; //회원 ID
    Long id; // schedule id;
    String scheduleName; //일정 이름
    boolean check;

    public Schedule(Long uId, Long id, String scheduleName, boolean check) {
        this.uId = uId;
        this.id = id;
        this.scheduleName = scheduleName;
        this.check = check;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
