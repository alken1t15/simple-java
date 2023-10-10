package org.example;

public class Main {
    private static final Library library = new Library();
    public static void main(String[] args) {
        Student student = new Student("Василий",4324234L);
        Student student2 = new Student("Генадий",4324434L);
        Student student3 = new Student("Петрович",43242344L);
        Teacher teacher = new Teacher("Марина");
        System.out.println(library);
        library.setBookStudent(student,30,library.getBook());
        library.setBookStudent(student2,24,library.getBook1());
        library.setBookStudent(student3,90,library.getBook2());
        library.setBookTeacher(teacher,40,library.getBook3());
    }
}