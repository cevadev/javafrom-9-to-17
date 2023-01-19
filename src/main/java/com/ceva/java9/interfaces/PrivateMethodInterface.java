package com.ceva.java9.interfaces;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public interface PrivateMethodInterface {
    default void method1(){
        System.out.println("In method 1");
        try {
            // invocamos al private method
            utilResource();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    default  void method2(){
        System.out.println("In method 2");
        try {
            // invocamos al private method
            utilResource();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    /**
     * Los metodos privados son una caracteristica de Java 9
     * Los metodos privados permiten reducir la redundancia y hacen del codigo comun mas seguro. Nos permiten
     * compartir codigo comun entre metodos default o static
     * Los metodos privados tambien pueden ser declarados como static con la ventaja que este metodo privado static
     * puede ser llamado por default method static y default method no static
     */
    private void utilResource()throws IOException{
        System.out.println("Reading common resources");
        BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("data.txt"), "UTF-8"));
        String line = br.readLine();
        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
