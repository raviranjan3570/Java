package com.example.company;

public class ReportCard {

    public String name;
    public String englishGrade;
    public String mathsGrade;
    public String historyGrade;

    public ReportCard(String name, String englishGrade, String mathsGrade, String historyGrade) {
        this.name = name;
        this.englishGrade = englishGrade;
        this.mathsGrade = mathsGrade;
        this.historyGrade = historyGrade;
    }

    public String getName() {
        return name;
    }

    public String getEnglishGrade() {
        return englishGrade;
    }

    public String getMathsGrade() {
        return mathsGrade;
    }

    public String getHistoryGrade() {
        return historyGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "name='" + name + '\'' +
                ", englishGrade='" + englishGrade + '\'' +
                ", mathsGrade='" + mathsGrade + '\'' +
                ", historyGrade='" + historyGrade + '\'' +
                '}';
    }
}
