package de.tum.in.ase.eist;

public class VirtualTutorGroupMeeting extends TutorGroupMeeting{
    private String url;

    public String getUrl() {
        return url;
    }

    public VirtualTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, String url) {
        super(timeSlot, tutorGroup, skillToPractice);
        this.url = url;
    }

    @Override
    public void practice() {
        super.getTutorGroup().getTutor().say("Thank you for joining using " + url + " today.");
        super.getTutorGroup().getStudents().forEach(student -> student.learnSkill(super.getSkillToPractice()));
        super.getTutorGroup().getTutor().say("See you next time!");
    }
}
