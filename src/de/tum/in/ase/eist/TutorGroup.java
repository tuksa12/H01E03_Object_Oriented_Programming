package de.tum.in.ase.eist;

import java.util.Set;

public class TutorGroup {
	private Set<Student> students;
	private String id;
	private WeeklyTimeSlot weeklyTimeSlot;
	private Person tutor;
	private Set<TutorGroupMeeting> meetings;

    public Set<Student> getStudents() {
        return students;
    }

    public String getId() {
        return id;
    }

    public WeeklyTimeSlot getWeeklyTimeSlot() {
        return weeklyTimeSlot;
    }

    public Person getTutor() {
        return tutor;
    }

    public TutorGroup(String id, WeeklyTimeSlot weeklyTimeSlot, Person tutor) {
        this.id = id;
        this.weeklyTimeSlot = weeklyTimeSlot;
        this.tutor = tutor;
    }

    public void addMeeting(TutorGroupMeeting tutorGroupMeeting){
        this.meetings.add(tutorGroupMeeting);
    }

    public void register(Student student){
        this.students.add(student);
    }
}
