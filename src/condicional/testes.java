package condicional;

import java.util.Scanner;

public class testes {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int pass = 838923;
        String password;
        System.out.println("Digite sua senha :");
        password = sc.next();
        for (int i = 0; i < password.length();i++){
            if(password.charAt(i) != '0' || password.charAt(i) != '1' ||
            password.charAt(i) != '2' || password.charAt(i) != '3' ||
            password.charAt(i) != '4' || password.charAt(i) != '5' ||
            password.charAt(i) != '6' || password.charAt(i) != '7' ||
            password.charAt(i) != '8' || password.charAt(i) != '9'){

            }
        }


    }
}
