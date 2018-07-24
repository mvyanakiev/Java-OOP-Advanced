package Reflection.BlackBoxInteger;

import Reflection.BlackBoxInteger.com.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    private static final String className = "BlackBoxInt";
    private static final String classPath = "Reflection.BlackBoxInteger.com.";


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BlackBoxInt blackBoxInt;


        String[] command = reader.readLine().split("_");
//
//        Class<BlackBoxInt> aClass = BlackBoxInt.class;
//        BlackBoxInt ref = aClass.getDeclaredConstructor().newInstance();




        while (!"END".equals(command[0])) {

            int digit = Integer.parseInt(command[1]);

            switch (command[0]) {

                case "add":


                    break;


            }


            command = reader.readLine().split("_");
        }


    }

}
