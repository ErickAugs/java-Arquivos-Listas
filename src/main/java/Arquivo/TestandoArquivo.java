package Arquivo;

import java.io.*;

public class TestandoArquivo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("lorem.txt");

        BufferedReader br = new BufferedReader(fileReader);
        String line = br.readLine();

        while(line !=null){
            System.out.println(line);
            line = br.readLine();
        }

        br.close();
    }

}
