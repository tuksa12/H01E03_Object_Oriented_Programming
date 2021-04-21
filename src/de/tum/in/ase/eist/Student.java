package de.tum.in.ase.eist;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person {
    private String matriculationNumber;
    private int semester;
    private Set<String> knowledge;
    private Set<Skill> skills;
    private StudyLevel studyLevel;

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public int getSemester() {
        return semester;
    }

    public Set<String> getKnowledge() {
        return knowledge;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public Student(String name, int age, String tumId, StudyLevel studyLevel, int semester) {
        super(name, age, tumId);
        this.studyLevel = studyLevel;
        this.semester = semester;
        this.knowledge = new HashSet<>();
        this.skills = new HashSet<>();

    }

    public void learnSkill(Skill skill){
        this.skills.add(skill);
    }

    public void acquireKnowledge(String knowledge){
        this.knowledge.add(knowledge);
    }
}
