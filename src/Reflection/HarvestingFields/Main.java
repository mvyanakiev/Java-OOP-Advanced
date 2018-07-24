package Reflection.HarvestingFields;

import java.lang.reflect.Field;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = reader.readLine();

        while (!"HARVEST".equals(command)) {
            Field[] fields = RichSoilLand.class.getDeclaredFields();

            switch (command) {
                case "protected":
                    for (Field field : fields) {
                        if (field.getModifiers() == 4) {
                            System.out.println(withWords(4) + " " + field.getType().getSimpleName() + " " + field.getName());
                        }
                    }
                    break;

                case "private":
                    for (Field field : fields) {
                        if (field.getModifiers() == 2) {
                            System.out.println(withWords(2) + " " + field.getType().getSimpleName() + " " + field.getName());
                        }
                    }
                    break;

                case "public":
                    for (Field field : fields) {
                        if (field.getModifiers() == 1) {
                            System.out.println(withWords(1) + " " + field.getType().getSimpleName() + " " + field.getName());
                        }
                    }
                    break;

                case "all":
                    for (Field field : fields) {
                        System.out.println(withWords(field.getModifiers()) + " " + field.getType().getSimpleName() + " " + field.getName());
                    }
                    break;
            }

            command = reader.readLine();
        }
    }

    private static String withWords(int type) {
        switch (type) {
            case 4:
                return "protected";

            case 2:
                return "private";

            case 1:
                return "public";
        }
        return null;
    }
}
