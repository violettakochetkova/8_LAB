package com.company;

public class Grade {
    private String student;
    private int rate;
    private int id;

    public Grade(String student, int rate, int id) {
        this.student = student;
        this.rate = rate;
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "student='" + student + '\'' +
                ", rate=" + rate +
                ", id=" + id +
                '}';
    }
}

