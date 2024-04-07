package FlyweightDesignPattern;

    public class Main {

            public static void main(String[] args){

                ILetter obj1 = LetterFactory.createLetter('t');
                obj1.display(0,0);

                ILetter obj2 = LetterFactory.createLetter('t');
                obj2.display(1,0);
            }
}