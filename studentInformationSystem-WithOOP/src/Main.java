public class Main
{
    public static void main(String[] args)
    {
        Teacher mathTeacher = new Teacher("Emir YIlMAZ","123456","matematik");
        Teacher physicsTeacher = new Teacher("Melisa ATEŞ", "654321", "fizik");
        Teacher chemicalTeacher = new Teacher("Sude TAŞKIRAN", "234156", "kimya");

        Course math = new Course("MATEMATİK KURSU", "MAT101", "matematik");
        Course physics = new Course("FİZİK KURSU", "FZK101", "fizik");
        Course chemical = new Course("KİMYA KURSU", "KMY101", "kimya");

        math.addTeacher(mathTeacher);
        physics.addTeacher(physicsTeacher);
        chemical.addTeacher(chemicalTeacher);

        Student student1=new Student("Fatma SÖNMEZ",1,"304",math,physics,chemical);
        Student student2=new Student("Beyhun YAMAN",4,"789",math,physics,chemical);
        Student student3=new Student("Nadide Çiçek",2,"976",math,physics,chemical);

        student1.addCheckExamNote(79,90,70);
        student1.addCheckQuizNote(90,100,85);
        student1.isPass();

        student2.addCheckExamNote(60,100,81);
        student2.addCheckQuizNote(71,77,90);
        student2.isPass();

        student3.addCheckExamNote(62,65,100);
        student3.addCheckQuizNote(90,84,88);
        student3.isPass();

    }
}