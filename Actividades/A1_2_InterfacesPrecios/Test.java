public class Test
{
    public static void main(String[] args) 
    {
        Car carro1 = new Car("advanced");
        Car carro2 = new Car("standard");
        House house1 = new House(4);

        System.out.println(house1.isMoreExpensive(carro1));        
    }
}