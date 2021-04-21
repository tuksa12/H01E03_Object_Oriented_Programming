package de.tum.in.ase.eist;

import java.util.HashSet;
import java.util.Set;

public class TutorGroup {
	private Set<Student> students;
	private String id;
	private WeeklyTimeSlot timeSlot;
	private Person tutor;
	private Set<TutorGroupMeeting> meetings;

    public Set<Student> getStudents() {
        return students;
    }

    public String getId() {
        return id;
    }

    public WeeklyTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public Person getTutor() {
        return tutor;
    }

    public TutorGroup(String id, WeeklyTimeSlot weeklyTimeSlot, Person tutor) {
        this.id = id;
        this.timeSlot = weeklyTimeSlot;
        this.tutor = tutor;
        this.students = new HashSet<>();
        this.meetings = new HashSet<>();
    }

    protected void addMeeting(TutorGroupMeeting tutorGroupMeeting){
        this.meetings.add(tutorGroupMeeting);
    }

    public void register(Student student){
        this.students.add(student);
    }
}
