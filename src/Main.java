import java.util.Scanner;

public class Main {
    public static int menu()
    {
        System.out.println("Selctionnez un choix [1-5]");
        System.out.println("1. Saisir un mot");
        System.out.println("2. Afficher un mot");
        System.out.println("3. Inverser un mot");
        System.out.println("4. Verifier si un mot est palindrome");
        System.out.println("5. Quitter l'application");
        int choix;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Votre Choix :");
            choix=sc.nextInt();

        }while(choix<1||choix>5);
        return choix;
    }
    public static void main(String[] args) {
        int choice;
        Word w1=new Word();

        do {
            choice=menu();
        //instantiation d'un objet de type Word

            switch (choice) {
                case 1:
                    w1.getWord();
                    break;
                case 2:
                    w1.show();
                    break;
                case 3:
                    w1.inverse();
                    System.out.println("après inversion :");
                    w1.show();
                    break;
                case 4:
                    boolean res = w1.isPlaindromV1();
                    if (res)
                        System.out.println("Le mot est palaindrome.");
                    else
                        System.out.println("Le mot n'est pas plaindrome.");
                    break;
                default:
                    System.exit(0);
            }
        }while(choice!=5);

    }
}