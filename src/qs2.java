import java.io.*;

public class qs2 {

    public static void main(String[] args) {

        try {

            FileReader fr1 = new FileReader("expression.txt");
            BufferedReader reader = new BufferedReader(fr1);
            String exp = reader.readLine();
            reader.close();

            FileWriter f = new FileWriter("cubeOutput.txt");
            BufferedWriter writer = new BufferedWriter(f);
            int res;
            int cube;

            if(exp.contains("+")) {

                String[] parts = exp.split("\\+");

                String part1 = parts[0];
                int num1 = Integer.parseInt(part1);

                String part2 = parts[1];
                int num2 = Integer.parseInt(part2);

                res = num1 + num2;
                cube = res*res*res;
                writer.write(String.valueOf(cube));
                writer.close();
            }
            else if(exp.contains("-")) {

                String[] parts = exp.split("-");

                String part1 = parts[0];
                int num1 = Integer.parseInt(part1);

                String part2 = parts[1];
                int num2 = Integer.parseInt(part2);

                res = num1 - num2;
                cube = res*res*res;
                writer.write(String.valueOf(cube));
                writer.close();
            }
            else if(exp.contains("*")) {

                String[] parts = exp.split("\\*");

                String part1 = parts[0];
                int num1 = Integer.parseInt(part1);

                String part2 = parts[1];
                int num2 = Integer.parseInt(part2);

                res = num1*num2;
                cube = res*res*res;
                writer.write(String.valueOf(cube));
                writer.close();
            }
            else if(exp.contains("/")) {

                String[] parts = exp.split("/");

                String part1 = parts[0];
                int num1 = Integer.parseInt(part1);

                String part2 = parts[1];
                int num2 = Integer.parseInt(part2);

                res = num1/ num2;
                cube = res*res*res;
                writer.write(String.valueOf(cube));
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
