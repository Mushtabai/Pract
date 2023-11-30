package ru.mirea.it.ivbo01;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = getStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        controller.setName("Maxim");
        System.out.println("\nAfter updating, Course Details are as follows");

        controller.updateView();
    }

    private static Student getStudentFromDatabase(){
        Student student = new Student();
        student.setName("Andrew");
        student.setRollNo("123");
        return student;
    }
}
