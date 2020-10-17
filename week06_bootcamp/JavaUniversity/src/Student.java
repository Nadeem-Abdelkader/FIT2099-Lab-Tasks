// testing vscode
public class Student {
    private String studentId;
    private String givenName;
    private String familyName;

    /*
    Using givenName and familyName rather than firstName and lastName to avoid confusion because
    different cultures have different understanding of first and last names.
     */

    public Student(String newStudentId) throws Exception {
        setStudentId(newStudentId);
    }

    public Student(String newStudentId, String newGivenName, String newFamilyName) throws Exception {
        setStudentId(newStudentId);
        setGivenName(newGivenName);
        setFamilyName(newFamilyName);
    }

    public void setGivenName(String newGivenName){

        givenName = newGivenName;
    }

    public void setFamilyName(String newFamilyName) {

        familyName = newFamilyName;
    }

    public void setStudentId(String studentId) throws Exception {
        if (studentId.length() != 8) {
            throw new Exception("Student ID must be 8 digits!");
        }
        this.studentId = studentId;
    }

    public String getName(){

        return this.givenName + " " + this.familyName;
    }
    public String getStudentID() {
        return studentId;
    }

    public String description() {
        return studentId + " " + givenName + " " + familyName;
    }
}
