package org.example;

public class Library {
    private final int countDayStudent = 50;
    private final int countDayTeacher = 80;
    private final int fine = 500;
    private Book book = new Book("Роман Тургенева", "Отцы и дети", 1L);
    private Book book1 = new Book("Максим Горький", "На дне", 2L);
    private Book book2 = new Book("Александр Сергеевич Пушкин", "Полтава", 3L);
    private Book book3 = new Book("Александр Сергеевич Пушкин", "Евгений Онегин", 4L);

    public void setBookStudent(Student student, int day, Book book) {
        student.setBook(book);
        System.out.printf("Была выдана книга: %s автор: ,студенту: ", book.getName(), book.getAuthor(), student.getName());
        student.setCountDay(day);
    }

    public void getBookStudent(Student student) {
        book = student.getBook();
        System.out.printf("Была возвращена книга: %s автор: , от студента: ", book.getName(), book.getAuthor(), student.getName());
        if (student.getCountDay() > countDayStudent) {
            student.setFine(fine * student.getCountDay());
        }
    }

    public void setBookTeacher(Teacher teacher, int day, Book book) {
        teacher.setBook(book);
        System.out.printf("Была выдана книга: %s автор: ,студенту: ", book.getName(), book.getAuthor(), teacher.getName());
        teacher.setCountDay(day);
    }

    public void getBookTeacher(Teacher teacher) {
        book = teacher.getBook();
        System.out.printf("Была возвращена книга: %s автор: , от студента: ", book.getName(), book.getAuthor(), teacher.getName());
        if (teacher.getCountDay() > countDayTeacher) {
            teacher.setFine(fine * teacher.getCountDay());
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "book=" + book +
                ", book1=" + book1 +
                ", book2=" + book2 +
                ", book3=" + book3 +
                '}';
    }

    public Book getBook() {
        return book;
    }

    public Book getBook1() {
        return book1;
    }

    public Book getBook2() {
        return book2;
    }

    public Book getBook3() {
        return book3;
    }
}