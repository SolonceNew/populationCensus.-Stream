package com.company.Netology;

public enum Education {
    ELEMENTARY("начальное"),
    SECONDARY("среднее"),
    FURTHER("среднее профессиональное"),
    HIGHER("высшее");

    String education;

    Education(String education) {
        this.education = education;
    }
}
