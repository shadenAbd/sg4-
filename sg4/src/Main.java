import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Hello world!");

        Dice dice=new Dice();
        dice.throw1000Times();
        dice.showResults();*/

       /*Program program=new Program();
       String s1= "hello      this  is    shaden";
       System.out.print(Program.reverseWords(s1));*/


        Set set= new Set();

        System.out.println(set.add(10));
        System.out.println(set.add(1));
        System.out.println(set.add(2));
        System.out.println(set.add(4));
        System.out.println(set.add(7));
        System.out.println(set.add(12));
        System.out.println(set.add(20));
        System.out.println(set.add(-1));
        System.out.println(set.add(9));

        set.show();

        System.out.println("is the set full? "+set.isFull());
        System.out.println("is the set empty? "+set.isEmpty());
        set.remove(1);


        set.show();
        System.out.println(set.add(19));
        set.show();
        System.out.println(set.add(17));
        set.show();
        System.out.println(set.add(14));
        set.show();
        set.remove(12);
        set.show();
        System.out.println("is the set full? "+set.isFull());
        //Set set1= new Set();
       // System.out.println("is the set empty? "+set1.isEmpty());

        String s="this is  the solution";


        Program program=new Program();
       String s1= "hello       this       is        shaden";
        String string1="";
        String string2=" ";
       System.out.println(Program.reverseWords(s1));
        System.out.println(Program.countWords(s1));
        System.out.println(Program.countWords(string1));
        System.out.println(Program.countWords(string2));



    }
}