import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Conversion {


    static String prefix(String str ){

        Stack<Character> s1 = new Stack<>();

        String operator = "+-*/^()";
        String rev = reverse(str);
        String prefix = "";
        for (int i = 0; i < rev.length(); i++){

            char ch = rev.charAt(i);

            if(operator.contains(Character.toString(ch)))
            {

                if (ch == ')') {
                    s1.push(ch);
                }
                else if(ch == '(')
                {
                    while(s1.peek()!= ')')
                        prefix = prefix + s1.pop();
                    s1.pop();
                }
                else  if (ch == '^'){
                    while (!s1.isEmpty() && (precedence(ch) == precedence(s1.peek()))) {
                        prefix = prefix + s1.pop();
                    }
                    s1.push(ch);
                }
                else {
                    while (!s1.isEmpty() && (precedence(ch) < precedence(s1.peek())))
                        prefix = prefix + s1.pop();

                    s1.push(ch);
                }


            }
            else
                prefix = prefix + ch;

        }
        while(!s1.isEmpty()){

            prefix = prefix + s1.peek();
            s1.pop();
        }
        String F_prefix = reverse(prefix);

        return F_prefix;
    }



    static String postfix(String str ){

        Stack<Character> s1 = new Stack<>();

        String operator = "+-*/^()";
        String postfix = "";
        for (int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(operator.contains(Character.toString(ch)))
            {

                if (ch == '(')
                    s1.push(ch);
                else if(ch == ')')
                {
                    while(s1.peek()!= '(') {
                        postfix = postfix + s1.pop();
                    }
                    s1.pop();
                }
              else  if (ch == '^')
                s1.push(ch);
                else {
                    while (!s1.isEmpty() && (precedence(ch) <= precedence(s1.peek()))) {
                        postfix = postfix + s1.pop();
                    }
                    s1.push(ch);
                }
            }
            else
                postfix  = postfix  + ch;
        }

        while(!s1.isEmpty()){

            postfix  = postfix + s1.pop();

        }
       return postfix ;
    }

    static String reverse (String str1){

        String rev ="";

        for(int i= str1.length()-1;i>=0 ;i --){

            char ch = str1.charAt(i);
                rev = rev + ch;
        }

        return rev;
    }



    static  int precedence(char ch){

        if(ch == '+' || ch =='-')
            return 1;
        else if(ch == '*' || ch =='/')
            return 2;
       else if(ch == '^')
           return 3;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Choice:\nconsole\nfile\nexit\n");
        String input = sc.nextLine();

        if(input.equals("console")){

            System.out.println("Enter the infix expression:");
            String infix = sc.nextLine();
            System.out.println("Enter your choice:\nprefix\npostfix");
            String choice = sc.nextLine();

            if(choice.equals("prefix")){

                String prefix = prefix(infix);
                System.out.println(prefix);

            }
            else if(choice.equals("postfix")){

               String postfix = postfix(infix);
                System.out.println(postfix);
            }
            else
                System.out.println("Wrong input");



        }
        else if(input.equals("file")){

            System.out.println("Enter the file path:");
            String path = sc.nextLine();

            try {
                FileReader fw = new FileReader(path);
                BufferedReader reader = new BufferedReader(fw);
                String infix = reader.readLine();
                reader.close();

                System.out.println("Enter your choice:\nprefix\npostfix");
                String choice = sc.nextLine();


                FileWriter f = new FileWriter(path,true);
                BufferedWriter writer = new BufferedWriter(f);


                if(choice.equals("prefix")){

                    String prefix = prefix(infix);
                    writer.newLine();
                    writer.write(prefix);
                    writer.close();

                }
                else if(choice.equals("postfix")){

                    String postfix = postfix(infix);
                    writer.newLine();
                    writer.write(postfix);
                    writer.close();
                }
                else
                    System.out.println("Wrong input");

            }
            catch(IOException e){
                e.printStackTrace();
            }

        }
        else if(input.equals("exit")){

            System.out.println("Conversion terminated");
            System.exit(0);
        }
        else
            System.out.println("Wrong input");

    }
}

