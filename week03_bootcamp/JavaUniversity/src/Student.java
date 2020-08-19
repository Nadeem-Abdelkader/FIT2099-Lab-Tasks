public class Student {
    private String studentId;
    private String givenName;
    private String familyName;

    public Student(String newStudentId) {
        studentId = newStudentId;
    }

    public Student(String newStudentId, String newgivenName, String newfamilyName) {
        studentId = newStudentId;
        setGivenName(newgivenName);
        setFamilyName(newfamilyName);
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
