package io.pragra.learning.springjdbcdemo.model;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String email;

    public Student(int studentId, String firstName, String lastName, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student(){

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("studentId=").append(studentId);
        sb.append(", \nfirstName='").append(firstName).append('\'');
        sb.append(", \nlastName='").append(lastName).append('\'');
        sb.append(", \nemail='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
