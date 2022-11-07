// Java program generate a random AlphaNumeric String
// using Math.random() method

import java.util.Arrays;
import java.util.Scanner;

public class RandomString {

    // function to generate a random string of length n
    static String getAlphaString(int n)
    {

// choose a Character random from this String
        String AlphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

// create StringBuffer size of AlphaString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

// generate a random number between 0 to AlphaString variable length
            int index = (int)(AlphaString.length() * Math.random());

// add Character one by one in end of sb
            sb.append(AlphaString.charAt(index));
        }

        return sb.toString();
    }
    static String symbols(int q)
    {

// choose a Character random from this String
        String Symbols = "!@#$%^&*()_+=-}[{]|:";

// create StringBuffer size of Symbols
        StringBuilder sb = new StringBuilder(q);

        for (int i = 0; i < q; i++) {

// generate a random number between
// 0 to Symbols variable length
            int index = (int)(Symbols.length() * Math.random());

// add Character one by one in end of sb
            sb.append(Symbols.charAt(index));
        }

        return sb.toString();
    }
    static String numbers(int m)
    {

// chose a Character random from this String
        String Numeric = "1234567890";

// create StringBuffer size of Numeric
        StringBuilder sb = new StringBuilder(m);

        for (int i = 0; i < m; i++) {

// generate a random number between
 // 0 to Numeric variable length
            int index = (int)(Numeric.length() * Math.random());

// add Character one by one in end of sb
            sb.append(Numeric.charAt(index));
        }

        return sb.toString();
    }



    public static void main(String[] args)
    {

// Get the size n
        int n ;
        System.out.println("Enter number of letters in passcode ");
        Scanner num = new  Scanner(System.in);
        n = num.nextInt();
// Get value of m
        int m ;
        System.out.println("Enter number of digits in passcode ");
        Scanner numeric = new  Scanner(System.in);
        m = numeric.nextInt();
// Get the value of q
        int q ;
        System.out.println("Enter number of symbols in passcode ");
        Scanner sym = new  Scanner(System.in);
        q = sym.nextInt();

        int con = n + m + q;

// Append the 3 functions and store in a new variable
        String password = (RandomString.getAlphaString(n) + RandomString.numbers(m) + RandomString.symbols(q));
// Create new StringBuffer size of new variable
        StringBuilder sans = new StringBuilder(con);

        for (int a = 0; a < con; a++) {

// generate a random number between 0 to the new variable's variable length
            int inde = (int)(password.length() * Math.random());

// add Character one by one in end of sans
            sans.append(password.charAt(inde));
        }
// Create array to store value of the other new variable and display it
        System.out.println(sans);
        int[] String = new int[con + 1];
        int w = String[con];
        StringBuilder[] mine = new StringBuilder[]{sans};
        System.out.println(Arrays.toString(mine));

    }
}
