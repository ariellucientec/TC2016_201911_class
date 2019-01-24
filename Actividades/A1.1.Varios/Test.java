public class Test
{
    public static void main(String[]args)
    {
        Persona ariel = new Persona();
        ariel.setName("ariel");
        ariel.setGender('m');
        ariel.setAge(28);
        System.out.println(ariel.getName());

        Persona juan = new Persona();
        juan.setName("juan");
        juan.setGender('m');
        juan.setAge(38);
        System.out.println(ariel.getName());
    }
}