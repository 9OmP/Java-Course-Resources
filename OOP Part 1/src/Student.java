public class Student {

    private String id;
    private String name;
    private String date_of_birth;
    private String class_list;

    public Student(String id, String class_list, String name, String date_of_birth) {
        this.id = id;
        this.class_list = class_list;
        this.name = name;
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", class_list='" + class_list + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClass_list() {
        return class_list;
    }

    public void setClass_list(String class_list) {
        this.class_list = class_list;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
