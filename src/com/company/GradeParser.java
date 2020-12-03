package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

public class GradeParser {
    private Set<Grade> grades;

    public GradeParser() {
        grades = new HashSet();
    }


    public void buildGradeSet(String filename) throws Exception {
        Document document;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        document = documentBuilder.parse(filename);//для работы с документоgм в Java
        Element root = document.getDocumentElement(); //получаем корневой элемент документа
        NodeList gradeList = root.getElementsByTagName("grade");//получаем список дочерних элементов grade
        for (int i = 0; i < gradeList.getLength(); i++) {
            Element gradeElement = (Element) gradeList.item(i);
            Grade grade = buildGrade(gradeElement);
            grades.add(grade);
        }
    }

    private Grade buildGrade(Element gradeElement) throws ParseException {
        int id = Integer.parseInt(gradeElement.getAttribute("id"));//получаем атрибут айди
            /*
            получаем все элементы стьюдент
            берем первый(единственный) элемент
            получаем текст внутри него
             */
        String student = gradeElement.getElementsByTagName("student").item(0).getTextContent();
        int rate = Integer.parseInt(gradeElement.getElementsByTagName("rate").item(0).getTextContent());
        Grade grade = new Grade(student, rate, id);
        return grade;


    }

    public Set<Grade> getGrades() {
        return grades;
    }


}

