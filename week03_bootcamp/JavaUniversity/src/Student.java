public class Student {
    private String studentId;
    private String givenName;
    private String familyName;
    /*
    Using givenName and familyName rather than firstName and lastName to avoid confusion because
    different cultures have different understanding of first and last names.
     */
    public Student(String newStudentId) {
        studentId = newStudentId;
    }

    public Student(String newStudentId, String newGivenName, String newFamilyName) {
        studentId = newStudentId;
        setGivenName(newGivenName);
        setFamilyName(newFamilyName);
    }

    public void setGivenName(String newGivenName){
        givenName = newGivenName;
    }

    public void setFamilyName(String newFamilyName) {
        familyName = newFamilyName;
    }

    public String description() {
        return studentId + " " + givenName + " " + familyName;
    }

}
