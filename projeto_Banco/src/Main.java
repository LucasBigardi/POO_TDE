import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        Menu menu = new Menu();

        while(exit) {
            System.out.println("Oque deseja fazer?");
            System.out.println(Menu.inicio());
            int opcao = sc.nextInt();
            if(opcao == 1){

            }
            else if(opcao == 2){
            }
            else if (opcao == 3){

            }
            else if (opcao == 4) {

            }
            else if (opcao == 5){

            }
            else if (opcao == 6){
                System.out.println("Até mais!");
                exit = false;
            }
            else {
                System.out.println("Opção invalidade, tente novamente!");
            }
        }
    }
}