import java.io.*;

public class File {

    public static void main(String[] args) {


        try {
            FileReader fw = new FileReader("C:\\Users\\User\\Desktop\\Assignment 3\\in.txt"); // C:\\Users\\User\\Desktop\\Assignment 3\\in.txt
            BufferedReader reader = new BufferedReader(fw);
            String s1 = reader.readLine();
            reader.close();
            System.out.println(s1);

            FileWriter f = new FileWriter("C:\\Users\\User\\Desktop\\Assignment 3\\in.txt",true);
            BufferedWriter writer = new BufferedWriter(f);
            //writer.newLine();
            writer.write(" soymee");

            writer.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }

       /* try {

            FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\Assignment 3\\out.txt",true);
            BufferedWriter writer = new BufferedWriter(fw);
            //writer.newLine();
            writer.write(" ami");

            writer.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }

        try {

            FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\Assignment 3\\out.txt",false);
            BufferedWriter writer = new BufferedWriter(fw);
            //writer.newLine();
            writer.write(" soymee");

            writer.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }*/


        String news = "";
        System.out.println(news);
        char c = 'y';
        news = news+c;
        System.out.println(news);
        char c1 = 'z';
        news = news+c1;
        System.out.println(news);
        String new2= "new2";
        news = new2+news;
        System.out.println(news);
        news = news+new2;
        System.out.println(news);

    }
}

