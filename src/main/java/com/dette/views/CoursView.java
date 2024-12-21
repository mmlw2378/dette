package com.dette.views;

import com.dette.entity.Cours;
import com.dette.services.CoursService;
import com.dette.services.impl.CoursServiceImpl;

public class CoursView {
    private CoursService courseService = new CoursServiceImpl();

    public void displayCourse(int courseId) {
        Cours cours = coursService.findById(courseId);
        System.out.println("Module: " + cours.getModule());
        System.out.println("Professeur: " + cours.getProfesseur().getName());
    }
}
