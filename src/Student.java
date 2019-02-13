/**
 * Created by walte on 2018/8/3.
 */
public class Student {

    private int id;
    private String name;
    private String sex;
    private String clazz;
    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int id, String name, String sex, String clazz, String age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.clazz = clazz;
        this.age = age;
    }
}
