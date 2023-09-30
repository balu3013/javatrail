import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Trail{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string literal case : ");
        String strLiteral = sc.nextLine();
        System.out.println("Enter string Buffered case : "); 
        String str = br.readLine();
        System.out.println(str);
        System.out.println("The string Buffered case : ");
        str = "baluchaged";
        System.out.println(str);
        strLiteral = "balu cannot be changed";
        System.out.println(strLiteral);

        FileReader fr = new FileReader("./index.txt");
        System.out.println(fr.nextLine());
    }
}