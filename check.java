import java.util.Scanner;

public class check{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Enter Details :- ");
        String name = sc.nextLine();
        String pass = sc.nextLine();
        System.out.println(name + " : " + pass);
    }
}