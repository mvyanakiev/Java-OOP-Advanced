package Reflection.BlackBoxInteger;

import Reflection.BlackBoxInteger.com.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    private static final String className = "BlackBoxInt";
    private static final String classPath = "Reflection.BlackBoxInteger.com.";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BlackBoxInt blackBoxInt;
        try {
            Class<?> blackBoxIntClass = Class.forName(classPath + className); // making class
            Constructor<?> declaredConstructor = blackBoxIntClass.getDeclaredConstructor(); // making constructor
            declaredConstructor.setAccessible(true); // unlocking
            blackBoxInt = (BlackBoxInt) declaredConstructor.newInstance(); // casting & making instance;

            String line;
            while (true) {
                if ("END".equals(line = reader.readLine())) {
                    break;
                }

                String[] tokens = line.split("_");

                Method declaredMethod = blackBoxInt.getClass().getDeclaredMethod(tokens[0], int.class); // getting method
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(blackBoxInt, Integer.parseInt(tokens[1]));

                Field field = blackBoxInt.getClass().getDeclaredField("innerValue"); //getting field
                field.setAccessible(true);
                System.out.println(field.get(blackBoxInt));
            }

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
