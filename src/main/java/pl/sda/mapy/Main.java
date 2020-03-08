package pl.sda.mapy;

import java.lang.reflect.GenericSignatureFormatError;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
       /* Generyka<String> generyka = new Generyka<String>("test" );
        System.out.println(generyka.getFieldl());
        Generyka<Integer> generyka1 = new Generyka<Integer>(5);
        System.out.println(generyka1.getFieldl());

        Map<Integer, String> map = new HashMap<Integer, String>(    );
        map.put(1,"Jan");
        map.put(2,"Janusz");
        map.put(3,"Adam");
        map.put(4,"Roman");
        map.put(-1,"Ania");
        if(map.containsKey(1)){
            System.out.println("Key zajety najpierw usun");
        }
        else{
            map.put(1,"Jurand");
        }
        map.putIfAbsent(1,"Marek");

        System.out.println(map);
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"/"+entry.getValue()  );
        }*/

        School school1 = new School("1","TORUN");
        School school2 = new School("2","TORUN");
        School school3 = new School("3","TORUN");
        School school4 = new School("1","BYDGOSZCZ");

        Student student1 = new Student("Jan","Kowalski");
        Student student2 = new Student("Marian","Kowalski");
        Student student3 = new Student("Janusz","Kowalski");
        Student student4 = new Student("Marek","Kowalski");
        Student student5 = new Student("Tomasz","Kowalski");
        Student student6 = new Student("Maciej","Kowalski");
        Student student7 = new Student("Michał","Kowalski");
        Student student8 = new Student("Marcin","Kowalski");
        Student student9 = new Student("Darek","Kowalski");
        Student student10 = new Student("Franciszek","Kowalski");
        Student student11 = new Student("Bogdan","Kowalski");
        Student student12 = new Student("Borys","Kowalski");
        Student student13 = new Student("Karol","Kowalski");
        Student student14 = new Student("Damian","Kowalski");
        List<Student> sch1 = new ArrayList<Student>();
        List<Student> sch2 = new ArrayList<Student>();
        List<Student> sch3 = new ArrayList<Student>();
        List<Student> sch4 = new ArrayList<Student>();


        sch1.add(student1);
        sch1.add(student2);
        sch1.add(student3);
        sch1.add(student4);
        sch1.add(student5);
        sch2.add(student6);
        sch2.add(student7);
        sch2.add(student8);
        sch2.add(student9);
        sch3.add(student10);
        sch3.add(student11);
        sch3.add(student12);
        sch4.add(student13);
        sch4.add(student14);

        Map<School, List<Student>> mapa = new HashMap<School,List<Student>>();
        mapa.put(school1,sch1);
        mapa.put(school2,sch2);
        mapa.put(school3,sch3);
        mapa.put(school4,sch4);
        for(Map.Entry<School, List<Student>> entry : mapa.entrySet()){
            System.out.println(entry.getKey().getName()+" "+entry.getKey().getCity());
            for (Student element : entry.getValue()) {
                System.out.println(element.getName()+" "+element.getLastname());
            }
        }

    }
}
