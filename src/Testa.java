import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author walte
 * @category 业务板块/方向分类/类中文名称
 * @Date 2018年08月03日
 */
public class Testa {
    public static class Person implements Cloneable{

        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Person() {
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        HashMap<Integer, Person> users = new HashMap<>();
        users.put(1, new Person(12, "张三"));
        users.put(3, new Person(13,"李四"));
        users.put(2, new Person(14,"王五"));
        System.out.println(users);
        users = sortHashMap(users);
        System.out.println(users);
        Collections.synchronizedMap(users);
        List<Person> list = new ArrayList<>();
        list.add(new Person(12, "张三"));

    }
    public static LinkedHashMap<Integer, Person> sortHashMap(HashMap<Integer, Person> map) {
        // 首先拿到 map 的键值对集合
        Set<Map.Entry<Integer, Person>> entrySet = map.entrySet();
        List<Map.Entry<Integer, Person>> list = new ArrayList<Map.Entry<Integer, Person>>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Person>>() {
            @Override
            public int compare(Map.Entry<Integer, Person> o1, Map.Entry<Integer, Person> o2) {

                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<Integer, Person>();
        for (Map.Entry<Integer, Person> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
