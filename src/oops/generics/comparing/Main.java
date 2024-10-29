package oops.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.76f);
        Student suraj = new Student(34, 96.76f);
        Student utkarsh = new Student(36, 92.76f);
        Student ritesh = new Student(28, 29.76f);

        Student[] list = {kunal, rahul, suraj, utkarsh, ritesh};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
////                return -(int)(o1.marks - o2.marks);  just add one - sign for descending order
//            }
//        });

        //lambda function
        Arrays.sort(list, (o1,o2)-> -(int)(o1.marks-o2.marks));

        System.out.println(Arrays.toString(list));

//        if(kunal.compareTo(rahul) < 0){
//            System.out.println(kunal.compareTo(rahul) );
//            System.out.println("Rahul has more marks ");
//        }
    }
}
