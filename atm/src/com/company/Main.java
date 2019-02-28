package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("                   AAA         TTTTTTTTTTTTTTTTTTTTTTTMMMMMMMM               MMMMMMMM   " );
        System.out.println("                  A:::A        T:::::::::::::::::::::TM:::::::M             M:::::::M   " );
        System.out.println("                 A:::::A       T:::::::::::::::::::::TM::::::::M           M::::::::M   ");
        System.out.println("                A:::::::A      T:::::TT:::::::TT:::::TM:::::::::M         M:::::::::M   " );
        System.out.println("               A:::::::::A     TTTTTT  T:::::T  TTTTTTM::::::::::M       M::::::::::M   ");
        System.out.println("              A:::::A:::::A            T:::::T        M:::::::::::M     M:::::::::::M   " );
        System.out.println("             A:::::A A:::::A           T:::::T        M:::::::M::::M   M::::M:::::::M   ");
        System.out.println("            A:::::A   A:::::A          T:::::T        M::::::M M::::M M::::M M::::::M   ");
        System.out.println("           A:::::A     A:::::A         T:::::T        M::::::M  M::::M::::M  M::::::M   ");
        System.out.println("          A:::::AAAAAAAAA:::::A        T:::::T        M::::::M   M:::::::M   M::::::M   ");
        System.out.println("         A:::::::::::::::::::::A       T:::::T        M::::::M    M:::::M    M::::::M   ");
        System.out.println("        A:::::AAAAAAAAAAAAA:::::A      T:::::T        M::::::M     MMMMM     M::::::M   ");
        System.out.println("       A:::::A             A:::::A   TT:::::::TT      M::::::M               M::::::M   ");
        System.out.println("      A:::::A               A:::::A  T:::::::::T      M::::::M               M::::::M   ");
        System.out.println("     A:::::A                 A:::::A T:::::::::T      M::::::M               M::::::M   ");
        System.out.println("    AAAAAAA                   AAAAAAATTTTTTTTTTT      MMMMMMMM               MMMMMMMM   ");



        Conta c1 = new Conta("Christiano");
        Conta c2 = new Conta("Djeniffer");
        c1.depositar(5000);
        c1.getSaldo();


    }
}
