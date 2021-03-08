package tts1;

public class main
{

    public static void main(String[] args)
    {
        int a = 43;
        Integer b = 50;
        int c = a+b;
        System.out.println(c);
        
        Integer flag = b.compareTo(a);
        System.out.println(flag);
        
        char test = 'a';
        Character value = 'a';
        if (test == value || b < 4) {
            System.out.println("Same values");
            
        }
        
        String text = "Hello, ";
        String name = "Nicolas";
        
        System.out.println("\n\nMy name is "+name.toUpperCase() );
        System.out.println(text+name);

        

    }

}
