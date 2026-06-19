//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Rushabh", 101, "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();


        controller.setStudentName("Saurabh");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}