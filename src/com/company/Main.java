package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	String url = "src/grades.xml";
	GradeParser gradeParser = new GradeParser();

	gradeParser.buildGradeSet(url);
        System.out.println(gradeParser.getGrades());
    }
}
