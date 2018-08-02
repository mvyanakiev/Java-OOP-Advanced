package DesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ShapeFactory shapeFactory = new ShapeFactory();

        String command = reader.readLine();

        Shape newShape = shapeFactory.getShape(command);
        newShape.draw();





//        Shape shape1 = shapeFactory.getShape("circle");
//        shape1.draw();
//
//        Shape shape2 = shapeFactory.getShape("Square");
//        shape2.draw();
//
//        Shape shape3 = new Rectangle();
//        shape3.draw();


    }
}
