import java.io.*;


public class qs1 {

    public static void main(String[] args) {

        try {

            FileReader fr1 = new FileReader("C:in.txt");
            BufferedReader reader = new BufferedReader(fr1);
            String num = reader.readLine();
            reader.close();

            String[] parts = num.split(" ");

            String part1 = parts[0];
            int num1 = Integer.parseInt(part1);
            String part2 = parts[1];
            int num2 = Integer.parseInt(part2);


            FileReader fr2 = new FileReader("Op.txt");
            BufferedReader read2 = new BufferedReader(fr2);
            String op = read2.readLine();
            read2.close();


            FileWriter f = new FileWriter("Out.txt");
            BufferedWriter writer = new BufferedWriter(f);

            int res ;

            if(op.equals("+")) {
               res = num1 + num2;
                writer.write(String.valueOf(res));
                writer.close();
            }
            else if(op.equals("-")) {
             res = num1 - num2;
                writer.write(String.valueOf(res));
                writer.close();
            }
            else if(op.equals("*")) {
              res = num1 * num2;
                writer.write(String.valueOf(res));
                writer.close();
            }
            else if(op.equals("/")) {
             res = num1 / num2;
                writer.write(String.valueOf(res));
                writer.close();
            }
            else
                System.out.println("wrong operator input");


        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

}
