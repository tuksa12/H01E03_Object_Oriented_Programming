package de.tum.in.ase.eist;

import java.time.Duration;
import java.time.LocalTime;

public abstract class TimeSlot {
	private LocalTime startTime;
	private LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public TimeSlot(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Duration getDuration(){
        return Duration.between(startTime,endTime);
    }
}
