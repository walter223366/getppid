import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by walte on 2018/8/3.
 */
public class ManagerImpl implements Manager {
    private static final Scanner sc = new Scanner(System.in);
    @Override
    public void add(Student[] students) {
        System.out.println("请输入学生ID");
        int id =sc.nextInt();
        System.out.println("请输入学生姓名");
        String  name=sc.next();
        System.out.println("请输入学生班级");
        String clazz =sc.next();
        System.out.println("请输入学生性别");
        String sex =sc.next();
        System.out.println("请输入学生年龄");
        String age =sc.next();
        Student student = new Student(id,name,sex,clazz,age);
        students= Arrays.copyOf(students,students.length+1);
        students[students.length-1]=student;
    }
    @Override
    public void serach(Student[] students) {
        System.out.println("请输入要查询学生ID");
        int id =sc.nextInt();
        for(Student student :students){
            if(id==student.getId()){
                System.out.println(student);
            }
        }
    }

    @Override
    public void update(Student[] students) {

    }

    @Override
    public void delete(Student[] students) {

    }
}
