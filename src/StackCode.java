import java.util.Scanner;
import java.util.Stack;
public class StackCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       /* Stack <Character> s1 = new Stack<>();

       // System.out.println(s1.peek());
        if(s1.isEmpty())
            System.out.println("null");
        s1.push('a');
        System.out.print(s1.peek());
        s1.push('+');
        System.out.print(s1.peek());
        s1.push('1');
        System.out.print(s1.peek());
        s1.push('(');
        System.out.print(s1.peek());
        s1.push('e');
        System.out.println(s1.peek());


       /* System.out.println("Initial Stack: " + s1);
        System.out.println("pop");
        //System.out.println("Popped element: "
             //   + s1.pop());
        System.out.println(s1.peek());
        String news = "y";
        System.out.println("Popped element: "
                + s1.pop());
        news = news+s1.peek(); System.out.println(news);;
        s1.pop();news = news+s1.peek();System.out.println(news);
        s1.pop();news = news+s1.peek();System.out.println(news);
        s1.pop();
        System.out.println("Initial Stack: " + s1);*/



       /* String infix = sc.nextLine();
        String postfix = "";
        for (int i = 0; i < infix.length(); i++){
            System.out.println(infix.charAt(i));     //concatenate string
            postfix=postfix+infix.charAt(i);
            System.out.println(postfix);
        }*/

        String str1 ="(((z-y*x)^2^u)-2)/2/7-x^8-d/(y-z^x*4-(9-x))";
        String rev ="";

        for(int i= str1.length()-1;i>=0 ;i --){

            char ch = str1.charAt(i);

            if (ch== '(')
                rev = rev + ')';
            else if (ch == ')')
                rev = rev + '(';
            else
                rev = rev + ch;
        }

        System.out.println(str1);
        System.out.println(rev);


    }

}