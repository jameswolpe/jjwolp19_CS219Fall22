// by convention, class names are capitalized.
public class HelloWorld {
    /*
        This is a multiline block comment.
        Another comment line.
     */

    public static void main(String [] args) {
        System.out.println("Hello World");
        String s = "hippopotomonstrosesquippedaliophobia";
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('q'));
        System.out.println(s.indexOf('o'));
        System.out.println(s.substring(s.indexOf('m'),16));


        int x = 5;
        boolean z = true;
        double pi = 3.14159;
        String name = "CS219 Techniques of C0mputer Science";
        double avagadros = 6.022140857e23; //Scientific notation
        double electron_mass = 9.1093837015e-31;


    }
}
