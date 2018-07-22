package Reflection.HarvestingFields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        Field[] fields = RichSoilLand.class.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getModifiers());
        }


    }
}
