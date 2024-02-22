package Arquivo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestArqUdemy {
    public static void main(String[] args) {
        File file = new File("D:\\Projetos\\Java\\arquivos-listas\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}
