public class Test
{
    public static void main(String[] args) {
        
        Animal[] arr = new Animal[3];

        Bird birdy = new Bird(); // static binding
        Animal tweety = new Bird(); // dynamic binding

        arr[0] = birdy;
        arr[1] = tweety;
        arr[2] = new Bear();

        arr[1].sing("canción");
        tweety.sing("sksk");

        Bear b = (Bear)tweety;

        tweety = (Bear)tweety;

        if (tweety instanceof Bird )
            ((Bird)tweety).sing("canción");
        /*else
            tweety.doHisStuff();
        */
        birdy.eat();
        tweety.eat();
        
        
        
    }
}