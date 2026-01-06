package com.pravin.collections;

import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa  = gpa;
    }

    public String getName() { return name; }
    public double getGpa()  { return gpa; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa());
    }
}


class Change implements Comparator<Integer> {
    @Override
    public int compare(Integer o1,Integer o2){
        return o2 - o1;
    }
}
class ChangeString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}
public class Comparator2 {
    public static void main(String[] args) {
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(3);

        list2.sort(new Change());
        System.out.println(list2);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));
        Comparator<Student>   comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort((o1,o2) ->  {
            if (o2.getGpa() - o1.getGpa() > 0){
                return 1;
            }
            if (o2.getGpa() - o1.getGpa() < 0){
                return -1;
            }
            else {
                return o2.getName().compareTo(o1.getName());
            }
        });
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }
        Collections.sort(students,comparator);
    }
}
