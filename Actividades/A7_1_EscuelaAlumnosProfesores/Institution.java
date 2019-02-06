

public class Institution
{
    private String name;
    private Student[]studentsList;
    private Teacher[]teachersList;  
    private int contTeachers;
    private int contStudents;
      
    private Institution()
    {
        //cambié el constructor a privado para no permitir
        //crear instituciones sin nombre
    }
    public Institution(String name)
    {
        this.name = name;
        contTeachers = 0;
        contStudents = 0;
        studentsList = new Student[100];
        teachersList = new Teacher[100];
    }

    //aquí hay asociación con Visitor
    public void receivesVisits(Visitor visitor)
    {
        visitor.visit(this);
    }

    public void print()
    {
        //detalles de la institución
    }

    //aquí hay agregación con Teacher
    // Teacher se guarda, pero no se crea
    public void hiresTeacher(Teacher theTeacher)
    {
        if(contTeachers <100)
            teachersList[contTeachers++] = theTeacher;
        else
            System.out.println("ya no hay espacio");
    }

    public int getNumberOfTeachers()
    {
        return contTeachers;
    }
    
    public void enrollStudent(Student theStudent)
    {
        if(contStudents < 100)
            studentsList[contStudents++] = theStudent;
        else  
            System.out.println("no hay espacio");
    }

    public String getInstName()
    {
        return name;
    }

    public void printTeachers()
    {
        for (int i = 0; i < contTeachers; i++) {
            System.out.println("teacher "+(i+1)+" "+teachersList[i].getName());            
        }
    }
    //métodos pendientes 
}