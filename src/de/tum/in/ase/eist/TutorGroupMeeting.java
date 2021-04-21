package de.tum.in.ase.eist;

public abstract class TutorGroupMeeting {
	private FixedDateTimeSlot timeSlot;
	private TutorGroup tutorGroup;
    private Skill skillToPractice;

    public FixedDateTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public Skill getSkillToPractice() {
        return skillToPractice;
    }

    public TutorGroup getTutorGroup() {
        return tutorGroup;
    }

    public TutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice) {
        this.timeSlot = timeSlot;
        this.tutorGroup = tutorGroup;
        this.skillToPractice = skillToPractice;
        this.tutorGroup.addMeeting(this);
    }

    public abstract void practice();
}
