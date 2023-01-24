public class Student {

    private String id;
    private String name;
    private String dateOPfBirth;
    private String classList;

    public Student(String id, String name, String dateOPfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOPfBirth = dateOPfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOPfBirth='" + dateOPfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOPfBirth() {
        return dateOPfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOPfBirth(String dateOPfBirth) {
        this.dateOPfBirth = dateOPfBirth;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
