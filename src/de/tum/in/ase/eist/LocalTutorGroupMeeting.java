package de.tum.in.ase.eist;

public class LocalTutorGroupMeeting extends TutorGroupMeeting {
    private String room;

    public String getRoom() {
        return room;
    }

    public LocalTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, String room) {
        super(timeSlot, tutorGroup, skillToPractice);
        this.room = room;
    }

    @Override
    public void practice() {
        super.getTutorGroup().getTutor().say("Thank you for coming to " + room + " today.");
        super.getTutorGroup().getStudents().forEach(student -> student.learnSkill(super.getSkillToPractice()));
        super.getTutorGroup().getTutor().say("See you next time!");
    }
}
