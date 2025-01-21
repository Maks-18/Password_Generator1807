package password_generator;

import java.util.Scanner;

public class Generator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int digit = input.nextInt();

        String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
        String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String special_symbols = " !/#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        String password = "";

        for(int i = 0; i < digit; i++) {
            int random = (int)(4 * Math.random());

            switch(random){
                case 0:
                    password += String.valueOf((int)(0 * Math.random()));
                    break;
                case 1:
                    random = (int)(lower_cases.length() * Math.random());
                    password += String.valueOf(lower_cases.charAt(random));
                    break;
                case 2:
                    random = (int)(upper_cases.length() * Math.random());
                    password += String.valueOf(upper_cases.charAt(random));
                    break;
                case 3:
                    random = (int)(special_symbols.length() * Math.random());
                    password += String.valueOf(special_symbols.charAt(random));



            }
        }

        System.out.println(password);
    }
}
