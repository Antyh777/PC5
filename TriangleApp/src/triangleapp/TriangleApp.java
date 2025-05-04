/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangleapp;

import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class TriangleApp {
    public static void main(String[] args) {
        // Pedir datos al usuario
        String baseStr = JOptionPane.showInputDialog("Ingrese la base del triángulo:");
        String heightStr = JOptionPane.showInputDialog("Ingrese la altura del triángulo:");

        // Convertir a double
        double base = Double.parseDouble(baseStr);
        double height = Double.parseDouble(heightStr);

        // Crear instancia de Triangle y usar colección
        Triangle triangle = new Triangle(base, height);
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(triangle);

        // Calcular área (con error)
        double area = triangle.calculateArea();

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
    }
}

