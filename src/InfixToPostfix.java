import java.util.Scanner;
import java.util.Stack;


// ACTUALLY  PREFIX  CODE


public class InfixToPostfix {

    static  int precedence(char ch){

        if(ch == '+' || ch =='-')
            return 1;
        else if(ch == '*' || ch =='/')
            return 2;
        else if(ch == '^')
            return 3;
        return 0;
    }

    static String reverse (String str1){

        String rev ="";

        for(int i= str1.length()-1;i>=0 ;i --){

            char ch = str1.charAt(i);

            /*if (ch== '(') {
                ch = ')';
                rev = rev + ch;
            }
            else if (ch == ')') {
                ch = '(';
                rev = rev + ch;
            }
            else*/
                rev = rev + ch;
        }

        return rev;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Character> s1 = new Stack<>();

        String operator = "+-*/^()";
        String infi = sc.nextLine();
        String infix = reverse(infi);
       // String conv_rev = convert(reverse);
        //String prefix = reverse(conv_rev);
       // System.out.println(prefix);
        String postfix = "";
        for (int i = 0; i < infix.length(); i++){

            char ch = infix.charAt(i);

            if(operator.contains(Character.toString(ch)))
            {

               if (ch == ')') {
                   s1.push(ch);
               }
               else if(ch == '(')
               {
                   while(s1.peek()!= ')')
                       postfix = postfix + s1.pop();
                   s1.pop();                               //((precedence(ch)  == precedence(s1.peek())) &&  )
               }
               else  if (ch == '^'){
                   while (!s1.isEmpty() && (precedence(ch) == precedence(s1.peek()))) {
                       postfix = postfix + s1.pop();
                   }
                   s1.push(ch);
               }
               else {
                   while (!s1.isEmpty() && (precedence(ch) < precedence(s1.peek())))
                       postfix = postfix + s1.pop();

                   s1.push(ch);
               }


            }
            else
                postfix = postfix + ch;

    }
        while(!s1.isEmpty()){

            postfix = postfix + s1.peek();
            s1.pop();
        }
        String postfi = reverse(postfix);
        System.out.println(postfi);





    }
}
// a+b*(u/1)-t