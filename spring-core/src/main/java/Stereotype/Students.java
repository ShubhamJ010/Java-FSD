package Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {

    @Value("Nicole")
    private String studentNameString;
    @Value("Faridabad")
    private String Studentcity;
    @Value("#{cList}")
    private List<String> cousrList;

    public List<String> getCousrList() {
        return cousrList;
    }

    public void setCousrList(List<String> cousrList) {
        this.cousrList = cousrList;
    }

    public String getStudentNameString() {
        return studentNameString;
    }

    public void setStudentNameString(String studentNameString) {
        this.studentNameString = studentNameString;
    }

    public String getStudentcity() {
        return Studentcity;
    }

    public void setStudentcity(String studentcity) {
        Studentcity = studentcity;
    }

    @Override
    public String toString() {
        return "Students [studentNameString=" + studentNameString + ", Studentcity=" + Studentcity + "]";
    }

}
